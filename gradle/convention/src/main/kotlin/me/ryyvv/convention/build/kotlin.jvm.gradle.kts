package me.ryyvv.convention.build

import me.ryyvv.convention.build.dsl.javaLanguageVersion
import me.ryyvv.convention.build.dsl.libs
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    org.jetbrains.kotlin.jvm
}

kotlin {
    compilerOptions {
        languageVersion.set(KotlinVersion.KOTLIN_2_0)
        apiVersion.set(KotlinVersion.KOTLIN_2_0)
    }
    jvmToolchain {
        languageVersion.set(libs.versions.javaLanguageVersion)
    }
}
