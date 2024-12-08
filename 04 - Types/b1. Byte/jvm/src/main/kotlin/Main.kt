// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.types.byte

fun main() {
    println(Byte.MIN_VALUE) // -128
    println(Byte.MAX_VALUE) // 127

    // Explicit vs Implicit
    val explicit: Byte = 127
    val implicit = 127

    println(explicit::class.qualifiedName) // kotlin.Byte
    println(implicit::class.qualifiedName) // kotlin.Int
}
