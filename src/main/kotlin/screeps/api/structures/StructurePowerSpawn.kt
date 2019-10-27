package screeps.api.structures

import screeps.api.Owned
import screeps.api.ScreepsReturnCode
import screeps.api.IStore

abstract external class StructurePowerSpawn : Structure, Owned, IStore {
    fun createPowerCreep(name: String): ScreepsReturnCode
    fun processPower(): ScreepsReturnCode
}
