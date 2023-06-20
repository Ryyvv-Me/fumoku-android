/*
 * Copyright 2023 Ryyvv Assoc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.ryyvv.convention.build

import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.androidTestImplementation
import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.debugImplementation
import gradle.kotlin.dsl.accessors._47545ee4044af277c92cdb30c1d58315.implementation
import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.libs

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }

    dependencies {
        val composeBom = platform(libs.androidx.compose.bom)
        implementation(composeBom)
        androidTestImplementation(composeBom)

        implementation(libs.androidx.compose.material3)

        // Android Studio Preview
        implementation(libs.androidx.compose.ui.tooling.preview)
        debugImplementation(libs.androidx.compose.ui.tooling)

        // UI Tests
        androidTestImplementation(libs.androidx.compose.ui.test.junit4)
        debugImplementation(libs.androidx.compose.ui.test.manifest)
    }
}
