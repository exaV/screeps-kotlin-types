import screeps.api.CreepMemory
import screeps.utils.memory.memoryOrDefault
import kotlin.test.Test
import kotlin.test.assertEquals


class TestDelegatesWithDefault {

    var CreepMemory.priority by memoryOrDefault(0)

    enum class Color {
        RED, GREEN
    }

    var CreepMemory.color by memoryOrDefault(Color.GREEN)

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
    }

    @Test
    fun testWrite() {
        val memory = js("{}").unsafeCast<CreepMemory>()
        memory.priority = 15

        assertEquals(15, memory.priority)
    }
}