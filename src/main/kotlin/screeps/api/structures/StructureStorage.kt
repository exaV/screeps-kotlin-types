package screeps.api.structures

import screeps.api.Container
import screeps.api.Owned
import screeps.api.Record
import screeps.api.ResourceConstant

abstract external class StructureStorage : Structure, Owned, Container {
    val store: Record<ResourceConstant, Int>
    val storeCapacity: Int
}