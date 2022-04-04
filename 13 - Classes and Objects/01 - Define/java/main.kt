// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.one

// Define
class Empty

fun main() {
    // Create
    val empty = Empty()

    println(empty::class.qualifiedName) // org.one.Empty
}
