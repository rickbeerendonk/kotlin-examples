// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.sequences.constructfromiterable

fun main() {
    val cities = listOf("Amsterdam", "Rotterdam", "Utrecht", "Den Haag", "Eindhoven")
    val citySequence = cities.asSequence()

    for (city in citySequence) {
        println(city)
    }
}
