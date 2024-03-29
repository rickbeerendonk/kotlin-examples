// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.conditions.ifelseif

import java.time.LocalDateTime

fun main() {
    val moment = LocalDateTime.now()
    val hour = moment.hour

    if (hour < 6) {
        println("Good night")
    } else if (hour < 12) {
        println("Good morning")
    } else if (hour < 18) {
        println("Good afternoon")
    } else {
        println("Good evening")
    }
}
