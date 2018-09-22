package screeps.api.structures

import screeps.api.Owned
import screeps.api.ScreepsReturnCode

/**
 * Provides visibility into a distant room from your script.
 */
abstract external class StructureObserver : Structure, Owned {
    /**
     * Provide visibility into a distant room from your script. The target room object will be available on the next tick.
     */
    fun observeRoom(roomName: String): ScreepsReturnCode
}