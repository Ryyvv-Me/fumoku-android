package me.ryyvv.convention.build.dsl

import org.gradle.accessors.dm.LibrariesForLibs.VersionAccessors
import org.gradle.api.JavaVersion
import org.gradle.api.provider.Provider

internal val VersionAccessors.javaVersion: Provider<JavaVersion>
    get() = this.java.map(JavaVersion::toVersion)
