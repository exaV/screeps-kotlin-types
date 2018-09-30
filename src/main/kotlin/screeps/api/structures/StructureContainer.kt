package screeps.api.structures

import screeps.api.Container
import screeps.api.Decaying
import screeps.api.Record
import screeps.api.ResourceConstant

abstract external class StructureContainer : Structure, Decaying, Container {
    val store: Record<ResourceConstant, Int>
    val storeCapacity: Int
}