package screeps.api.structures

import screeps.api.Owned
import screeps.api.ScreepsReturnCode
import screeps.api.IStore
import screeps.api.WithCooldown

abstract external class StructureLink : Structure, Owned, IStore, WithCooldown {
    fun transferEnergy(target: StructureLink, amount: Int = definedExternally): ScreepsReturnCode
}
