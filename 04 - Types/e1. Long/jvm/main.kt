// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.types.long

fun main() {
    println(Long.MIN_VALUE)  // -9223372036854775808
    println(Long.MAX_VALUE)  // 9223372036854775807

    // Explicit vs Implicit
    val explicit: Long = 1
    val implicit1 = 1
    val implicit2 = 1L
    val implicit3 = 2147483648  // Max Int + 1

    println(explicit::class.qualifiedName)  // kotlin.Long
    println(implicit1::class.qualifiedName) // kotlin.Int
    println(implicit2::class.qualifiedName) // kotlin.Long
    println(implicit3::class.qualifiedName) // kotlin.Long
}
