@file:JsModule("react-native")

package react.native.components.maskedviewIOS

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.components.view.ViewProps

external interface MaskedViewIOSPropsBase : RProps {
    var maskElement: ReactElement
}

external interface MaskedViewIOSProps : MaskedViewIOSPropsBase, ViewProps

external class MaskedViewIOS : Component<MaskedViewIOSProps, RState> {
    override fun render(): dynamic
}