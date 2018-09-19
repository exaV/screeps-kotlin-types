package screeps.api.structures

import screeps.api.Storage

external class StructureContainer : Structure {
    val store: Storage
    val storeCapacity: Int
    val ticksToDecay: Int
}