package screeps.api.structures

import screeps.api.Container
import screeps.api.Decaying

abstract external class StructurePowerBank : Structure, Decaying, Container {
    val power: Int
}