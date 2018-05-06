package types.base.prototypes.structures

import types.base.global.ScreepsReturnCode
import types.base.prototypes.RoomPosition

abstract external class StructureNuker : OwnedStructure, EnergyContainingStructure {
    val ghodium: Int
    val ghodiumCapacity: Int
    val coolDown: Int
    fun launchNuke(position: RoomPosition): ScreepsReturnCode
}