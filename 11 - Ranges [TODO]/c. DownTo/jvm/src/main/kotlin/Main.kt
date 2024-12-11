// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.ranges.downto

fun main() {
    val range = 5 downTo 1
    println(range)
    println(range.toList())
    println(range::class.simpleName)
}

// 5 downTo 1 setp 1
// [5, 4, 3, 2, 1]
// IntProgression
