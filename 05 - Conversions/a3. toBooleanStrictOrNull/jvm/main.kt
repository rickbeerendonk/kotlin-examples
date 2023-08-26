// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.converions.tobooleanstrictornull

fun main() {
    // Strings

    println("false".toBooleanStrictOrNull())  // false
    println("true".toBooleanStrictOrNull())   // true

    println("".toBooleanStrictOrNull())       // null
    println("other".toBooleanStrictOrNull())  // null
}
