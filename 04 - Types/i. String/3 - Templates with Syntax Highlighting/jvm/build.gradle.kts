// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

plugins {
    kotlin("jvm") version "2.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:26.0.1")
}

kotlin {
    jvmToolchain(21)
}
