// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.parameters.require

fun one(a: String) {
    // Require throws an IllegalArgumentException if the value is false.
    require(a != "")

    println(a)
}

fun main() {
    one("abc")
    one("")
}
