package screeps.api

abstract external class Nuke : RoomObjectNotNull {
    val launchRoomName: String
    val timeToLand: Int
}