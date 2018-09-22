package screeps.api.structures

import screeps.api.Container
import screeps.api.Owned
import screeps.api.Storage

abstract external class StructureStorage : Structure, Owned, Container {
    val store: Storage
    val storeCapacity: Int
}