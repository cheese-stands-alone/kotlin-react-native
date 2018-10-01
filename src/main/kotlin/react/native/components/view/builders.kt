package react.native.components.view

import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.native.StringEnum
import react.native.TypedProps
import react.native.fromValue

enum class PointerEvents(override val value: String) : StringEnum {
    BOXNONE("box-none"),
    NONE("none"),
    BOXONLY("box-only"),
    AUTO("auto")
}

enum class AccessibilityLiveRegion(override val value: String) : StringEnum {
    NONE("none"),
    POLITE("polite"),
    ASSERTIVE("assertive")
}

enum class ImportantForAccessibility(override val value: String) : StringEnum {
    AUTO("auto"),
    YES("yes"),
    NO("no"),
    NO_HIDE_DESCENDANTS("no-hide-descendants")
}

enum class AccessibilityRole(override val value: String) : StringEnum {
    NONE("none"),
    BUTTON("button"),
    LINK("link"),
    HEADER("header"),
    SEARCH("search"),
    IMAGE("image"),
    KEY("key"),
    TEXT("text"),
    SUMMARY("summary"),
    IMAGEBUTTON("imagebutton"),
    ADJUSTABLE("adjustable")
}

enum class AccessibilityStates(override val value: String) : StringEnum {
    SELECTED("selected"),
    DISABLED("disabled")
}

open class TypedViewProps<T : ViewProps>(builder: RElementBuilder<T>)
    : TypedProps<T>(builder), ViewPropsBase by builder.attrs {
    var pointerEvents: PointerEvents?
        get() = fromValue(builder.attrs.pointerEvents)
        set(value) {
            builder.attrs.pointerEvents = value?.value
        }
    var accessibilityLiveRegion: AccessibilityLiveRegion?
        set(value) {
            builder.attrs.accessibilityLiveRegion = value?.value
        }
        get() = fromValue(builder.attrs.accessibilityLiveRegion)
    var importantForAccessibility: ImportantForAccessibility?
        set(value) {
            builder.attrs.importantForAccessibility = value?.value
        }
        get() = fromValue(builder.attrs.importantForAccessibility)

    var accessibilityRole: AccessibilityRole?
        set(value) {
            builder.attrs.accessibilityRole = value?.value
        }
        get() = fromValue(builder.attrs.accessibilityRole)
    var accessibilityStates: Iterable<AccessibilityStates>?
        set(value) {
            builder.attrs.accessibilityStates = value?.map { it.value }?.toTypedArray()
        }
        get() = builder.attrs.accessibilityStates?.mapNotNull { fromValue<AccessibilityStates, String>(it) }
}

class SafeProps<P, A : RProps, T : RElementBuilder<A>>(val props: P, val builder: T)

fun RBuilder.view(
        block: (TypedViewProps<ViewProps>.() -> Unit)? = undefined
) = child(View::class) {
    if (block != undefined) TypedViewProps(this).run { block() }
}