package react.native.components.activityindicator

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.TypedProps
import react.native.fromValue

enum class Size(override val value: String) : StringEnum {
    SMALL("small"),
    LARGE("large")
}

class TypedActivityIndicatorProps(builder: RElementBuilder<ActivityIndicatorProps>)
    : TypedProps<ActivityIndicatorProps>(builder), ActivityIndicatorPropsBase by builder.attrs {
    var color: Color?
        get() = Color.of(builder.attrs.color)
        set(value) {
            builder.attrs.color = value?.value
        }
    var size: Size?
        get() = fromValue(builder.attrs.size)
        set(value) {
            builder.attrs.size = value?.value
        }
}

fun RBuilder.activityIndicator(
        block: (TypedActivityIndicatorProps.() -> Unit)? = undefined
) = child(ActivityIndicator::class) {

    if (block != undefined) TypedActivityIndicatorProps(this).run { block() }
}