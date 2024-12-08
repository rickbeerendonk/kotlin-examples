// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.sequences.constructfromfunction

fun main() {
    val citySequence = sequence {
        yield("Amsterdam")
        yield("Rotterdam")
        yieldAll(listOf("Utrecht", "Den Haag", "Eindhoven"))
    }

    for (city in citySequence) {
        println(city)
    }
}
