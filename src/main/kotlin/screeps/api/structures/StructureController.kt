package screeps.api.structures

import screeps.api.Owned
import screeps.api.ScreepsReturnCode
import kotlin.js.Date

abstract external class StructureController : Structure, Owned {
    val level: Int
    val progress: Int
    val progressTotal: Int
    val reservation: Reservation?
    val safeMode: Int?
    val safeModeAvailable: Int
    val safeModeCooldown: Int?
    val sign: Sign?
    val ticksToDowngrade: Int
    val upgradeBlocked: Int
    fun activateSafeMode(): ScreepsReturnCode
    fun unclaim(): ScreepsReturnCode

    interface Reservation {
        var username: String
        var ticksToEnd: Int
    }

    interface Sign {
        var username: String
        var text: String
        var time: Int
        var datetime: Date
    }
}
