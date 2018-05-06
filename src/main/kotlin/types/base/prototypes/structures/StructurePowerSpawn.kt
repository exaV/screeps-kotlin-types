package types.base.prototypes.structures

import types.base.global.ScreepsReturnCode

/**
 * under development!
 */
abstract external class StructurePowerSpawn : OwnedStructure, EnergyContainingStructure {
    val power: Int
    val powerCapacity: Int
    fun processPower(): ScreepsReturnCode
}