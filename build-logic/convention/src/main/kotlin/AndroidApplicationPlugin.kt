import com.android.build.api.dsl.ApplicationExtension
import internal.ApplicationConstants
import internal.configureAndroid
import internal.configureKotlin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePlugin

// :app 설정
internal class AndroidApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with (pluginManager) {
                apply(Plugins.Android.Application)
                apply(Plugins.Kotlin.Android)
            }
            plugins.withType(KotlinBasePlugin::class) {
                configureKotlin(this)
            }
            extensions.configure<ApplicationExtension> {
                configureAndroid(this)
                defaultConfig {
                    targetSdk = ApplicationConstants.TargetSdk
                    versionCode = ApplicationConstants.VersionCode
                    versionName = ApplicationConstants.VersionName
                }
            }
        }
    }
}

