package screeps.utils.memory

import screeps.api.CreepMemory
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


open class CreepMemoryDelegate<T>(protected val default: T) : ReadWriteProperty<CreepMemory, T> {

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
fun <T> memory(): ReadWriteProperty<CreepMemory, T?> = CreepMemoryDelegate(null)

/**
 * Creates a  property that is persisted in creep.memory
 *
 * @param default is written to memory if it does not contain the property
 *
 * @see memory
 */
fun <T : Any> memoryOrDefault(default: T): ReadWriteProperty<CreepMemory, T> = CreepMemoryDelegate(default)

/**
 * Instantiate an anonymous js object.
 *
 * Therefore this method should only be used with external interfaces to initialize memory
 * ## Warning: You have to initialize all non-nullable properties!
 * Otherwise you *will* get a NullpointerException on the first read
 *
 *
 * ### Example
 *
 *     external interface Foo {
 *         var name : String
 *     }
 *
 *     var peter = jsObject {
 *         name = "Peter"
 *     }
 *
 *
 * Is the same as the following js snippet
 *
 *     let peter = {
 *         name = "Peter"
 *     }
 *
 */
fun <T> jsObject(block: T.() -> Unit): T = Any().unsafeCast<T>().also(block)


