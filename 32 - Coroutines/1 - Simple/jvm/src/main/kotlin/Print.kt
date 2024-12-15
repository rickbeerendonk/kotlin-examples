// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package com.coroutines.print

import kotlinx.coroutines.job
import kotlinx.datetime.Clock
import kotlinx.datetime.toLocalDateTime

// ANSI colorcodes
const val RESET = "\u001B[0m"
const val BLACK = "\u001B[30m"
const val MAGENTA = "\u001B[35m"
const val WHITE = "\u001B[37m"
const val GRAY_BACKGROUND = "\u001B[100m"

suspend fun coroutinePrintln(message: String) {
    val timestamp = (Clock.System.now().toEpochMilliseconds() / 1000.0)
    val formattedTimestamp = "%.3f".format(timestamp)
    println("$formattedTimestamp $MAGENTA${kotlin.coroutines.coroutineContext.job}$RESET $message")
}
