package screeps.utils

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

external fun delete(p: dynamic): Boolean = definedExternally

sealed class Result<out E, out V> {
    open val error: E? = null
    open val value: V? = null

    class Error<out E>(override val error: E) : Result<E, Nothing>()
    class Value<out V>(override val value: V) : Result<Nothing, V>()
}
