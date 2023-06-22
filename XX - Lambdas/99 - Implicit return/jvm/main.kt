// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.lambdas.implicitreturn

fun main() {
    val foo = {
        var x = "b"
        x += "a"
        x += "r"
        x  // implicit return value
    }
    
    println(foo())

    // bar
}
