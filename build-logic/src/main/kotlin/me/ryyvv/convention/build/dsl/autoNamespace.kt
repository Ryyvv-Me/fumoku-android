package me.ryyvv.convention.build.dsl

import org.gradle.api.Project

internal val Project.autoNamespace: String
    get() {
        val `package` = rootProject.name
        val subpackage = project
            .path
            .removePrefix(":app")
            .replace(":", ".")

        return "me.ryyvv.$`package`$subpackage"
    }
