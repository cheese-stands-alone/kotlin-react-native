package react.native.components.safeareaview

import react.RBuilder
import react.RElementBuilder
import react.native.TypedProps

class TypedSafeAreaViewProps(builder: RElementBuilder<SafeAreaViewProps>) : TypedProps<SafeAreaViewProps>(builder)

fun RBuilder.safeAreaView(
        block: (TypedSafeAreaViewProps.() -> Unit)? = undefined
) = child(SafeAreaView::class) {
    if (block != undefined) TypedSafeAreaViewProps(this).run { block() }
}