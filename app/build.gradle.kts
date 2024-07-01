plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-parcelize")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.reminderapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.reminderapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }
}
dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.media3:media3-test-utils:1.3.1")

    // Compose
    implementation("androidx.compose.ui:ui:1.6.8")
    implementation ("androidx.compose.foundation:foundation:1.6.8")
    implementation ("androidx.compose.material:material:1.6.8")
    implementation ("androidx.activity:activity-compose:1.9.0")
    implementation ("androidx.compose.material3:material3:1.2.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.2")
    implementation ("androidx.compose.runtime:runtime-livedata:1.6.8")

    // Compose preview tools
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.8")
    implementation("androidx.compose.ui:ui-tooling:1.6.8")
    // ROOM
    implementation("androidx.room:room-runtime:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    ksp("androidx.lifecycle:lifecycle-common:2.8.2")
    ksp("androidx.room:room-compiler:2.6.1")
    // Coroutines
    implementation ("androidx.room:room-ktx:2.6.1")
    // Lifecycle
    val lifecycleVersion = "2.8.2"
    implementation("androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")

    testImplementation ("androidx.lifecycle:lifecycle-runtime-testing:2.8.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation("androidx.databinding:compilerCommon:3.2.0-alpha11")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
    testImplementation("androidx.arch.core:core-testing:2.2.0")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    androidTestImplementation ("androidx.compose.ui:ui-test-manifest")

}
