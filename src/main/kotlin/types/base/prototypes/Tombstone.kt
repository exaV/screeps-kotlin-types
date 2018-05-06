package types.base.prototypes

external class Tombstone : RoomObject {
    val creep: Creep
    val deathTime: Int
    val store: Storage
    val ticksToDecay: Int
}