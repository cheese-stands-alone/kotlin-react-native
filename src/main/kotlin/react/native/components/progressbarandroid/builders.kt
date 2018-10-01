package react.native.components.progressbarandroid

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class StyleAttr(override val value: String) : StringEnum {
    HORIZONTAL("Horizontal"),
    NORMAL("Normal"),
    SMALL("Small"),
    LARGE("Large"),
    INVERSE("Inverse"),
    SMALLINVERSE("SmallInverse"),
    LARGEINVERSE("LargeInverse");
}

class TypedProgressBarAndroidProps(builder: RElementBuilder<ProgressBarAndroidProps>)
    : TypedViewProps<ProgressBarAndroidProps>(builder), ProgressBarAndroidPropsBase by builder.attrs {
    var color: Color?
        get() = Color.of(builder.attrs.color)
        set(value) {
            builder.attrs.color = value?.value
        }

    var styleAttr: StyleAttr?
        get() = fromValue(builder.attrs.styleAttr)
        set(value) {
            builder.attrs.styleAttr = value?.value
        }
}

fun RBuilder.progressBarAndroid(
        block: (TypedProgressBarAndroidProps.() -> Unit)? = undefined
) = child(ProgressBarAndroid::class) {
    if (block != undefined) TypedProgressBarAndroidProps(this).run { block() }
}
