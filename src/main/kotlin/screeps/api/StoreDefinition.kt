package screeps.api

external interface StoreDefinition : Record<ResourceConstant, Int> {
    val energy: Int
}