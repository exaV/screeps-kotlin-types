package screeps.api.structures

import screeps.api.Container
import screeps.api.Decaying
import screeps.api.StoreDefinition

abstract external class StructureContainer : Structure, Decaying, Container {
    val store: StoreDefinition
    val storeCapacity: Int
}