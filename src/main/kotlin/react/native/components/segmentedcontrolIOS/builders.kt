package react.native.components.segmentedcontrolIOS

import react.RBuilder
import react.RElementBuilder
import react.native.components.view.TypedViewProps

class TypedSegmentedControlIOSProps(builder: RElementBuilder<SegmentedControlIOSProps>)
    : TypedViewProps<SegmentedControlIOSProps>(builder), SegmentedControlIOSPropsBase by builder.attrs {
}

fun RBuilder.segmentedControlIOS(
        block: (TypedSegmentedControlIOSProps.() -> Unit)? = undefined
) = child(SegmentedControlIOS::class) {
    if (block != undefined) TypedSegmentedControlIOSProps(this).run { block() }
}
