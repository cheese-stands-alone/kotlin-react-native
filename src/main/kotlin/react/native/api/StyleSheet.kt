@file:JsModule("react-native")
package react.native.api

external interface StyleHolder

external interface Style

external object StyleSheet {
    val absoluteFillObject: Any
    val hairlineWidth: Any
    val absoluteFill: Any
    fun <T : StyleHolder> create(style: T): T
    fun flatten(styles: Array<Style>): Style
}