package memory

import screeps.api.CreepMemory
import screeps.utils.memory.memory
import screeps.utils.unsafe.jsObject
import kotlin.test.*

/**
 * This test shows how to save a nested structure of objects into screeps' Memory
 *
 * Unfortunately there is one big caveat:
 * We *must not* save Kotlin classes to memory, because names of fields will get mangled
 * (read more about why here: https://discuss.kotlinlang.org/t/mandatory-method-mangling-when-compiling-to-js/7644/2 )
 *
 * So we only use external interfaces, that are instantiated with the `jsObject` helper function
 * The only problem we have with `jsObject` is that there can be no compile-time checks that ensure all of the
 * fields of of the created object will be initialized by the programmer. So you should always use nullable fields
 *
 * We may include Arrays in our external interface because they are compiled to actual js arrays
 *
 * https://kotlinlang.org/docs/reference/js-interop.html#external-interfaces
 * https://kotlinlang.org/docs/reference/js-to-kotlin-interop.html#representing-kotlin-types-in-javascript
 */

private external interface Person {
    var name: String?
    var age: Int // non nullable type here is dangerous because we could forget initialization
}

private external interface Kangaroo {
    var belly: Person?
    var name: String
    var friends: Array<Person>?
}

class TestObjects {

    private var CreepMemory.person: Person? by memory()

    @Test
    @JsName("saveAndRestoreNullableObject")
    fun `save and restore a nullable object`() {

        val memory = js("{}").unsafeCast<CreepMemory>()

        memory.person = jsObject<Person> {
            name = "Max Muster"
            age = 53
        }
        assertEquals(53, memory.person?.age)

        val parsed = JSON.parse<CreepMemory>(JSON.stringify(memory))
        assertNotNull(parsed.person)
        assertEquals(53, parsed.person?.age)
        assertEquals("Max Muster", parsed.person?.name)
    }

    private var CreepMemory.nonNullPerson: Person by memory {
        jsObject<Person> {
            name = "Max Muster"
            age = 53
        }
    }

    @Test
    @JsName("saveAndRestoreObject")
    fun `save and restore an object`() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        assertNotNull(memory.nonNullPerson)
        assertNotNull(memory.nonNullPerson.name)
        assertNotNull(memory.nonNullPerson.age)
        assertEquals(53, memory.nonNullPerson.age)

        memory.nonNullPerson.age = 54
        assertEquals(54, memory.nonNullPerson.age)

        val parsed = JSON.parse<CreepMemory>(JSON.stringify(memory))
        assertNotNull(parsed.nonNullPerson)
        assertEquals(54, parsed.nonNullPerson.age)
        assertEquals("Max Muster", parsed.nonNullPerson.name)
    }


    private var CreepMemory.kangaroo: Kangaroo by memory {
        jsObject<Kangaroo> {
            name = "Kang"
        }
    }

    @Test
    fun nestedObjects() {

        val memory = js("{}").unsafeCast<CreepMemory>()
        assertNotNull(memory.kangaroo)
        assertNull(memory.kangaroo.belly)

        memory.kangaroo.belly = jsObject<Person> {
            name = "Peter Parker"
            age = 17
        }
        assertNotNull(memory.kangaroo.belly)
        assertEquals(17, memory.kangaroo.belly?.age)
        assertEquals("Peter Parker", memory.kangaroo.belly?.name)

        JSON.parse<CreepMemory>(JSON.stringify(memory)).let { parsed ->
            assertNotNull(parsed.kangaroo.belly)
            assertEquals(17, parsed.kangaroo.belly?.age, "age not correct after deserialization")
            assertEquals("Peter Parker", parsed.kangaroo.belly?.name, "name not correct after deserialization")
        }
    }

    @Test
    fun objectWithArrayTest() {
        val memory = js("{}").unsafeCast<CreepMemory>()

        assertNull(memory.kangaroo.friends)
        memory.kangaroo.friends = arrayOf(jsObject { age = 1 }, jsObject { age = 5 })
        assertEquals(2, memory.kangaroo.friends?.size)

        JSON.parse<CreepMemory>(JSON.stringify(memory)).let { parsed ->
            assertEquals(2, parsed.kangaroo.friends?.size)
            assertEquals(1, parsed.kangaroo.friends?.first()?.age)
            assertEquals(5, parsed.kangaroo.friends?.drop(1)?.first()?.age)
        }
    }


    /**
     * This test demonstrates why Kotlin classes won't work because of name mangling
     */
    @Ignore
    @Test
    fun anonymousClass() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        assertNotNull(memory.kangaroo)
        assertNull(memory.kangaroo.belly)

        memory.kangaroo.belly = object : Person {
            override var name: String? = "Peter Parker"
            override var age = 17
        }

        assertNotNull(memory.kangaroo.belly)
        assertEquals(17, memory.kangaroo.belly?.age)
        assertEquals("Peter Parker", memory.kangaroo.belly?.name)

        val stringyfied = JSON.stringify(memory)
        println(stringyfied)
        val parsed = JSON.parse<CreepMemory>(stringyfied)
        println(parsed)
        println(js("Object.keys(parsed)"))
        println(js("Object.keys(parsed['kangaroo'])"))
        println(js("Object.keys(parsed['kangaroo']['belly'])"))

        // this will fail because names of Kotlin class fields are mangled
        assertNotNull(parsed.kangaroo.belly)
        assertEquals(17, parsed.kangaroo.belly?.age)
        assertEquals("Peter Parker", parsed.kangaroo.belly?.name)
    }

}
