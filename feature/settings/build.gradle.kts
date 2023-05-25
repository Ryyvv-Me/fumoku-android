plugins {
    id("me.ryyvv.convention.build.android.library")
    id("me.ryyvv.convention.build.androidx.compose")
}

android {
    dependencies {
        implementation(libs.androidx.navigation.compose)
    }
}
