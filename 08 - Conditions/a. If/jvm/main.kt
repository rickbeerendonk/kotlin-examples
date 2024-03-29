// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.conditions.if_

import java.time.LocalDateTime

fun main() {
    val moment = LocalDateTime.now()
    val hour = moment.hour

    // One line
    if (hour < 6 || hour >= 18) println("Good night")

    // Block
    if (hour >= 6 && hour < 18) {
        println("Good day")
    }
}
