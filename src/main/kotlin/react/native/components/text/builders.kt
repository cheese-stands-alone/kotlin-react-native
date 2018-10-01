package react.native.components.text

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.TypedProps
import react.native.fromValue

enum class EllipsizeMode(override val value: String) : StringEnum {
    HEAD("head"),
    MIDDLE("middle"),
    TAIL("tail"),
    CLIP("clip")
}

enum class TextBreakStrategy(override val value: String) : StringEnum {
    SIMPLE("simple"),
    HIGHQUALITY("highQuality"),
    BALLANCED("balanced")
}

class TypedTextProps(builder: RElementBuilder<TextProps>)
    : TypedProps<TextProps>(builder), TextPropsBase by builder.attrs {
    var ellipsizeMode: EllipsizeMode?
        get() = fromValue(builder.attrs.ellipsizeMode)
        set(value) {
            builder.attrs.ellipsizeMode = value?.value
        }
    var selectionColor: Color?
        get() = Color.of(builder.attrs.selectionColor)
        set(value) {
            builder.attrs.selectionColor = value?.value
        }
    var textBreakStrategy: TextBreakStrategy?
        get() = fromValue(builder.attrs.textBreakStrategy)
        set(value) {
            builder.attrs.textBreakStrategy = value?.value
        }
}

fun RBuilder.text(
        txt: String = "",
        block: (TypedTextProps.() -> Unit)? = undefined
) = child(Text::class) {
    +txt
    if (block != undefined) TypedTextProps(this).run { block() }
}
