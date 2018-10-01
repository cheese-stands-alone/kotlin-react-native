package react.native.components.touchableopacity

import react.RBuilder
import react.RElementBuilder
import react.native.components.view.TypedViewProps

class TypedTouchableOpacityProps(builder: RElementBuilder<TouchableOpacityProps>)
    : TypedViewProps<TouchableOpacityProps>(builder), TouchableOpacityPropsBase by builder.attrs {
}

fun RBuilder.touchableOpacity(
        block: (TypedTouchableOpacityProps.() -> Unit)? = undefined
) = child(TouchableOpacity::class) {
    if (block != undefined) TypedTouchableOpacityProps(this).run { block() }
}
