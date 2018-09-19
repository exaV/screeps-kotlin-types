package screeps.api.structures

import screeps.api.Container
import screeps.api.Decaying
import screeps.api.Storage

abstract external class StructureContainer : Structure, Decaying, Container {
    val store: Storage
    val storeCapacity: Int
}