// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.enumclasses.stringtoenum

enum class DutchIcon(val description: String) {
    TULIP("Famous for its tulip fields"),
    WINDMILL("Symbolic of Dutch innovation in water management"),
    CHEESE("Renowned for Gouda and Edam cheeses"),
    CANAL("Characteristic of cities like Amsterdam"),
    BICYCLE("A popular mode of transportation in The Netherlands"),
    STROOPWAFEL("A traditional Dutch waffle with a caramel filling");
}

fun main() {
    val text = "Stroopwafel"
    val icon = DutchIcon.valueOf(text.toUpperCase())
    println(icon)               // STROOPWAFEL
    println(icon.description)   // A traditional Dutch waffle with a caramel filling
}