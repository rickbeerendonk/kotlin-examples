// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.withparameters

// Implicit return
fun one(a: String) {
    // Parameters are val:
    //a = "changed"

    println(a)
}

// Explicit return
fun two(a: Int, b: Boolean): Unit {
    println(a)
    println(b)
}

fun three(
    a: String, 
    b: Double,  // trailing comma
) {
    println(a)
    println(b) 
}

fun main() {
    one("abc")
    two(2, true)
    three(
        "def",
        123.456,  // trailing comma
    )
}
