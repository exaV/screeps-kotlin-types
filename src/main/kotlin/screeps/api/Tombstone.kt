package screeps.api

import screeps.api.structures.Structure

abstract external class Tombstone : RoomObjectNotNull, Decaying, Identifiable, IStore {
    val structure: Structure
    val destroyTime: Int
}
