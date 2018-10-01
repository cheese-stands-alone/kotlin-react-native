package react.native.components.picker

import react.RBuilder
import react.RElementBuilder
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class Mode(override val value: String) : StringEnum {
    DIALOG("dialog"),
    DROPDOWN("dropdown")
}

class TypedPickerProps(builder: RElementBuilder<PickerProps>)
    : TypedViewProps<PickerProps>(builder), PickerPropsBase by builder.attrs {
    var mode: Mode?
        get() = fromValue(builder.attrs.mode)
        set(value) {
            builder.attrs.mode = value?.value
        }
}

fun RBuilder.picker(
        block: (TypedPickerProps.() -> Unit)? = undefined
) = child(Picker::class) {
    if (block != undefined) TypedPickerProps(this).run { block() }
}
