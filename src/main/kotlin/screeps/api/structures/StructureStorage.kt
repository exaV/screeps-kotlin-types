package screeps.api.structures

import screeps.api.Owned
import screeps.api.StoreDefinition

abstract external class StructureStorage : Structure, Owned {
    val store: StoreDefinition
    val storeCapacity: Int
}