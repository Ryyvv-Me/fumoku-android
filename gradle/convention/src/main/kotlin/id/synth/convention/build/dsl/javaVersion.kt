/*
 * Copyright 2023 Synth.ID
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

package id.synth.convention.build.dsl

import org.gradle.accessors.dm.LibrariesForLibs.VersionAccessors
import org.gradle.api.JavaVersion
import org.gradle.api.provider.Provider
import org.gradle.jvm.toolchain.JavaLanguageVersion

internal val VersionAccessors.javaVersion: Provider<JavaVersion>
    get() = this.java.map(JavaVersion::toVersion)

internal val VersionAccessors.javaLanguageVersion: Provider<JavaLanguageVersion>
    get() = this.java.map(JavaLanguageVersion::of)
