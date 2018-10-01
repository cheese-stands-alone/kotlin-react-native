@file:JsModule("react-native")

package react.native.api

external object Keyboard {
    fun addListener(eventName: String, callback: () -> Unit)
    fun removeListener(eventName: String, callback: () -> Unit)
    fun removeAllListeners()
    fun dismiss()
}