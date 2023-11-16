package id.synth.convention

import id.synth.convention.build.dsl.libs

plugins {
    id("id.synth.convention.build.ksp")

    com.google.dagger.hilt.android
}

dependencies {
    add("implementation", libs.hilt.android)
    add("ksp", libs.hilt.android.compiler)
}
