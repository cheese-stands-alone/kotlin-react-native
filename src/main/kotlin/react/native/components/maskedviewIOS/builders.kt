package react.native.components.maskedviewIOS

import react.RBuilder
import react.RElementBuilder
import react.native.components.view.TypedViewProps

class TypedMaskedViewIOSProps(builder: RElementBuilder<MaskedViewIOSProps>)
    : TypedViewProps<MaskedViewIOSProps>(builder), MaskedViewIOSPropsBase by builder.attrs

fun RBuilder.maskedViewIOS(
        block: (TypedMaskedViewIOSProps.() -> Unit)? = undefined
) = child(MaskedViewIOS::class) {
    if (block != undefined) TypedMaskedViewIOSProps(this).run { block() }
}
