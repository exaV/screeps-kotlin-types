package screeps.api.structures

abstract external class StructureLink : OwnedStructure,
    EnergyContainingStructure {
    val cooldown: Int
    fun transferEnergy(target: StructureLink, amount: Int = definedExternally)
}