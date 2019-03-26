package screeps.api

external interface RoomObject : HasPosition {
    val room: Room
}

external interface RoomObjectNullable : HasPosition {
    val room: Room?
}