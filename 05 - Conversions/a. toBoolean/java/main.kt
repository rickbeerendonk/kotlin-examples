// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.converions.toboolean

fun main() {
    // Strings

    println("false".toBoolean())  // false
    println("true".toBoolean())   // true

    println("".toBoolean())       // false
    println("other".toBoolean())  // false
}
