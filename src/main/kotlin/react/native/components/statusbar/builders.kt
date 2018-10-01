package react.native.components.statusbar

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class BarStyle(override val value: String) : StringEnum {
    DEFAULT("enum('default', 'light-content', 'dark-content')"),
    LIGHT_CONTENT("light-content"),
    DARK_CONTENT("dark-content")
}

enum class HideTransition(override val value: String) : StringEnum {
    FADE("fade"),
    SLIDE("slide")
}

class TypedStatusBarProps(builder: RElementBuilder<StatusBarProps>)
    : TypedViewProps<StatusBarProps>(builder), StatusBarPropsBase by builder.attrs {
    var barStyle: BarStyle?
        get() = fromValue(builder.attrs.barStyle)
        set(value) {
            builder.attrs.barStyle = value?.value
        }
    var backgroundColor: Color?
        get() = Color.of(builder.attrs.barStyle)
        set(value) {
            builder.attrs.barStyle = value?.value
        }
    var showHideTransition: HideTransition?
        get() = fromValue(builder.attrs.barStyle)
        set(value) {
            builder.attrs.barStyle = value?.value
        }
}

fun RBuilder.statusBar(
        block: (TypedStatusBarProps.() -> Unit)? = undefined
) = child(StatusBar::class) {
    if (block != undefined) TypedStatusBarProps(this).run { block() }
}
