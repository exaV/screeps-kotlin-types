package screeps.api.structures

import screeps.api.Owned

abstract external class StructureExtractor : Structure, Owned {
    val cooldown: Int
}