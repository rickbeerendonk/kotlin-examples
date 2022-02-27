// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun main() {
    println(UByte.MIN_VALUE) // 0
    println(UByte.MAX_VALUE) // 255

    // Explicit vs Implicit
    val explicit: UByte = 255u
    val implicit = 255u

    println(explicit::class.qualifiedName) // kotlin.UByte
    println(implicit::class.qualifiedName) // kotlin.UInt
}
