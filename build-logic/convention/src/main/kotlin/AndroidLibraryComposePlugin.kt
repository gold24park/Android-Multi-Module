import com.android.build.api.dsl.LibraryExtension
import internal.configureAndroid
import internal.configureAndroidCompose
import internal.configureKotlin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePlugin

internal class AndroidLibraryComposePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with (target) {
            with(pluginManager) {
                apply(Plugins.Android.Library)
                apply(Plugins.Kotlin.Android)
            }
            plugins.withType(KotlinBasePlugin::class) {
                configureKotlin(this)
            }
            extensions.configure<LibraryExtension> {
                configureAndroid(this)
                configureAndroidCompose(this)
            }
        }
    }
}