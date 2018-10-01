package react.native.components.snapshotviewios

import react.RBuilder
import react.RElementBuilder
import react.native.components.view.TypedViewProps

class TypedSnapshotViewIOSProps(builder: RElementBuilder<SnapshotViewIOSProps>)
    : TypedViewProps<SnapshotViewIOSProps>(builder), SnapshotViewIOSPropsBase by builder.attrs

fun RBuilder.snapshotViewIOS(
        block: (TypedSnapshotViewIOSProps.() -> Unit)? = undefined
) = child(SnapshotViewIOS::class) {
    if (block != undefined) TypedSnapshotViewIOSProps(this).run { block() }
}
