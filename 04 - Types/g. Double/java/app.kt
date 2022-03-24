// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun main() {
    // Min and Max

    println(Double.MIN_VALUE)  // 4.9E-324
    println(Double.MAX_VALUE)  // 1.7976931348623157E308

    // Explicit vs Implicit

    val explicit: Double = 1.23
    val implicit = 1.23

    println(explicit::class.qualifiedName)  // kotlin.Double
    println(implicit::class.qualifiedName)  // kotlin.Double

    // Literal constants

    println(1.23)    //     1.23  (Standard)
    println(1.23e4)  // 12300.0   (Exponential)

    // Underscores

    println(1.23456789)    // 1.23456789
    println(1.234_567_89)  // 1.23456789
}
