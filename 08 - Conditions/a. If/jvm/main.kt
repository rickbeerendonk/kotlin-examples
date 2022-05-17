// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.conditions.if_

import java.time.LocalDateTime

fun main() {
    val moment = LocalDateTime.now()
    val hour = moment.hour

    if (hour < 12) {
        println("Good morning")
    }

    println("Welcome!")
}
