package react.native.components.touchablenativefeedback

import react.RBuilder
import react.RElementBuilder
import react.native.components.view.TypedViewProps

class TypedTouchableNativeFeedbackProps(builder: RElementBuilder<TouchableNativeFeedbackProps>)
    : TypedViewProps<TouchableNativeFeedbackProps>(builder), TouchableNativeFeedbackPropsBase by builder.attrs {
}

fun RBuilder.touchableNativeFeedback(
        block: (TypedTouchableNativeFeedbackProps.() -> Unit)? = undefined
) = child(TouchableNativeFeedback::class) {
    if (block != undefined) TypedTouchableNativeFeedbackProps(this).run { block() }
}
