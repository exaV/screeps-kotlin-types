@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

import screeps.api.*
import screeps.utils.contains
import screeps.utils.memory.memoryOrDefault
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestRecords {

    @Test
    fun testContains() {
        val people = js(
            """
            {
                "alf" : {},
                "bob" : {},
            }
        """
        ) as Record<String, CreepMemory>

        assertTrue { "alf" in people }
        assertTrue { "bob" in people }
        assertEquals(2, people.size)
    }

    @Test
    fun testIterator() {
        val creeps = createCreeps()

        var count = 0
        for ((name, _) in creeps) {
            assertTrue { name in creeps }
            count++
        }

        assertEquals(creeps.size, count)
    }

    @Test
    fun testValues() {
        val creeps = createCreeps()

        assertEquals(creeps.size, creeps.values.count())
        assertEquals(creeps.size * 2, creeps.values.map { it.health }.sumBy { it * 2 })
    }

    private val CreepMemory.health by memoryOrDefault(1)

    private fun createCreeps() = js(
        """
            {
                "alf" : {
                    "color" : "blue"
                },
                "bob" : {},
                "charlie" : {},
                "emil" : {}
            }
        """
    ) as Record<String, CreepMemory>
}

