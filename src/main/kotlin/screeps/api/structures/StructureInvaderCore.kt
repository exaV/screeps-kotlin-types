package screeps.api.structures

import screeps.api.Owned

abstract external class StructureInvaderCore : Structure, Owned {
    val level: Int
    val ticksToDeploy: Int
}
