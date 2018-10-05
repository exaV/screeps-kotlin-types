package screeps.api.structures

import screeps.api.Decaying

abstract external class StructurePowerBank : Structure, Decaying {
    val power: Int
}