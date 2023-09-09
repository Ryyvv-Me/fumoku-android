package me.ryyvv.convention

import me.ryyvv.convention.build.dsl.libs

plugins {
    id("me.ryyvv.convention.build.ksp")

    com.google.dagger.hilt.android
}

dependencies {
    add("implementation", libs.hilt.android)
    add("ksp", libs.hilt.android.compiler)
}
