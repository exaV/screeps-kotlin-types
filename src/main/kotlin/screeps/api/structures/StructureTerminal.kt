package screeps.api.structures

import screeps.api.ResourceConstant
import screeps.api.ScreepsReturnCode
import screeps.api.Storage

external class StructureTerminal : OwnedStructure {
    val cooldown: Int
    val store: Storage
    val storeCapacity: Int
    fun send(
        resourceType: ResourceConstant,
        amount: Int,
        destination: String,
        description: String = definedExternally
    ): ScreepsReturnCode
}