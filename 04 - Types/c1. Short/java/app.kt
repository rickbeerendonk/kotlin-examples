// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun main() {
    println(Short.MIN_VALUE)  // -32768
    println(Short.MAX_VALUE)  // 32767

    // Explicit vs Implicit
    val explicit: Short = 32767
    val implicit = 32767

    println(explicit::class.qualifiedName) // kotlin.Short
    println(implicit::class.qualifiedName) // kotlin.Int
}
