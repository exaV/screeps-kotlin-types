package screeps.api.structures

abstract external class StructurePowerBank : Structure,
    DecayingStructure {
    val power: Int
}