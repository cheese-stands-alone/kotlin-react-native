package react.native.components.toolbarandroid

import kotlinext.js.jsObject
import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.image.ImageURISource
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class ActionShow(override val value: String) : StringEnum {
    ALWAYS("always"),
    IFROOM("ifRoom"),
    NEVER("never")
}

class AndroidAction(
        val title: String,
        val icon: ImageURISource? = undefined,
        val show: ActionShow? = undefined,
        val showWithText: Boolean? = undefined
)

class TypedToolbarAndroidProps(builder: RElementBuilder<ToolbarAndroidProps>)
    : TypedViewProps<ToolbarAndroidProps>(builder), ToolbarAndroidPropsBase by builder.attrs {
    var actions: Iterable<AndroidAction>?
        get() = builder.attrs.actions?.map { AndroidAction(it.title, it.icon, fromValue(it.show), it.showWithText) }
        set(value) {
            builder.attrs.actions = value?.map {
                jsObject<ToolbarAndroidAction> {
                    title = it.title
                    icon = it.icon
                    show = it.show?.value
                    showWithText = it.showWithText
                }
            }?.toTypedArray()
        }
    var subtitleColor: Color?
        get() = Color.of(builder.attrs.subtitleColor)
        set(value) {
            builder.attrs.subtitleColor = value?.value
        }
    var titleColor: Color?
        get() = Color.of(builder.attrs.titleColor)
        set(value) {
            builder.attrs.titleColor = value?.value
        }
}

fun RBuilder.ToolbarAndroid(
        block: (TypedToolbarAndroidProps.() -> Unit)? = undefined
) = child(ToolbarAndroid::class) {
    if (block != undefined) TypedToolbarAndroidProps(this).run { block() }
}
