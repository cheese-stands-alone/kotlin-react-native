package react.native.components.touchablehighlight

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.components.view.TypedViewProps

class TypedTouchableHighlightProps(builder: RElementBuilder<TouchableHighlightProps>)
    : TypedViewProps<TouchableHighlightProps>(builder), TouchableHighlightPropsBase by builder.attrs {
    var underlayColor: Color?
        get() = Color.of(builder.attrs.underlayColor)
        set(value) {
            builder.attrs.underlayColor = value?.value
        }
}

fun RBuilder.touchableHighlight(
        block: (TypedTouchableHighlightProps.() -> Unit)? = undefined
) = child(TouchableHighlight::class) {
    if (block != undefined) TypedTouchableHighlightProps(this).run { block() }
}
