// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.withparameters

fun one(a: String) {
    // Parameters are val:
    //a = "changed"

    println(a)
}

fun two(
    a: Int, 
    b: Boolean,  // trailing comma
) {
    println(a)
    println(b) 
}

fun main() {
    one("abc")
    two(
        2, 
        true,  // trailing comma
    )
}
