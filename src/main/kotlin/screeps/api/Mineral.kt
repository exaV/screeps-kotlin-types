package screeps.api

abstract external class Mineral : RoomObject, Harvestable, Identifiable {
    val density: DensityConstant
    val mineralAmount: Int
    val mineralType: MineralConstant
}