import screeps.api.CreepMemory
import screeps.api.SearchOptions
import screeps.api.options
import screeps.utils.memory.memory
import kotlin.test.Test
import kotlin.test.assertEquals


class DelegatesWithDefaultTest {

    var CreepMemory.priority: Int by memory { 0 }
    var CreepMemory.color by memory(Color.GREEN)
    var CreepMemory.options: SearchOptions by memory {
        options<SearchOptions> {
            maxCost = 10
        }
    }

    @Test
    fun testDefaultValue() {
        val memory = js("{}").unsafeCast<CreepMemory>()

        assertEquals(Color.GREEN, memory.color)
        assertEquals(0, memory.priority)
    }

    @Test
    fun testEnum() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        memory.color = Color.RED
        assertEquals(Color.RED, memory.color)

        val parsed = JSON.parse<CreepMemory>(JSON.stringify(memory))
        assertEquals(Color.RED, parsed.color)

    }

    @Test
    fun testWrite() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        memory.priority = 15
        assertEquals(15, memory.priority)

        val parsed = JSON.parse<CreepMemory>(JSON.stringify(memory))
        assertEquals(15, parsed.priority)
    }

    @Test
    fun modifyDefaultObject() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        memory.options.flee = true
        assertEquals(true, memory.options.flee, "modifications on default object should work")
        assertEquals(10, memory.options.maxCost)

        val parsed = JSON.parse<CreepMemory>(JSON.stringify(memory))
        assertEquals(true, parsed.options.flee, "modification should still be present after deserialisation")
        assertEquals(10, parsed.options.maxCost)
    }

    @Test
    fun defaultValueIsNotShared() {
        val foo = js("{}").unsafeCast<CreepMemory>()
        val bar = js("{}").unsafeCast<CreepMemory>()

        foo.options.maxCost = 1
        bar.options.maxCost = 2
        assertEquals(1, foo.options.maxCost, "foo should be unnaffected by bar")
        assertEquals(2, bar.options.maxCost, "bar should be unacffected by foo")
    }

    enum class Color {
        RED, GREEN
    }

}