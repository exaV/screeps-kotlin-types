package screeps.api

abstract external class Ruin : RoomObjectNotNull, Decaying, Identifiable, IStore {
    val creep: Creep
    val deathTime: Int
}
