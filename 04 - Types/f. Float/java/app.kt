// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun main() {
    // Min and Max

    println(Float.MIN_VALUE)  // 1.4E-45
    println(Float.MAX_VALUE)  // 3.4028235E38

    // Explicit vs Implicit

    val explicit: Float = 1.23F
    val implicit1 = 1.23
    val implicit2 = 1.23F

    println(explicit::class.qualifiedName)  // kotlin.Float
    println(implicit1::class.qualifiedName) // kotlin.Double
    println(implicit2::class.qualifiedName) // kotlin.Float

    // Literal constants

    println(1.23F)    //     1.23  (Standard)
    println(1.23e4F)  // 12300.0   (Exponential)
}
