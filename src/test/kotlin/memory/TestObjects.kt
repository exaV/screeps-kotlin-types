package memory

import screeps.api.CreepMemory
import screeps.utils.memory.memory
import screeps.utils.unsafe.jsObject
import kotlin.test.*

private external interface Person {
    var name: String
    var age: Int
}

private external interface Kangaroo {
    var belly: Person?
    var name: String
}

private class NicePerson {
    @JsName("name")
    var name: String = "bla"
    @JsName("age")
    var age: Int = 5
}


class TestObjects {
    private var CreepMemory.person: Person? by memory()
    private var CreepMemory.nicePerson: NicePerson? by memory()

    private var CreepMemory.nonNullPerson: Person by memory {
        jsObject<Person> {
            name = "Max Muster"
            age = 53
        }
    }
    private var CreepMemory.kangaroo: Kangaroo by memory {
        jsObject<Kangaroo> {
            name = "Kang"
        }
    }


    @Test
    fun nullableObject() {

        val memory = js("{}").unsafeCast<CreepMemory>()
        assertNull(memory.person)
        assertNull(memory.person?.name)
        assertNull(memory.person?.age)

//        memory.person = object : Person {
//            override var name = "Max Muster"
//            override var age = 53
//        }
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

    @Test
    fun testNonNullableObject() {
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


    @Test
    fun testNestedObjects() {
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


        memory.kangaroo.belly = jsObject<Person> {
            name = "Peter Parker"
        }
        JSON.parse<CreepMemory>(JSON.stringify(memory)).let { parsed ->
            assertNotNull(memory.kangaroo.belly)
            assertEquals("Peter Parker", parsed.kangaroo.belly?.name)
        }
    }


    @Ignore
    @Test
    fun anonymousClass() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        assertNotNull(memory.kangaroo)
        assertNull(memory.kangaroo.belly)

        memory.kangaroo.belly = object : Person {
            override var name = "Peter Parker"
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

    @Test
    fun anonymousClassPlainKotlin() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        assertNotNull(memory.kangaroo)
        assertNull(memory.kangaroo.belly)

        memory.nicePerson = NicePerson().apply {
            name = "Peter Parker"
            age = 17
        }

        assertEquals(17, memory.nicePerson?.age)
        assertEquals("Peter Parker", memory.nicePerson?.name)

        val stringyfied = JSON.stringify(memory)
        println(stringyfied)
        val parsed = JSON.parse<CreepMemory>(stringyfied)
        println(parsed)

        println(js("Object.keys(parsed)"))
        println(js("Object.keys(parsed['nicePerson'])"))

        assertEquals(17, parsed.nicePerson?.age)
        assertEquals("Peter Parker", parsed.nicePerson?.name)
        assertEquals(memory.nicePerson, NicePerson().apply {
            name = "Peter Parker"
            age = 17
        })
        assertEquals(NicePerson().apply {
            name = "Peter Parker"
            age = 17
        }, memory.nicePerson)


    }


}
