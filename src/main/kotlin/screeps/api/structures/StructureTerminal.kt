package screeps.api.structures

import screeps.api.Owned
import screeps.api.ResourceConstant
import screeps.api.ScreepsReturnCode
import screeps.api.StoreDefinition

abstract external class StructureTerminal : Structure, Owned {
    val cooldown: Int
    val store: StoreDefinition
    val storeCapacity: Int
    fun send(
        resourceType: ResourceConstant,
        amount: Int,
        destination: String,
        description: String = definedExternally
    ): ScreepsReturnCode
}