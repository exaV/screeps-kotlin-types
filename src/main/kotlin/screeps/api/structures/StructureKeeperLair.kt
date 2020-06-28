package screeps.api.structures

import screeps.api.Owned

abstract external class StructureKeeperLair : Structure, Owned {
    val ticksToSpawn: Int?
}