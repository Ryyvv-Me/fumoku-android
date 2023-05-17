package me.ryyvv.convention.build

import me.ryyvv.convention.build.dsl.libs

plugins {
    com.android.application
}

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
