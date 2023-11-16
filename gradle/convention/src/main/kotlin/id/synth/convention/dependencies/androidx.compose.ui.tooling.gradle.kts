package id.synth.convention.dependencies

import id.synth.convention.build.dsl.libs

dependencies {
    // Android Studio Preview
    add("implementation", libs.androidx.compose.ui.tooling.preview)
    add("debugImplementation", libs.androidx.compose.ui.tooling)
}
