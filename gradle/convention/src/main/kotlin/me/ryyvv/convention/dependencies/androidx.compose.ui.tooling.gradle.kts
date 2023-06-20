package me.ryyvv.convention.dependencies

import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.debugImplementation
import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.implementation
import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.libs

android {
    dependencies {
        // Android Studio Preview
        implementation(libs.androidx.compose.ui.tooling.preview)
        debugImplementation(libs.androidx.compose.ui.tooling)
    }
}
