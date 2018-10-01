package react.native.components.inputaccessoryview

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.TypedProps

class TypedInputAccessoryViewProps(builder: RElementBuilder<InputAccessoryViewProps>)
    : TypedProps<InputAccessoryViewProps>(builder), InputAccessoryViewPropsBase by builder.attrs {
    var backgroundColor: Color?
        get() = Color.of(builder.attrs.backgroundColor)
        set(value) {
            builder.attrs.backgroundColor = value?.value
        }
}

fun RBuilder.inputAccessoryView(
        block: (TypedInputAccessoryViewProps.() -> Unit)? = undefined
) = child(InputAccessoryView::class) {
    if (block != undefined) TypedInputAccessoryViewProps(this).run { block() }
}
