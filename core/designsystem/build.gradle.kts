plugins {
    id("gold24park-android-library-compose")
}

android {
    namespace = "com.gold24park.multimodule.core.designsystem"
}

dependencies {
    implementation(project(":core:resource"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.androidx.compose)
}