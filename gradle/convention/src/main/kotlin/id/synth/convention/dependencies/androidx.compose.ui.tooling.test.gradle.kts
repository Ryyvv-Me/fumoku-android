package id.synth.convention.dependencies

import id.synth.convention.build.dsl.libs

dependencies {
    // UI Tests
    add("androidTestImplementation", libs.androidx.compose.ui.test.junit4)
    add("debugImplementation", libs.androidx.compose.ui.test.manifest)
}
