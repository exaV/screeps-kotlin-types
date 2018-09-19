package screeps.api.structures

import screeps.api.ScreepsReturnCode

/**
 * Provides visibility into a distant room from your script.
 */
external class StructureObserver : OwnedStructure {
    /**
     * Provide visibility into a distant room from your script. The target room object will be available on the next tick.
     */
    fun observeRoom(roomName: String): ScreepsReturnCode
}