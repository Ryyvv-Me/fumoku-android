package me.ryyvv.convention.build

import me.ryyvv.convention.build.dsl.javaLanguageVersion
import me.ryyvv.convention.build.dsl.libs

plugins {
    org.jetbrains.kotlin.jvm
}

kotlin {
    jvmToolchain {
        languageVersion.set(libs.versions.javaLanguageVersion)
    }
}
