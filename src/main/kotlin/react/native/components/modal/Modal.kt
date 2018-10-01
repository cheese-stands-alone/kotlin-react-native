@file:JsModule("react-native")

package react.native.components.modal

import react.Component
import react.RProps
import react.RState
import react.native.components.view.NativeEvent

external interface ModalPropsBase : RProps {
    var visible: Boolean?
    var onRequestClose: (() -> Unit)?
    var onShow: ((NativeEvent<dynamic>) -> Unit)?
    var transparent: Boolean?
    var hardwareAccelerated: Boolean?
    var onDismiss: (() -> Unit)?
    var onOrientationChange: ((NativeEvent<dynamic>) -> Unit)?

}

external interface ModalProps : ModalPropsBase {
    var supportedOrientations: String?
    var animationType: String?
    var presentationStyle: String?
}

external class Modal : Component<ModalProps, RState> {
    override fun render(): dynamic
}