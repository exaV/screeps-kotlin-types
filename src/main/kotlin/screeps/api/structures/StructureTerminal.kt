package screeps.api.structures

import screeps.api.*

abstract external class StructureTerminal : Structure, Owned, Store {
    val cooldown: Int
    fun send(
        resourceType: ResourceConstant,
        amount: Int,
        destination: String,
        description: String = definedExternally
    ): ScreepsReturnCode
}