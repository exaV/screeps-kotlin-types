package screeps.api.structures

import screeps.api.Creep
import screeps.api.ScreepsReturnCode

abstract external class StructureTower : OwnedStructure,
    EnergyContainingStructure {
    fun attack(target: Creep): ScreepsReturnCode
    fun heal(target: Creep): ScreepsReturnCode
    fun repair(target: Structure): ScreepsReturnCode

}