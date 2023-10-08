package internal

import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureKotlin(
    kotlinBasePlugin: KotlinBasePlugin,
) {
    kotlinBasePlugin.apply {
        tasks.withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = ApplicationConstants.JavaVersion.toString()
            }
        }
    }
}
