// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.destructuring.list

fun main() {
    val (first, second, third) = listOf("one", "two", "three")

    println(first)   // one
    println(second)  // two
    println(third)   // three
}
