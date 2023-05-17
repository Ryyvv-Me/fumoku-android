plugins {
    `kotlin-dsl`
}

group = "me.ryyvv.convention"

dependencies {
    // https://github.com/gradle/gradle/issues/15383
    implementation(files(libs::class.java.superclass.protectionDomain.codeSource.location))

    implementation(libs.gradle.android)
    implementation(libs.gradle.kotlin)
}
