package screeps.api.structures

import screeps.api.Storage

external class StructureStorage : OwnedStructure {
    val store: Storage
    val storeCapacity: Int
}