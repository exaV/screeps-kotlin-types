package screeps.api

abstract external class Tombstone : RoomObjectNotNull, Decaying, Identifiable, StoreOwner {
    val creep: Creep
    val deathTime: Int
}
