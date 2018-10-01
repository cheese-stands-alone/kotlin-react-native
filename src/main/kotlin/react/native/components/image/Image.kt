@file:JsModule("react-native")

package react.native.components.image

import react.Component
import react.RProps
import react.RState
import react.native.components.scrollview.Insets
import react.native.components.view.Layout
import react.native.components.view.NativeEvent
import kotlin.js.Promise

external interface ImageURISource {
    var uri: String?
    var bundle: String?
    var method: String?
    var headers: dynamic
    var body: String?
    var width: Number?
    var height: Number?
    var scale: Number?
}

external interface Progress {
    var loaded: Number
    var total: Number
}

external interface ImagePropsBase : RProps {
    var blurRadius: Number?
    var onLayout: ((NativeEvent<Layout>) -> Unit)?
    var onLoad: (() -> Unit)?
    var onLoadEnd: (() -> Unit)?
    var onLoadStart: (() -> Unit)?
    var source: ImageURISource?
    var loadingIndicatorSource: ImageURISource?
    var onError: ((NativeEvent<dynamic>) -> Unit)?
    var testID: String?
    var accessibilityLabel: String?
    var accessible: Boolean?
    var capInsets: Insets?
    var defaultSource: dynamic
    var onPartialLoad: (() -> Unit)?
    var onProgress: ((NativeEvent<Progress>) -> Unit)?
    var fadeDuration: Number?
}

external interface ImageProps : ImagePropsBase {
    var resizeMode: String?
    var resizeMethod: String?

}

external class Image : Component<ImageProps, RState> {
    override fun render(): dynamic

    companion object {
        fun getSize(uri: String, success: (width: Number, height: Number) -> Unit, failure: (error: dynamic) -> Unit)
        fun prefetch(url: String)
        fun abortPrefetch(requestId: Number)
        fun queryCache(urls: Array<String>): Promise<Map<String, String>>
    }
}