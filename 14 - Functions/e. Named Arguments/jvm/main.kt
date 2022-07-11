// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.namedarguments

fun display(name: String, age: Int) {
    println("$name is $age years old")
}

fun main() {
    // Positional arguments
    display("Alexandra", 37)

    // Named arguments
    display(age = 23, name = "Benjamin")

    // Positional & Named arguments
    display("Charlotte", age = 54)

    // Alexandra is 37 years old
    // Benjamin is 23 years old
    // Charlotte is 54 years old
}
