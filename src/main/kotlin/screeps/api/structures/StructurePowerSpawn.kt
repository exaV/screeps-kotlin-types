package screeps.api.structures

import screeps.api.EnergyContainer
import screeps.api.Owned
import screeps.api.ScreepsReturnCode

abstract external class StructurePowerSpawn : Structure, Owned, EnergyContainer {
    val power: Int
    val powerCapacity: Int
    fun createPowerCreep(name: String): ScreepsReturnCode
    fun processPower(): ScreepsReturnCode
}