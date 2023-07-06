package me.ryyvv.convention.dependencies

import gradle.kotlin.dsl.accessors._34ff08b16d2a5f60e598f7635138300e.debugImplementation
import gradle.kotlin.dsl.accessors._34ff08b16d2a5f60e598f7635138300e.implementation
import me.ryyvv.convention.build.dsl.libs

dependencies {
    // Android Studio Preview
    implementation(libs.androidx.compose.ui.tooling.preview)
    debugImplementation(libs.androidx.compose.ui.tooling)
}
