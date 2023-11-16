package id.synth.convention.dependencies

import id.synth.convention.build.dsl.libs

dependencies {
    add("testImplementation", libs.junit)
    add("androidTestImplementation", libs.androidx.test.ext.junit.ktx)
}
