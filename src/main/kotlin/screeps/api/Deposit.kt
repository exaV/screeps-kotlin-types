package screeps.api

abstract external class Deposit : RoomObjectNotNull, Decaying, Harvestable, Identifiable {
    val lastCooldown: Int
}