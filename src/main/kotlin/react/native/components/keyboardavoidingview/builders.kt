package react.native.components.keyboardavoidingview

import react.RBuilder
import react.RElementBuilder
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class Behavior(override val value: String) : StringEnum {
    HEIGHT("height"),
    POSITION("position"),
    PADDING("padding")
}

class TypedKeyboardAvoidingViewProps(builder: RElementBuilder<KeyboardAvoidingViewProps>)
    : TypedViewProps<KeyboardAvoidingViewProps>(builder), KeyboardAvoidingViewPropsBase by builder.attrs {
    var behavior: Behavior?
        get() = fromValue(builder.attrs.behavior)
        set(value) {
            builder.attrs.behavior = value?.value
        }
}

fun RBuilder.keyboardAvoidingView(
        block: (TypedKeyboardAvoidingViewProps.() -> Unit)? = undefined
) = child(KeyboardAvoidingView::class) {
    if (block != undefined) TypedKeyboardAvoidingViewProps(this).run { block() }
}
