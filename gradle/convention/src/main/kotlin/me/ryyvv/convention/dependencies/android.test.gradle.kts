package me.ryyvv.convention.dependencies

import gradle.kotlin.dsl.accessors._34ff08b16d2a5f60e598f7635138300e.androidTestImplementation
import gradle.kotlin.dsl.accessors._34ff08b16d2a5f60e598f7635138300e.testImplementation
import me.ryyvv.convention.build.dsl.libs

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit.ktx)
}
