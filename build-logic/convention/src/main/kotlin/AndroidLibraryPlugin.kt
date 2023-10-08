import com.android.build.api.dsl.LibraryExtension
import internal.ApplicationConstants
import internal.configureAndroid
import internal.configureKotlin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePlugin

// Android Library 설정
internal class AndroidLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(Plugins.Android.Library)
                apply(Plugins.Kotlin.Android)
            }
            plugins.withType(KotlinBasePlugin::class) {
                configureKotlin(this)
            }
            extensions.configure<LibraryExtension> {
                configureAndroid(this)
            }
        }
    }
}