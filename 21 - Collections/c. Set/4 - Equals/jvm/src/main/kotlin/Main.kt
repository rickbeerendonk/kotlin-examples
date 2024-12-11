// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.collections.set.equals

fun main() {
    val s1 = setOf("A", "B", "C")
    val s2 = setOf("C", "B", "A")
    println(s1 == s2)  // true
}