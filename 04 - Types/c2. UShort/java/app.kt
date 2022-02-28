// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun main() {
    println(UShort.MIN_VALUE) // 0
    println(UShort.MAX_VALUE) // 65535

    // Explicit vs Implicit
    val explicit: UShort = 65535U
    val implicit = 65535U

    println(explicit::class.qualifiedName) // kotlin.UShort
    println(implicit::class.qualifiedName) // kotlin.UInt
}
