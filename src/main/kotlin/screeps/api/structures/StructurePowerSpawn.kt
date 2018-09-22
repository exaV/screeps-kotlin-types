package screeps.api.structures

import screeps.api.EnergyContainer
import screeps.api.Owned
import screeps.api.ScreepsReturnCode

/**
 * under development!
 */
abstract external class StructurePowerSpawn : Structure, Owned, EnergyContainer {
    val power: Int
    val powerCapacity: Int
    fun processPower(): ScreepsReturnCode
}