// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.operators.openendedranges

// NEW in v1.9

fun main() {
    val a = 10

    println(a in 1..10)  // true
    println(a in 1..<10) // false
}
