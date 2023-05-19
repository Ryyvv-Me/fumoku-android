package me.ryyvv.convention.build

plugins {
    com.android.application

    id("me.ryyvv.convention.build.android")
}

android {
    defaultConfig.targetSdk = compileSdk
}
