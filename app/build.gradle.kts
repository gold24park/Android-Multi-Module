plugins {
    id("gold24park-android-application")
    id("gold24park-hilt")
}

android {
    val packageName = "com.gold24park.multimodule"
    namespace = packageName
    defaultConfig {
        applicationId = packageName
    }
}


dependencies {
    // feature
    implementation(project(":feature:games"))
    // core
    implementation(project(":core:resource"))
    implementation(project(":core:designsystem"))
    // android
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime)
    // compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.androidx.compose)
    // test
    testImplementation(libs.junit)
    androidTestImplementation(libs.bundles.android.test)
    debugImplementation(libs.bundles.androidx.compose.debug)
}