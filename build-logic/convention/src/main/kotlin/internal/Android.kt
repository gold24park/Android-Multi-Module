package internal

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

// Android Project 공통 설정
internal fun Project.configureAndroid(
    extension: CommonExtension<*, *, *, *, *>,
) {
    extension.apply {
        configureAndroidCompose(this)

        compileSdk = ApplicationConstants.CompileSdk

        defaultConfig {
            minSdk = ApplicationConstants.MinSdk
            testInstrumentationRunner = ApplicationConstants.TestInstrumentationRunner
            vectorDrawables.useSupportLibrary = true
        }

        buildFeatures {
            buildConfig = true
            viewBinding = true
        }

        compileOptions {
            sourceCompatibility = ApplicationConstants.JavaVersion
            targetCompatibility = ApplicationConstants.JavaVersion
        }

        buildTypes {
            named(ApplicationConstants.BuildTypes.Release) {
                isMinifyEnabled = false
                proguardFiles(
                    getDefaultProguardFile(ApplicationConstants.Proguard.TxtFile),
                    ApplicationConstants.Proguard.RulesFile
                )
            }
        }

        packaging {
            resources {
                excludes += ApplicationConstants.Packaging.ExcludeResources
            }
        }
    }
}

internal fun Project.configureAndroidCompose(
    extension: CommonExtension<*, *, *, *, *>
) {
    extension.apply {
        buildFeatures {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = ApplicationConstants.ComposeCompilerVersion
        }
    }
}

