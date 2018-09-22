package screeps.api.structures

import screeps.api.EnergyContainer
import screeps.api.Owned
import screeps.api.RoomPosition
import screeps.api.ScreepsReturnCode

abstract external class StructureNuker : Structure, Owned, EnergyContainer {
    val ghodium: Int
    val ghodiumCapacity: Int
    val coolDown: Int
    fun launchNuke(position: RoomPosition): ScreepsReturnCode
}