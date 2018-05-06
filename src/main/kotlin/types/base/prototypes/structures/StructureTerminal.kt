package types.base.prototypes.structures

import types.base.global.ResourceConstant
import types.base.global.ScreepsReturnCode
import types.base.prototypes.Storage

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