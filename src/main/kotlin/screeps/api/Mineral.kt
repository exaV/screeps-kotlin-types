package screeps.api

abstract external class Mineral : RoomObjectNotNull, Harvestable, Identifiable {
    val density: DensityConstant
    val mineralAmount: Int
    val mineralType: MineralConstant
}