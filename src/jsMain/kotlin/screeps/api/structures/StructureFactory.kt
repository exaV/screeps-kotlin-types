package screeps.api.structures

import screeps.api.*

abstract external class StructureFactory : Structure, Owned, StoreOwner, WithCooldown {
    val level: Int

    /**
     * Produces the specified commodity. All ingredients should be available in the factory store
     */
    fun produce(resource: ResourceConstant): ScreepsReturnCode

}
