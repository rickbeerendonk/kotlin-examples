// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.withoutparametersreturn

// Implicit return
fun one() {
    println("One")
}

// Explicit return
fun two(): Unit {
    println("Two")
}

fun main() {
    one()
    two()
}
