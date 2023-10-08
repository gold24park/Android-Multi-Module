plugins {
    id("gold24park-android-library")
}

android {
    namespace = "com.gold24park.multimodule.core.resource"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
}