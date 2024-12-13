// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.coroutines.simple

import kotlinx.coroutines.*

runBlocking {
    launch {
        delay(1000L)
        println("From coroutine")
    }
    println("End")
}
