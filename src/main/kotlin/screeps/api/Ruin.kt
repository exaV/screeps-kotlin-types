package screeps.api

import screeps.api.structures.Structure

abstract external class Ruin : RoomObjectNotNull, Decaying, Identifiable, StoreOwner {
    val structure: Structure
    val destroyTime: Int
}
