plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlin.qa)
    alias(libs.plugins.kotlin.serialization)
}

repositories { mavenCentral() }

dependencies {
    implementation(libs.bundles.kotlin.serialization.bundle)
    implementation(libs.turtle)
}

java { targetCompatibility = JavaVersion.VERSION_1_8 }
