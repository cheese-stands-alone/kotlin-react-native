@file:JsModule("react-native")

package react.native.components.textinput

import react.Component
import react.RProps
import react.RState
import react.native.components.view.LayoutEvent
import react.native.components.view.NativeEvent
import react.native.components.view.ViewProps
import react.native.components.view.XY

external interface TextInputContentSizeChangeEventData {
    var contentSize: InputContentSizeChange?
}

external interface InputContentSizeChange {
    var width: Number?
    var height: Number?
}

external interface TextInputEndEditingEventData {
    var text: String?
}

external interface TextInputChangeEventData {
    var eventCount: Number?
    var target: Number?
    var text: String?
}

external interface TextInputKeyPressEventData {
    var key: String?
}

external interface TextInputScrollEventData {
    var contentOffset: XY?
}

external interface TextInputSelectionChangeEventData {
    var selection: Section?
    var target: Number?
}

external interface Section {
    var start: Number?
    var end: Number?
}

external interface TextInputSubmitEditingEventData {
    var text: String?
}


external interface TextInputPropsBase : RProps {
    var allowFontScaling: Boolean?
    var autoCorrect: Boolean?
    var autoFocus: Boolean?
    var blurOnSubmit: Boolean?
    var caretHidden: Boolean?
    var clearTextOnFocus: Boolean?
    var contextMenuHidden: Boolean?
    var defaultValue: String?
    var disableFullscreenUI: Boolean?
    var editable: Boolean?
    var enablesReturnKeyAutomatically: Boolean?
    var inlineImageLeft: String
    var inlineImagePadding: Number?
    var maxLength: Number
    var multiline: Boolean?
    var numberOfLines: Boolean
    var onBlur: ((NativeEvent<TextInputChangeEventData>) -> Unit)?
    var onChange: ((NativeEvent<TextInputChangeEventData>) -> Unit)?
    var onChangeText: ((String) -> Unit)?
    var onContentSizeChange: ((NativeEvent<TextInputContentSizeChangeEventData>) -> Unit)?
    var onEndEditing: ((NativeEvent<TextInputEndEditingEventData>) -> Unit)?
    var onFocus: ((NativeEvent<TextInputChangeEventData>) -> Unit)?
    var onKeyPress: ((NativeEvent<TextInputKeyPressEventData>) -> Unit)?
    var onScroll: ((NativeEvent<TextInputScrollEventData>) -> Unit)?
    var onSelectionChange: ((NativeEvent<TextInputSelectionChangeEventData>) -> Unit)?
    var onSubmitEditing: ((NativeEvent<TextInputSubmitEditingEventData>) -> Unit)?
    var placeholder: String?
    var returnKeyLabel: String?
    var scrollEnabled: Boolean?
    var secureTextEntry: Boolean?
    var selection: Section?
    var selectTextOnFocus: Boolean?
    var spellCheck: Boolean?
    var value: String
}

external interface TextInputProps : TextInputPropsBase, ViewProps {
    var autoCapitalize: String?
    var clearButtonMode: String?
    var dataDetectorTypes: Array<String>?
    var keyboardAppearance: String?
    var keyboardType: String?
    var placeholderTextColor: String?
    var returnKeyType: String?
    var selectionColor: String?
    var textContentType: String?
    var textBreakStrategy: String?
    var underlineColorAndroid: String?
}

external class TextInput : Component<TextInputProps, RState> {
    override fun render(): dynamic

    fun clear()
    fun isFocused(): Boolean
}