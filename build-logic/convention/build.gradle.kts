import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.gradle.android)
    compileOnly(libs.kotlin.gradle)
}

typealias PluginClassName = String
typealias PluginName = String

gradlePlugin {
    val pluginClasses: Map<PluginClassName, PluginName> = mapOf(
        "AndroidApplicationPlugin" to "android-application",
        "AndroidLibraryPlugin" to "android-library",
        "AndroidLibraryComposePlugin" to "android-library-compose",
        "FeaturePlugin" to "feature",
        "HiltPlugin" to "hilt",
    )
    plugins {
        pluginClasses.forEach { (className, name) ->
            register(name) {
                implementationClass = className
                id = "gold24park-$name"
            }
        }
    }
}