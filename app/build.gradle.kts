plugins {
    id("me.ryyvv.convention.app")
}

android {
    defaultConfig {
        applicationId = namespace
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)

    // Compose
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)

    // Projects
    implementation(project(":feature:home"))
    implementation(project(":feature:settings"))
}
