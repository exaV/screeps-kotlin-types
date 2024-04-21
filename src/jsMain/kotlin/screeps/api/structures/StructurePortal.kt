package screeps.api.structures

import screeps.api.Decaying

abstract external class StructurePortal : Structure, Decaying {
    val destination: dynamic

}
