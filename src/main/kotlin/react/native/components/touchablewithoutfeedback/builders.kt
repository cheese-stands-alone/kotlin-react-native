package react.native.components.touchablewithoutfeedback

import react.RBuilder
import react.RElementBuilder
import react.native.components.view.TypedViewProps

class TypedTouchableWithoutFeedbackProps(builder: RElementBuilder<TouchableWithoutFeedbackProps>)
    : TypedViewProps<TouchableWithoutFeedbackProps>(builder), TouchableWithoutFeedbackPropsBase by builder.attrs {
}

fun RBuilder.touchableWithoutFeedback(
        block: (TypedTouchableWithoutFeedbackProps.() -> Unit)? = undefined
) = child(TouchableWithoutFeedback::class) {
    if (block != undefined) TypedTouchableWithoutFeedbackProps(this).run { block() }
}
