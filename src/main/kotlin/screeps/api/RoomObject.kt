package screeps.api

external interface RoomObjectNotNull : RoomObject {
    override val room: Room
}

external interface RoomObject : HasPosition {
    val room: Room?
}