package internal

internal object ApplicationConstants {
    const val MinSdk = 24
    const val TargetSdk = 34
    const val CompileSdk = 34
    const val VersionCode = 1
    const val VersionName = "1.0"
    val JavaVersion = org.gradle.api.JavaVersion.VERSION_17
    const val JavaVersionAsInt = 17

    const val ComposeCompilerVersion = "1.5.1"
    const val TestInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    object BuildTypes {
        const val Release = "release"
        const val Debug = "debug"
    }

    object Proguard {
        const val TxtFile = "proguard-android-optimize.txt"
        const val RulesFile = "proguard-rules.pro"
    }

    object Packaging {
        const val ExcludeResources = "/META-INF/{AL2.0,LGPL2.1}"
    }
}