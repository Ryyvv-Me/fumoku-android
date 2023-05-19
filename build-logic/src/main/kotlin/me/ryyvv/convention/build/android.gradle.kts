package me.ryyvv.convention.build

import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.autoNamespace

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
