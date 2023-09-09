package me.ryyvv.convention.build

import me.ryyvv.convention.build.dsl.javaLanguageVersion
import me.ryyvv.convention.build.dsl.libs
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    org.jetbrains.kotlin.jvm
}

kotlin {
    jvmToolchain {
        languageVersion.set(libs.versions.javaLanguageVersion)
    }
}
