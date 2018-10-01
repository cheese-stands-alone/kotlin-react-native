@file:JsModule("react-native")

package react.native.components.webview

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.components.scrollview.Insets
import react.native.components.view.NativeEvent
import react.native.components.view.ViewProps

external interface WebViewSource

external interface WebViewUriSource : WebViewSource {
    var uri: String?
    var method: String?
    var headers: dynamic
    var body: String?
}

external interface WebViewHtmlSource : WebViewSource {
    var html: String?
    var baseUrl: String?
}

external interface WebViewNativeConfig {
    var component: dynamic
    var props: dynamic
    var viewManager: dynamic
}

external interface NavState {
    var url: String?
    var title: String?
    var loading: Boolean?
    var canGoBack: Boolean?
    var canGoForward: Boolean?
}

external interface WebViewMessageEventData {
    var data: String?
}

external interface WebViewIOSLoadRequestEvent {
    var target: Number?
    var canGoBack: Boolean?
    var lockIdentifier: Number?
    var loading: Boolean?
    var title: String?
    var canGoForward: Boolean?
    var navigationType: String?
    var url: String?
}

external interface WebViewPropsBase : RProps {
    var WebViewSource: WebViewSource
    var automaticallyAdjustContentInsets: Boolean?
    var injectJavaScript: ((String) -> Unit)?
    var injectedJavaScript: String?
    var mediaPlaybackRequiresUserAction: Boolean?
    var nativeConfig: WebViewNativeConfig?
    var onError: ((NavState) -> Unit)?
    var onLoad: ((NavState) -> Unit)?
    var onLoadEnd: ((NavState) -> Unit)?
    var onLoadStart: ((NavState) -> Unit)?
    var onMessage: ((NativeEvent<WebViewMessageEventData>) -> Unit)?
    var onNavigationStateChange: ((NavState) -> Unit)?
    var renderError: (() -> ReactElement)?
    var renderLoading: (() -> ReactElement)?
    var scalesPageToFit: Boolean?
    var onShouldStartLoadWithRequest: ((WebViewIOSLoadRequestEvent) -> Unit)?
    var startInLoadingState: Boolean
    var decelerationRate: Number?
    var domStorageEnabled: Boolean
    var javaScriptEnabled: Boolean
    var thirdPartyCookiesEnabled: Boolean
    var userAgent: String
    var allowsInlineMediaPlayback: Boolean
    var bounces: Boolean
    var contentInset: Insets
    var scrollEnabled: Boolean?
    var geolocationEnabled: Boolean?
    var allowUniversalAccessFromFileURLs: Boolean?
    var useWebKit: Boolean?
}

external interface WebViewProps : WebViewPropsBase, ViewProps {
    var mixedContentMode: String?
    var dataDetectorTypes: Array<String>?
}

external class WebView : Component<WebViewProps, RState> {
    override fun render(): dynamic

    companion object {
        fun extraNativeComponentConfig(): dynamic
    }

    fun goForward()
    fun goBack()
    fun reload()
    fun stopLoading()
}