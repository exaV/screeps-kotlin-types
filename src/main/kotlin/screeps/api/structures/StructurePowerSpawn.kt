package screeps.api.structures

import screeps.api.Owned
import screeps.api.ScreepsReturnCode
import screeps.api.StoreOwner

abstract external class StructurePowerSpawn : Structure, Owned, StoreOwner {
    fun createPowerCreep(name: String): ScreepsReturnCode
    fun processPower(): ScreepsReturnCode
}
