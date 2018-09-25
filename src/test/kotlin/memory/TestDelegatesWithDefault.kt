import screeps.api.CreepMemory
import screeps.api.SearchOptions
import screeps.utils.jsObject
import screeps.utils.memory.memoryOrDefault
import kotlin.test.Test
import kotlin.test.assertEquals


class TestDelegatesWithDefault {

    var CreepMemory.priority: Int by memoryOrDefault(0)
    var CreepMemory.options: SearchOptions by memoryOrDefault(jsObject<SearchOptions> {
        maxCost = 10
    })

    private enum class Color {
        RED, GREEN
    }

    private var CreepMemory.color by memoryOrDefault(Color.GREEN)

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
}