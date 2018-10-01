package react.native.api.accessibilityinfo

interface AccessibilityListener {
    val eventName: String
    val eventHandler: (dynamic) -> Unit
}

class AccessibilityChangeListener(handler: (Boolean) -> Unit) : AccessibilityListener {
    override val eventName = "change"
    override val eventHandler: (dynamic) -> Unit = handler
}

class AccessibilityAnnoucementListener(handler: (AccessibilityAnnouncementFinishedEvent) -> Unit) : AccessibilityListener {
    override val eventName = "announcementFinished"
    override val eventHandler: (dynamic) -> Unit = handler
}

fun AccessibilityInfo.addEventListener(listiner: AccessibilityListener) = addEventListener(listiner.eventName, listiner.eventHandler)
fun AccessibilityInfo.removeEventListener(listiner: AccessibilityListener) = addEventListener(listiner.eventName, listiner.eventHandler)
