// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun one(a: String) {
    // Require throws an IllegalArgumentException if the value is false.
    require(a != "", { "Custom message: Parameter a should not be empty"})

    println(a)
}

one("abc")
one("")
