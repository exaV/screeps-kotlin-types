package screeps.api

abstract external class Source : RoomObjectNotNull, RenewableHarvestable, Identifiable {
    val energy: Int
    val energyCapacity: Int
}
