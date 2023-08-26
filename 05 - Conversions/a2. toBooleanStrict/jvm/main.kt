// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.converions.tobooleanstrict

fun main() {
    // Strings

    println("false".toBooleanStrict())  // false
    println("true".toBooleanStrict())   // true

    println("".toBooleanStrict())       // java.lang.IllegalArgumentException: The string doesn't represent a boolean value
    println("other".toBooleanStrict())  // java.lang.IllegalArgumentException: The string doesn't represent a boolean value
}
