package types.base.prototypes.structures

import types.base.prototypes.Storage

external class StructureContainer : Structure {
    val store: Storage
    val storeCapacity: Int
    val ticksToDecay: Int
}