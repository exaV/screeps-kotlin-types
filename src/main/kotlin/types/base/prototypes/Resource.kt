package types.base.prototypes

import types.base.global.ResourceConstant

external class Resource : RoomObject {
    val amount: Int
    val resourceType: ResourceConstant
}