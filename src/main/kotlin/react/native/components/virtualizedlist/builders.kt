package react.native.components.virtualizedlist

import react.RBuilder
import react.RElementBuilder
import react.native.TypedProps
import kotlin.reflect.KClass

class TypedVirtualizedListProps<T>(builder: RElementBuilder<VirtualizedListProps<T>>)
    : TypedProps<VirtualizedListProps<T>>(builder), VirtualizedListPropsBase<T> by builder.attrs

fun <T> RBuilder.virtualizedList(
        block: (TypedVirtualizedListProps<T>.() -> Unit)? = undefined
) = child(VirtualizedList::class as KClass<VirtualizedList<T>>) {
    if (block != undefined) TypedVirtualizedListProps(this).run { block() }
}
