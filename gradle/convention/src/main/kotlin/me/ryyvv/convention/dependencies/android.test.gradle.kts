package me.ryyvv.convention.dependencies

import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.androidTestImplementation
import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.testImplementation
import me.ryyvv.convention.build.dsl.libs

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit.ktx)
}
