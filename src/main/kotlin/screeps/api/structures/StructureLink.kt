package screeps.api.structures

import screeps.api.Owned
import screeps.api.ScreepsReturnCode
import screeps.api.StoreOwner
import screeps.api.WithCooldown

abstract external class StructureLink : Structure, Owned, StoreOwner, WithCooldown {
    fun transferEnergy(target: StructureLink, amount: Int = definedExternally): ScreepsReturnCode
}
