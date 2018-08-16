package types.extensions.memory

import types.base.global.CreepMemory
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private class CreepMemoryDelegate<T>(private val default: T) : ReadWriteProperty<CreepMemory, T> {

    override fun getValue(thisRef: dynamic, property: KProperty<*>): T {
        return thisRef[property.name] as T? ?: default
    }

    override fun setValue(thisRef: dynamic, property: KProperty<*>, value: T) {
        thisRef[property.name] = value
    }
}

/**
 * Creates a nullable property that is persisted in creep.memory
 *
 * Usage:
 *
 *      // top-level declaration
 *      var CreepMemory.somevalue : Int? by memory()
 *
 *      // inside a function
 *      val creep : Creep = ...
 *      creep.memory.somevalue = 15 // 15 is saved to the creep's memory
 */
fun <T> memory(): ReadWriteProperty<CreepMemory, T?> = CreepMemoryDelegate(null)

/**
 * Creates a  property that is persisted in creep.memory
 *
 * @see memory
 */
fun <T : Any> memoryOrDefault(default: T): ReadWriteProperty<CreepMemory, T> = CreepMemoryDelegate(default)