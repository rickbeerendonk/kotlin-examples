// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.operators.comparison.greater

fun main() {
    var a = 1
    var b = 1
    var c = 2

    // 1 > 1
    println(a > b) // false

    // 1 > 2
    println(a > c) // false

    // 2 > 1
    println(c > a) // true
}
