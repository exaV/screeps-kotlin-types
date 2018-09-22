package screeps.api

abstract external class Tombstone : RoomObject, Decaying, Container, Identifiable {
    val creep: Creep
    val deathTime: Int
    val store: Storage
}