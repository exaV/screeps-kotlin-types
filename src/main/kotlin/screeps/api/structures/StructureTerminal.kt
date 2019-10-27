package screeps.api.structures

import screeps.api.*

abstract external class StructureTerminal : Structure, Owned, IStore, WithCooldown {
    fun send(
        resourceType: ResourceConstant,
        amount: Int,
        destination: String,
        description: String = definedExternally
    ): ScreepsReturnCode
}
