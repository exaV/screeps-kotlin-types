package types.base.prototypes.structures

import types.base.prototypes.Storage

external class StructureStorage : OwnedStructure {
    val store: Storage
    val storeCapacity: Int
}