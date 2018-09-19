package screeps.api.structures

import screeps.api.ScreepsReturnCode

/**
 * under development!
 */
abstract external class StructurePowerSpawn : OwnedStructure,
    EnergyContainingStructure {
    val power: Int
    val powerCapacity: Int
    fun processPower(): ScreepsReturnCode
}