package screeps.api

abstract external class Source : RoomObjectNotNull, Harvestable, Identifiable {
    val energy: Int
    val energyCapacity: Int
}