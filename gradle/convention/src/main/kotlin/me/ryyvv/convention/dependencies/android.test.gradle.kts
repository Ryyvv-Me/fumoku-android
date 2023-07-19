package me.ryyvv.convention.dependencies

import me.ryyvv.convention.build.dsl.libs

dependencies {
    add("testImplementation", libs.junit)
    add("androidTestImplementation", libs.androidx.test.ext.junit.ktx)
}
