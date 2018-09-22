package screeps.api.structures

import screeps.api.EnergyContainer
import screeps.api.Owned

abstract external class StructureLink : Structure, Owned, EnergyContainer {
    val cooldown: Int
    fun transferEnergy(target: StructureLink, amount: Int = definedExternally)
}