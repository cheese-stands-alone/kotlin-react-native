@file:JsModule("react-native")

package react.native.api

import react.Component

external interface AppConfig {
    var appKey: String
    var component: (() -> JsClass<Component<*, *>>)?
    var run: (dynamic) -> Unit
}

external object AppRegistry {
    fun registerConfig(config: Array<AppConfig>)
    fun <T : Component<*, *>> registerComponent(name: String, createComponent: () -> JsClass<T>): String
    fun registerRunnable(appKey: String, run: (dynamic) -> Unit): String
    fun getAppKeys(): Array<String>
    fun unmountApplicationComponentAtRootTag(rootTag: Number)
    fun runApplication(appKey: String, appParameters: dynamic)
}