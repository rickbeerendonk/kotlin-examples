// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

plugins {
    kotlin("jvm") version "2.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.9.0")
}

kotlin {
    jvmToolchain(21)
}
