package screeps.utils.memory

import screeps.api.MemoryMarker
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class MemoryDelegate<T>(protected val default: () -> T) : ReadWriteProperty<MemoryMarker, T> {

    override fun getValue(thisRef: dynamic, property: KProperty<*>): T =
        thisRef[property.name] as? T ?: default().also {
            thisRef[property.name] = it
        }

    override fun setValue(thisRef: dynamic, property: KProperty<*>, value: T) {
        thisRef[property.name] = value
    }
}

/**
 * Creates a nullable property that is persisted in creep.memory
 * The property written to memory on the first read or write.
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
 */
fun <T> memory(): ReadWriteProperty<MemoryMarker, T?> = MemoryDelegate { null }

/**
 * Creates a  property that is persisted in creep.memory
 *
 * @param defaultValue is written to memory if it does not contain the property
 *
 * @see memory
 */
fun <T : Any> memory(defaultValue: () -> T): ReadWriteProperty<MemoryMarker, T> = MemoryDelegate(defaultValue)

/**
 * Specifically for enums
 *
 * @see memory
 */
inline fun <reified T : Enum<T>> memory(defaultValue: Enum<T>): ReadWriteProperty<MemoryMarker, Enum<T>> =
    MemoryMappingDelegate({ defaultValue }, Enum<T>::name) { s -> enumValueOf<T>(s) }

open class MemoryMappingDelegate<T>(
    protected val default: () -> T,
    protected val serializer: (T) -> String,
    protected val deserializer: (String) -> T
) : ReadWriteProperty<MemoryMarker, T> {

    override fun getValue(thisRef: dynamic, property: KProperty<*>): T {
        val value = thisRef[property.name] as? String

        return if (value != null) {
            deserializer(value)
        } else {
            val defaultValue = default()
            thisRef[property.name] = serializer(defaultValue)
            defaultValue
        }
    }

    override fun setValue(thisRef: dynamic, property: KProperty<*>, value: T) {
        thisRef[property.name] = serializer(value)
    }
}

/**
 *  Uses a custom serializer and deserializer
 *
 *
 *  An important consequence is that **values are only saved on assignment**, so
 *  if you do any mutations on an object you have to assign it again
 *
 *  @See memory
 */
fun <T : Any> memoryWithSerializer(default: () -> T, serializer: (T) -> String, deserializer: (String) -> T)
        : ReadWriteProperty<MemoryMarker, T> = MemoryMappingDelegate(default, serializer, deserializer)

