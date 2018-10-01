package react.native.components.progressviewIOS

import react.RBuilder
import react.RElementBuilder
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class ProgressViewStyle(override val value: String) : StringEnum {
    DEFAULT("default"),
    BAR("bar")
}

class TypedProgressViewIOSProps(builder: RElementBuilder<ProgressViewIOSProps>)
    : TypedViewProps<ProgressViewIOSProps>(builder), ProgressViewIOSPropsBase by builder.attrs {
    var progressViewStyle: ProgressViewStyle?
        get() = fromValue(builder.attrs.progressViewStyle)
        set(value) {
            builder.attrs.progressViewStyle = value?.value
        }
}

fun RBuilder.progressViewIOS(
        block: (TypedProgressViewIOSProps.() -> Unit)? = undefined
) = child(ProgressViewIOS::class) {
    if (block != undefined) TypedProgressViewIOSProps(this).run { block() }
}
