package screeps.api.structures

import screeps.api.Decaying
import screeps.api.StoreDefinition

abstract external class StructureContainer : Structure, Decaying {
    val store: StoreDefinition
    val storeCapacity: Int
}