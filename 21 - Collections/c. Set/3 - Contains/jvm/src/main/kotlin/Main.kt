// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.collections.set.contains

fun main() {
    val s = setOf("A", "B", "C")
    println(s.contains("C"))  // true
    println(s.contains("D"))  // false
}