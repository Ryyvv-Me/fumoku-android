package me.ryyvv.convention.dependencies

import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.androidTestImplementation
import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.debugImplementation
import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.libs

android {
    dependencies {
        // UI Tests
        androidTestImplementation(libs.androidx.compose.ui.test.junit4)
        debugImplementation(libs.androidx.compose.ui.test.manifest)
    }
}
