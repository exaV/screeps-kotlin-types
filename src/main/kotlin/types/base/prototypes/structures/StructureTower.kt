package types.base.prototypes.structures

import types.base.global.ScreepsReturnCode
import types.base.prototypes.Creep

abstract external class StructureTower : OwnedStructure, EnergyContainingStructure {
    fun attack(target: Creep): ScreepsReturnCode
    fun heal(target: Creep): ScreepsReturnCode
    fun repair(target: Structure): ScreepsReturnCode

}