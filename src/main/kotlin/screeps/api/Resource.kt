package screeps.api

abstract external class Resource : RoomObjectNotNull, Identifiable {
    val amount: Int
    val resourceType: ResourceConstant
}