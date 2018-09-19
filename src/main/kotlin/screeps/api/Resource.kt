package screeps.api

external class Resource : RoomObject {
    val amount: Int
    val resourceType: ResourceConstant
}