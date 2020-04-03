package screeps.api

external interface Store : Record<ResourceConstant, Int> {
    /**
     * Returns total store capacity
     */
    fun getCapacity(): Int?

    /**
     * Returns capacity number, or null in case of a not valid resource for this store type of this store
     * for the specified resource
     */
    fun getCapacity(resource: ResourceConstant): Int?

    /**
     * A shorthand for getCapacity(resource) - getUsedCapacity(resource)
     */
    fun getFreeCapacity(): Int
    fun getFreeCapacity(resource: ResourceConstant): Int?

    /**
     * Returns total used capacity for general purpose stores
     */
    fun getUsedCapacity(): Int

    /**
     * Returns the capacity used by the specified resource, or null in case of a not valid resource
     * for this store type
     */
    fun getUsedCapacity(resource: ResourceConstant): Int?

}

// useful to compare entity.store[RESOURCE_ENERGY] < entity.store.getCapacity()
// without this it turns into entity.store[RESOURCE_ENERGY] ?: 0 < entity.store.getCapacity() ?: 0
operator fun Int?.compareTo(other: Int?): Int = compareValues(this ?: 0, other ?: 0)
