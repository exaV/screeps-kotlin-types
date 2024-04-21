package screeps.api.structures

import screeps.api.*

abstract external class StructureTower : Structure, Owned, StoreOwner {
    fun attack(target: Attackable): ScreepsReturnCode
    fun heal(target: GenericCreep): ScreepsReturnCode
    fun repair(target: IStructure): ScreepsReturnCode
}
