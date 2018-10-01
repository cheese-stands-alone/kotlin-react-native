package react.native.components.button

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.TypedProps

class TypedButtonProps(builder: RElementBuilder<ButtonProps>)
    : TypedProps<ButtonProps>(builder), ButtonPropsBase by builder.attrs {
    var color: Color?
        get() = Color.of(builder.attrs.color)
        set(value) {
            builder.attrs.color = value?.value
        }
}

fun RBuilder.button(
        block: (TypedButtonProps.() -> Unit)? = undefined
) = child(Button::class) {
    if (block != undefined) TypedButtonProps(this).run { block() }
}
