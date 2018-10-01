@file:JsModule("react-native")

package react.native.components.view

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external interface NativeTouchEvent {
    var changedTouches: Array<NativeTouchEvent>?
    var identifier: String?
    var locationX: Number?
    var locationY: Number?
    var pageX: Number?
    var pageY: Number?
    var target: String?
    var timestamp: Number?
    var touches: Array<NativeTouchEvent>?
}

external interface NativeEvent<T> {
    var nativeEvent: T?
}

external interface HitSlop {
    var top: Number?
    var bottom: Number?
    var left: Number?
    var right: Number?
}

external interface LayoutEvent {
    var layout: Layout?
}

external interface Layout : XY {
    var width: Number?
    var height: Number?
}

external interface XY {
    var x: Number?
    var y: Number?
}

external interface ViewPropsBase : RProps {
    var onStartShouldSetResponder: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var accessibilityHint: String?
    var accessibilityLabel: ReactElement?
    var hitSlop: HitSlop?
    var nativeID: String?
    var onAccessibilityTap: (() -> Unit)?
    var onLayout: ((NativeEvent<LayoutEvent>) -> Unit)?
    var onMagicTap: (() -> Unit)?
    var onMoveShouldSetResponder: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var onMoveShouldSetResponderCapture: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var onResponderGrant: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var onResponderMove: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var onResponderReject: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var onResponderRelease: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var onResponderTerminate: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var onResponderTerminationRequest: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var accessible: Boolean?
    var onStartShouldSetResponderCapture: ((NativeEvent<NativeTouchEvent>) -> Boolean)?
    var removeClippedSubviews: Boolean?
    var testID: String?
    var collapsable: Boolean?
    var needsOffscreenAlphaCompositing: Boolean?
    var renderToHardwareTextureAndroid: Boolean?
    var accessibilityViewIsModal: Boolean?
    var accessibilityElementsHidden: Boolean?
    var accessibilityIgnoresInvertColors: Boolean?
    var shouldRasterizeIOS: Boolean?
}

external interface ViewProps : ViewPropsBase {
    var pointerEvents: String?
    var accessibilityLiveRegion: String?
    var importantForAccessibility: String?
    var accessibilityRole: String?
    var accessibilityStates: Array<String>?
}

external class View : Component<ViewProps, RState> {
    override fun render(): dynamic
}