package me.ryyvv.convention.build

import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.androidTestImplementation
import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.implementation
import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.libs

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.6"
    }

    dependencies {
        val composeBom = platform(libs.androidx.compose.bom)
        implementation(composeBom)
        androidTestImplementation(composeBom)
    }
}
