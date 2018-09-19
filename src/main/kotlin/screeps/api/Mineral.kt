package screeps.api

external class Mineral : RoomObject {
    val density: DensityConstant
    val mineralAmount: Int
    val mineralType: MineralConstant
    val ticksToRegeneration: Int
}