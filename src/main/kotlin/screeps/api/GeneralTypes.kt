package screeps.api

import screeps.utils.jsObject

external interface StoreDefinition {
    val energy: Int
    val power: Int?
}

external interface FilterOption<T> {
    var filter: ((T) -> Boolean)?
}

external interface Options

fun <T : Options> options(init: T.() -> Unit): T = jsObject(init).unsafeCast<T>()
