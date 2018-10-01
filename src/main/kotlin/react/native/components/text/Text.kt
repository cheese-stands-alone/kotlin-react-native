@file:JsModule("react-native")

package react.native.components.text

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.components.scrollview.Insets
import react.native.components.view.LayoutEvent
import react.native.components.view.NativeEvent

external interface TextPropsBase : RProps {
    var selectable: Boolean?
    var accessibilityHint: String?
    var accessibilityLabel: ReactElement?
    var accessible: Boolean?
    var nativeID: String?
    var numberOfLines: Number?
    var onLayout: ((NativeEvent<LayoutEvent>) -> Unit)?
    var onLongPress: (() -> Unit)?
    var onPress: (() -> Unit)?
    var pressRetentionOffset: Insets?
    var allowFontScaling: Boolean?
    var testID: String?
    var disabled: Boolean?
    var adjustsFontSizeToFit: Boolean?
    var minimumFontScale: Number?
    var suppressHighlighting: Boolean?
}

external interface TextProps : TextPropsBase {
    var ellipsizeMode: String?
    var selectionColor: String?
    var textBreakStrategy: String?
}

external class Text : Component<TextProps, RState> {
    override fun render(): dynamic
}