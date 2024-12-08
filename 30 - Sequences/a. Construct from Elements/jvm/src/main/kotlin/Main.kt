// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.sequences.constructfromelements

fun main() {
    val citySequence = sequenceOf("Amsterdam", "Rotterdam", "Utrecht", "Den Haag", "Eindhoven")

    for (city in citySequence) {
        println(city)
    }
}
