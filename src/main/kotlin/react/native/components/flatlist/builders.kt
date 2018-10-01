package react.native.components.flatlist

import react.RBuilder
import react.RElementBuilder
import react.native.TypedProps
import kotlin.reflect.KClass

class TypedFlatListProps<T>(builder: RElementBuilder<FlatListProps<T>>)
    : TypedProps<FlatListProps<T>>(builder), FlatListPropsBase by builder.attrs

fun <T> RBuilder.flatList(
        block: (TypedFlatListProps<T>.() -> Unit)? = undefined
) = child(FlatList::class as KClass<FlatList<T>>) {
    if (block != undefined) TypedFlatListProps(this).run { block() }
}
