plugins {
    id("com.android.library") // Eğer bu bir kütüphane modülü ise
    // id("com.android.application") // Eğer bu bir uygulama modülü ise bunu açın
    id("org.jetbrains.kotlin.android") // Kotlin Android desteği
    id("kotlin-kapt") // KAPT desteği
}

android {
    namespace = "org.csystem.android.activity"
    compileSdk = 35

    defaultConfig {
        minSdk = 22

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    dataBinding.enable = true
}

dependencies {
    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v1110)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.constraintlayout.v214)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)

    coreLibraryDesugaring(libs.desugar.jdk.libs)

    // Dagger Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}

kapt {
    correctErrorTypes = true
}
