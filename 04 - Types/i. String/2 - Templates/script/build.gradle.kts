// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

plugins {
    kotlin("multiplatform") version "2.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    js {
        browser()
        nodejs()
    }
}
