package screeps.api.structures

abstract external class StructurePortal : Structure, DecayingStructure {
    val destination: dynamic
}