package screeps.api

import screeps.utils.jsObject

external interface StoreDefinition {
    val energy: Int
    val power: Int?
}

external interface FilterOption<T> {
    var filter: ((T) -> Boolean)?
}

/**
 * Indicates type is an external interface with only *mutable and nullable* properties.
 * Thus it can be safely instantiated by [screeps.utils.jsObject]
 *
 * We provide the function [options] to create such objects
 */
external interface Options

fun <T : Options> options(init: T.() -> Unit): T = jsObject(init).unsafeCast<T>()
