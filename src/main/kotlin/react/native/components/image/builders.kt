package react.native.components.image

import kotlinext.js.jsObject
import react.RBuilder
import react.RElementBuilder
import react.native.StringEnum
import react.native.TypedProps
import react.native.fromValue

enum class ResizeMode(override val value: String) : StringEnum {
    COVER("cover"),
    CONTAIN("contain"),
    STRETCH("stretch"),
    REPEAT("repeat"),
    CENTER("center")
}

enum class ResizeMethod(override val value: String) : StringEnum {
    AUTO("auto"),
    RESIZE("resize"),
    SCALE("scale")
}

class TypedImageProps(builder: RElementBuilder<ImageProps>)
    : TypedProps<ImageProps>(builder), ImagePropsBase by builder.attrs {
    var resizeMode: ResizeMode?
        get() = fromValue(builder.attrs.resizeMode)
        set(value) {
            builder.attrs.resizeMode = value?.value
        }
    var url: String?
        get() = builder.attrs.source?.uri
        set(value) {
            if (builder.attrs.source != null) {
                builder.attrs.source!!.uri = value
            } else builder.attrs.source = jsObject { uri = value }
        }
    var resizeMethod: ResizeMethod?
        get() = fromValue(builder.attrs.resizeMethod)
        set(value) {
            builder.attrs.resizeMethod = value?.value
        }
}

fun RBuilder.image(
        block: (TypedImageProps.() -> Unit)? = undefined
) = child(Image::class) {
    if (block != undefined) TypedImageProps(this).run { block() }
}
