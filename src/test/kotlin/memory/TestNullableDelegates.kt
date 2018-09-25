import screeps.api.CreepMemory
import screeps.api.Record
import screeps.api.SearchOptions
import screeps.api.get
import screeps.utils.contains
import screeps.utils.jsObject
import screeps.utils.memory.memory
import kotlin.test.*


class TestNullableDelegates {

    var CreepMemory.priority by memory<Int>()
    var CreepMemory.message by memory<String>()
    var CreepMemory.options by memory<SearchOptions>()

    @Test
    fun testNullableMemory() {


        val memory = js(
            """
            {
                "priority" : 13
            }
        """
        ).unsafeCast<CreepMemory>()


        assertEquals(13, memory.priority)
        assertNull(memory.message)

        assertTrue { memory.unsafeCast<Record<String, String>>().contains("message") }

        memory.message = "Hello"

        assertEquals("Hello", memory.message)
        assertEquals("Hello", memory.unsafeCast<Record<String, String>>()["message"])

        val parsed = JSON.parse<CreepMemory>(JSON.stringify(memory))

        assertEquals("Hello", parsed.message)
        assertEquals("Hello", parsed.unsafeCast<Record<String, String>>()["message"])

    }

    @Test
    fun testObject() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        assertNull(memory.options)
        assertNull(memory.options?.maxCost)

        memory.options = jsObject<SearchOptions> {
            maxCost = 15
        }

        assertEquals(15, memory.options?.maxCost)

        val parsed = JSON.parse<CreepMemory>(JSON.stringify(memory))

        assertNotNull(memory.options)
        assertEquals(15, parsed.options?.maxCost)
    }

}