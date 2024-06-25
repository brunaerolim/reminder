buildscript {

    repositories {
        google()
    }
}
plugins {
    id ("com.android.application") version "8.1.4" apply false
    id ("com.android.library") version "8.1.4" apply false
    id ("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false
}