package screeps.api

abstract external class Deposit : RoomObjectNotNull, Decaying, WithCooldown, Harvestable, Identifiable {
    val lastCooldown: Int
    val depositType: DepositResourceConstant
}