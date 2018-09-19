package screeps.api.structures

import screeps.api.RoomPosition
import screeps.api.ScreepsReturnCode

abstract external class StructureNuker : OwnedStructure,
    EnergyContainingStructure {
    val ghodium: Int
    val ghodiumCapacity: Int
    val coolDown: Int
    fun launchNuke(position: RoomPosition): ScreepsReturnCode
}