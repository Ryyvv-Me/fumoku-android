package me.ryyvv.convention.build

import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.kotlinOptions

plugins {
    org.jetbrains.kotlin.android
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
