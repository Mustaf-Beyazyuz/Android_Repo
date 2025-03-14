plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    namespace = "com.mustafabeyazyuz.android.hilt"
    compileSdk = 35


    defaultConfig {
        applicationId = "com.mustafabeyazyuz.android.hilt"
        minSdk = 26
        targetSdk = 34
        versionCode = 20
        versionName = "21.0.0 "

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    dataBinding.enable = true
}

dependencies {

    implementation(project(":DateTimeInfoLib"))
    implementation(files("libs/org-csystem-android-util-datetime-release-21.0.0.aar"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.4")
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

}

kapt {
    correctErrorTypes = true
}