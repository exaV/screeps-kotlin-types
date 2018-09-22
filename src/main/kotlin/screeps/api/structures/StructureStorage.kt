package screeps.api.structures

import screeps.api.Container
import screeps.api.Owned
import screeps.api.StoreDefinition

abstract external class StructureStorage : Structure, Owned, Container {
    val store: StoreDefinition
    val storeCapacity: Int
}