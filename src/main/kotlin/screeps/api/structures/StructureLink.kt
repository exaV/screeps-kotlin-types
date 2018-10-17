package screeps.api.structures

import screeps.api.EnergyContainer
import screeps.api.Owned
import screeps.api.ScreepsReturnCode

abstract external class StructureLink : Structure, Owned, EnergyContainer {
    val cooldown: Int
    fun transferEnergy(target: StructureLink, amount: Int = definedExternally): ScreepsReturnCode
}