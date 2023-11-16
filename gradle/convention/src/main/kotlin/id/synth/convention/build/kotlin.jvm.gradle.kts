package id.synth.convention.build

import id.synth.convention.build.dsl.javaLanguageVersion
import id.synth.convention.build.dsl.libs

plugins {
    org.jetbrains.kotlin.jvm
}

kotlin {
    jvmToolchain {
        languageVersion.set(libs.versions.javaLanguageVersion)
    }
}
