package me.ryyvv.convention.dependencies

import gradle.kotlin.dsl.accessors._34ff08b16d2a5f60e598f7635138300e.androidTestImplementation
import gradle.kotlin.dsl.accessors._34ff08b16d2a5f60e598f7635138300e.debugImplementation
import me.ryyvv.convention.build.dsl.libs

dependencies {
    // UI Tests
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}
