package me.ryyvv.convention.dependencies

import me.ryyvv.convention.build.dsl.libs

dependencies {
    // UI Tests
    add("androidTestImplementation", libs.androidx.compose.ui.test.junit4)
    add("debugImplementation", libs.androidx.compose.ui.test.manifest)
}
