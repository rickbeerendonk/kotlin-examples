// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("From coroutine")
    }
    println("End")
}
