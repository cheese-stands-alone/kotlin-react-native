@file:JsModule("react-native")

package react.native.components.snapshotviewios

import react.Component
import react.RProps
import react.RState
import react.native.components.view.ViewProps

external interface SnapshotViewIOSPropsBase : RProps {
    var onSnapshotReady: (() -> Unit)?
    var testIdentifier: String?
}

external interface SnapshotViewIOSProps : SnapshotViewIOSPropsBase, ViewProps

external class SnapshotViewIOS : Component<SnapshotViewIOSProps, RState> {
    override fun render(): dynamic
}