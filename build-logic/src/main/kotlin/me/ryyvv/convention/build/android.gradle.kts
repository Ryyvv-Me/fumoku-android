package me.ryyvv.convention.build

import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.androidTestImplementation
import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.testImplementation
import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.autoNamespace
import me.ryyvv.convention.build.dsl.libs

plugins {
    id("me.ryyvv.convention.build.kotlin.android")
}

android {
    namespace = project.autoNamespace
    compileSdk = 33

    defaultConfig {
        minSdk = 24
    }
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit.ktx)
}
