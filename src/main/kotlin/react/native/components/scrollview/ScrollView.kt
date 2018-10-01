@file:JsModule("react-native")

package react.native.components.scrollview

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.api.Style
import react.native.components.view.NativeEvent
import react.native.components.view.ViewProps

external interface ContentSizeHolder {
    var contentSize: ContentSize
}

external interface ContentSize {
    var width: Number
    var height: Number
}

external interface NativeScrollEvent {
    var contentInset: Insets
    var contentOffset: Point
    var contentSize: NativeScrollSize
    var layoutMeasurement: NativeScrollSize
    var zoomScale: Number
}

external interface Insets {
    var left: Number
    var top: Number
    var bottom: Number
    var right: Number
}

external interface Point {
    var x: Number
    var y: Number
}

external interface NativeScrollSize {
    var height: Number
    var width: Number
}

external interface Animated {
    var animated: Boolean
}

external interface ScrollTo : Animated, Point

external interface ScrollViewPropsBase : RProps {
    var alwaysBounceVertical: Boolean?
    var contentContainerStyle: Style?
    var onContentSizeChange: ((NativeEvent<ContentSizeHolder>) -> Unit)?
    var onMomentumScrollBegin: (() -> Unit)?
    var onMomentumScrollEnd: (() -> Unit)?
    var onScroll: ((NativeEvent<NativeScrollEvent>) -> Unit)?
    var onScrollBeginDrag: (() -> Unit)?
    var onScrollEndDrag: (() -> Unit)?
    var pagingEnabled: Boolean?
    var refreshControl: ReactElement?
    var scrollEnabled: Boolean?
    var showsHorizontalScrollIndicator: Boolean?
    var showsVerticalScrollIndicator: Boolean?
    var stickyHeaderIndices: Array<Number>?
    var scrollPerfTag: String?
    var alwaysBounceHorizontal: Boolean?
    var horizontal: Boolean?
    var automaticallyAdjustContentInsets: Boolean?
    var bounces: Boolean?
    var bouncesZoom: Boolean?
    var canCancelContentTouches: Boolean?
    var centerContent: Boolean?
    var contentInset: Insets?
    var contentOffset: Point?
    var decelerationRate: dynamic
    var directionalLockEnabled: Boolean?
    var maximumZoomScale: Number?
    var minimumZoomScale: Number?
    var pinchGestureEnabled: Boolean?
    var scrollEventThrottle: Number?
    var scrollIndicatorInsets: Insets?
    var scrollsToTop: Boolean?
    var snapToInterval: Number?
    var zoomScale: Number?
    var nestedScrollEnabled: Boolean?
}

external interface ScrollViewProps : ScrollViewPropsBase, ViewProps {
    var keyboardDismissMode: String?
    var keyboardShouldPersistTaps: String?
    var endFillColor: String?
    var overScrollMode: String?
    var contentInsetAdjustmentBehavior: String?
    var indicatorStyle: String?
    var snapToAlignment: String?
}

external class ScrollView : Component<ScrollViewProps, RState> {
    override fun render(): dynamic

    fun scrollTo(arg: ScrollTo)
    fun scrollToEnd()
    fun scrollToEnd(arg: Animated)
    fun flashScrollIndicators()
}