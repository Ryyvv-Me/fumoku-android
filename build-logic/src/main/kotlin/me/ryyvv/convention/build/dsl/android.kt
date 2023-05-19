package me.ryyvv.convention.build.dsl

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.get
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

/*
 * Used for emulating `android` extension and block in convention plugin.
 */

internal val Project.android: CommonExtension<*, *, *, *, *>
    get() = this.extensions["android"] as CommonExtension<*, *, *, *, *>

internal fun Project.android(block: Action<CommonExtension<*, *, *, *, *>>) = block.execute(android)

internal fun CommonExtension<*, *, *, *, *>.kotlinOptions(block: KotlinJvmOptions.() -> Unit) =
    (this as ExtensionAware).extensions.configure("kotlinOptions", block)
