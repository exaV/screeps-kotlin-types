package memory

import screeps.api.CARRY
import screeps.api.EVENT_BUILD
import screeps.api.MOVE
import screeps.api.Room
import screeps.api.WORK
import screeps.api.handle
import screeps.api.structures.StructureSpawn

/**
 * this is just a collection of code that should compile but did not in the past
 */
class ApiTest {

    fun bodyparts(spawn: StructureSpawn){
        val body = arrayOf(WORK, CARRY, MOVE, MOVE)
        spawn.spawnCreep(body, "creep")
    }

    fun events(room: Room){
        room.getEventLog().forEach { event ->
            event.handle(EVENT_BUILD){
                println(it.data.structureType)
            }
        }
    }
}