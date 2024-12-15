// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.coroutines.simple

import kotlinx.coroutines.*
import com.coroutines.print.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        coroutinePrintln("From coroutine")
    }
    coroutinePrintln("End")
}
