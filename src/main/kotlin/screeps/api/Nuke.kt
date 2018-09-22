package screeps.api

abstract external class Nuke : RoomObject {
    val launchRoomName: String
    val timeToLand: Int
}