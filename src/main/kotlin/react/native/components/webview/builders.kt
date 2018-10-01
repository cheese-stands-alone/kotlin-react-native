package react.native.components.webview

import react.RBuilder
import react.RElementBuilder
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class MixedContentMode(override val value: String) : StringEnum {
    NEVER("never "),
    ALWAYS("always "),
    COMPATIBILITY("compatibility ")
}

enum class DataDetectorTypes(override val value: String) : StringEnum {
    PHONENUMBER("phoneNumber "),
    LINK("link "),
    ADDRESS("address "),
    CALENDAREVENT("calendarEvent "),
    NONE("none "),
    ALL("all "),
    TRACKINGNUMBER("trackingNumber "),
    FLIGHTNUMBER("flightNumber "),
    LOOKUPSUGGESTION("lookupSuggestion ")
}

class TypedWebViewProps(builder: RElementBuilder<WebViewProps>)
    : TypedViewProps<WebViewProps>(builder), WebViewPropsBase by builder.attrs {
    var mixedContentMode: MixedContentMode?
        get() = fromValue(builder.attrs.mixedContentMode)
        set(value) {
            builder.attrs.mixedContentMode = value?.value
        }
    var dataDetectorTypes: Iterable<DataDetectorTypes>?
        get() = builder.attrs.dataDetectorTypes?.mapNotNull { fromValue<DataDetectorTypes, String>(it) }
        set(value) {
            builder.attrs.dataDetectorTypes = value?.map { it.value }?.toTypedArray()
        }
}

fun RBuilder.webView(
        block: (TypedWebViewProps.() -> Unit)? = undefined
) = child(WebView::class) {
    if (block != undefined) TypedWebViewProps(this).run { block() }
}
