package screeps.api

external interface StoreDefinition {
    val energy: Int
    val power: Int?
}

external interface FilterOption<T> {
    var filter: ((T) -> Boolean)?
}

