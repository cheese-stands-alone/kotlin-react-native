@file:JsModule("react-native")

package react.native.api

import kotlin.js.Promise

external interface NetworkInfo {
    val type: String
    val effectiveType: String
}

external interface FetchableListenable<T> {
    fun fetch(): Promise<T>
    fun addEventListener(eventName: String, listener: (result: T) -> Unit)
    fun removeEventListener(eventName: String, listener: (result: T) -> Unit)
}

external object NetInfo {
    val isConnected: FetchableListenable<Boolean>
    fun addEventListener(eventName: String, callback: (NetworkInfo) -> Unit)
    fun removeEventListener(eventName: String, callback: (NetworkInfo) -> Unit)
    fun getConnectionInfo(): Promise<NetworkInfo>
    fun isConnectionExpensive(): Promise<Boolean>
}