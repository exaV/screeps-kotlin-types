package screeps.api

abstract external class Mineral : RoomObjectNotNull, RenewableHarvestable, Identifiable {
    val density: DensityConstant
    val mineralAmount: Int
    val mineralType: MineralConstant
}