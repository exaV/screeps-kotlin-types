package screeps.api

abstract external class Tombstone : RoomObject, Decaying, Identifiable {
    val creep: Creep
    val deathTime: Int
    val store: StoreDefinition
}