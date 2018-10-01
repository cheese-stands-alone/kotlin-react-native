@file:JsModule("react-native")

package react.native.api.accessibilityinfo

import kotlin.js.Promise

external interface AccessibilityAnnouncementFinishedEvent {
    val announcement: String?
    val success: Boolean?
};

external object AccessibilityInfo {
    fun fetch(): Promise<Boolean>
    fun addEventListener(eventName: String, handler: (dynamic) -> Unit)
    fun removeEventListener(eventName: String, handler: (dynamic) -> Unit)
    fun setAccessibilityFocus(reactTag: Number)
    fun announceForAccessibility(announcement: String)
}