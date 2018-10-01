package react.native.components.modal

import react.RBuilder
import react.RElementBuilder
import react.native.StringEnum
import react.native.TypedProps
import react.native.fromValue

enum class SupportedOrientations(override val value: String) : StringEnum {
    PORTRAIT("portrait"),
    PORTRAIT_UPSIDE_DOWN("portrait-upside-down"),
    LANDSCAPE("landscape"),
    LANDSCAPE_LEFT("landscape-left"),
    LANDSCAPE_RIGHT("landscape-right")
}

enum class AnimationType(override val value: String) : StringEnum {
    NONE("none"),
    SLIDE("slide"),
    FADE("fade")
}

enum class PresentationStyle(override val value: String) : StringEnum {
    FULLSCREEN("fullScreen"),
    PAGESHEET("pageSheet"),
    FORMSHEET("formSheet"),
    OVERFULLSCREEN("overFullScreen")
}

class TypedModalProps(builder: RElementBuilder<ModalProps>)
    : TypedProps<ModalProps>(builder), ModalPropsBase by builder.attrs {
    var supportedOrientations: SupportedOrientations?
        get() = fromValue(builder.attrs.supportedOrientations)
        set(value) {
            builder.attrs.supportedOrientations = value?.value
        }
    var animationType: AnimationType?
        get() = fromValue(builder.attrs.animationType)
        set(value) {
            builder.attrs.animationType = value?.value
        }
    var presentationStyle: PresentationStyle?
        get() = fromValue(builder.attrs.presentationStyle)
        set(value) {
            builder.attrs.presentationStyle = value?.value
        }
}

fun RBuilder.modal(
        block: (TypedModalProps.() -> Unit)? = undefined
) = child(Modal::class) {
    if (block != undefined) TypedModalProps(this).run { block() }
}
