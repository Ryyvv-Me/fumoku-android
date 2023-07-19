package me.ryyvv.convention.dependencies

import me.ryyvv.convention.build.dsl.libs

dependencies {
    // Android Studio Preview
    add("implementation", libs.androidx.compose.ui.tooling.preview)
    add("debugImplementation", libs.androidx.compose.ui.tooling)
}
