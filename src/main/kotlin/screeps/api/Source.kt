package screeps.api

abstract external class Source : RoomObject, Harvestable, Identifiable {
    val energy: Int
    val energyCapacity: Int
}