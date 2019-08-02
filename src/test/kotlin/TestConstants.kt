import screeps.api.FIND_CREEPS
import screeps.api.FIND_MY_STRUCTURES
import screeps.api.value
import kotlin.test.Test
import kotlin.test.assertEquals

class TestConstants {

    @Test
    fun testConstants() {
        assertEquals(126,FIND_MY_STRUCTURES.value or FIND_CREEPS.value)
    }

}