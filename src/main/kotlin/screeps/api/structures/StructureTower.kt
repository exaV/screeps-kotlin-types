package screeps.api.structures

import screeps.api.Creep
import screeps.api.EnergyContainer
import screeps.api.Owned
import screeps.api.ScreepsReturnCode

abstract external class StructureTower : Structure, Owned, EnergyContainer {
    fun attack(target: Creep): ScreepsReturnCode
    fun heal(target: Creep): ScreepsReturnCode
    fun repair(target: Structure): ScreepsReturnCode
}