buildscript {
    repositories {
        google()
    }
    dependencies {
        val nav_version = "2.5.3"
        val classpath =
            classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
}