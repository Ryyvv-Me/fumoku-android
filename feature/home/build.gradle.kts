plugins {
    alias(libs.plugins.android.library)
    id("me.ryyvv.convention.build.android")
    id("me.ryyvv.convention.build.androidx.compose")
}

android {
    dependencies {
        implementation(libs.androidx.compose.material3)
        implementation(libs.androidx.navigation.compose)
    }
}
