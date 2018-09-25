package screeps.utils.memory

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

external interface MemoryMarker

open class CreepMemoryDelegate<T>(protected val default: T) : ReadWriteProperty<MemoryMarker, T> {

    override fun getValue(thisRef: dynamic, property: KProperty<*>): T =
        thisRef[property.name] as? T ?: default.also {
            thisRef[property.name] = default
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
 *
 * ### Note: this method only works with primitive screeps. To use complex screeps use *memoryOrDefault*
 *
 */
fun <T> memory(): ReadWriteProperty<MemoryMarker, T?> = CreepMemoryDelegate(null)

/**
 * Creates a  property that is persisted in creep.memory
 *
 * @param default is written to memory if it does not contain the property
 *
 * @see memory
 */
fun <T : Any> memoryOrDefault(default: T): ReadWriteProperty<MemoryMarker, T> = CreepMemoryDelegate(default)

/**
 * Specifically for enums
 *
 * @see memory
 */
inline fun <reified T : Enum<T>> memoryOrDefault(default: T)
        : ReadWriteProperty<MemoryMarker, T> =
    CreepMemoryMappingDelegate(default, Enum<T>::name) { s -> enumValueOf(s) }

open class CreepMemoryMappingDelegate<T>(
    protected val default: T,
    protected val serializer: (T) -> String,
    protected val deserializer: (String) -> T
) : ReadWriteProperty<MemoryMarker, T> {

    override fun getValue(thisRef: dynamic, property: KProperty<*>): T {
        val value = thisRef[property.name] as? String

        return if (value != null) {
            deserializer(value)
        } else {
            thisRef[property.name] = serializer(default)
            default
        }
    }

    override fun setValue(thisRef: dynamic, property: KProperty<*>, value: T) {
        thisRef[property.name] = serializer(value)
    }
}

fun <T : Any> serializedMemory(default: T, serializer: (T) -> String, deserializer: (String) -> T)
        : ReadWriteProperty<MemoryMarker, T> = CreepMemoryMappingDelegate(default, serializer, deserializer)

