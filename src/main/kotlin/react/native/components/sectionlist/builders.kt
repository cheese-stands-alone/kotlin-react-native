package react.native.components.sectionlist

import react.RBuilder
import react.RElementBuilder
import react.native.TypedProps
import kotlin.reflect.KClass

class TypedSectionListPropsProps<T>(builder: RElementBuilder<SectionListProps<T>>)
    : TypedProps<SectionListProps<T>>(builder), SectionListPropsBase<T> by builder.attrs

fun <T> RBuilder.sectionList(
        block: (TypedSectionListPropsProps<T>.() -> Unit)? = undefined
) = child(SectionList::class as KClass<SectionList<T>>) {
    if (block != undefined) TypedSectionListPropsProps(this).run { block() }
}
