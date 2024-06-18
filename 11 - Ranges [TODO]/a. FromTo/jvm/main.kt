// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.ranges.fromto

fun main() {
    val range = 1..5
    println(range)
    println(range.toList())
    println(range::class.simpleName)
}

// 1..5
// [1, 2, 3, 4, 5]
// IntRange