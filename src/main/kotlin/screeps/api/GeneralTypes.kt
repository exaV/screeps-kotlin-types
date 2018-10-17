package screeps.api

import screeps.utils.unsafe.jsObject

external interface StoreDefinition : Record<ResourceConstant, Int> {
    val energy: Int
}

external interface FilterOption<T> : Options {
    var filter: ((T) -> Boolean)?
}

/**
 * Indicates type is an external interface with only *mutable and nullable* properties.
 * Thus it can be safely instantiated by [screeps.utils.unsafe.jsObject]
 *
 * We provide the function [options] to create such objects
 */
external interface Options

fun <T : Options> options(init: T.() -> Unit): T = jsObject(init).unsafeCast<T>()
