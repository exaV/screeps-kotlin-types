package screeps.api

abstract external class Tombstone : RoomObjectNotNull, Decaying, Identifiable {
    val creep: Creep
    val deathTime: Int
    val store: StoreDefinition
}