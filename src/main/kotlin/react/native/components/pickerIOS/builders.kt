package react.native.components.pickerIOS

import react.RBuilder
import react.RElementBuilder
import react.native.components.view.TypedViewProps

class TypedPickerIOSProps(builder: RElementBuilder<PickerIOSProps>)
    : TypedViewProps<PickerIOSProps>(builder), PickerIOSPropsBase by builder.attrs

fun RBuilder.pickerIOS(
        block: (TypedPickerIOSProps.() -> Unit)? = undefined
) = child(PickerIOS::class) {
    if (block != undefined) TypedPickerIOSProps(this).run { block() }
}
