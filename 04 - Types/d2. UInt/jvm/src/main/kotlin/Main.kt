// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.types.uint

fun main() {
    println(UInt.MIN_VALUE)  // 0
    println(UInt.MAX_VALUE)  // 4294967295

    // Explicit vs Implicit
    val explicit: UInt = 4294967295U
    val implicit = 4294967295U

    println(explicit::class.qualifiedName) // kotlin.UInt
    println(implicit::class.qualifiedName) // kotlin.UInt
}
