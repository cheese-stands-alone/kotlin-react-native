@file:JsModule("react-native")

package react.native.components.inputaccessoryview

import react.Component
import react.RProps
import react.RState

external interface InputAccessoryViewPropsBase : RProps {
    var nativeID: String?
}

external interface InputAccessoryViewProps : InputAccessoryViewPropsBase {
    var backgroundColor: String?
}

external class InputAccessoryView : Component<InputAccessoryViewProps, RState> {
    override fun render(): dynamic

    fun scrollToEnd()
    fun scrollToIndex()
    fun scrollToIndex(params: dynamic)
    fun scrollToItem()
    fun scrollToItem(params: dynamic)
    fun scrollToOffset()
    fun scrollToOffset(params: dynamic)
    fun recordInteraction()
    fun flashScrollIndicators()
}