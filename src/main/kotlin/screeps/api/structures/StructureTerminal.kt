package screeps.api.structures

import screeps.api.*

abstract external class StructureTerminal : Structure, Owned, Container {
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