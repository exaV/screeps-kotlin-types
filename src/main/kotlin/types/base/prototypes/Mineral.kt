package types.base.prototypes

import types.base.global.DensityConstant
import types.base.global.MineralConstant

external class Mineral : RoomObject {
    val density: DensityConstant
    val mineralAmount: Int
    val mineralType: MineralConstant
    val ticksToRegeneration: Int
}