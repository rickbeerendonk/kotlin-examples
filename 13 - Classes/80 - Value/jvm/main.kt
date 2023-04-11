// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.value

@JvmInline
value class Token(val value: String)

fun main() {
    // Create
    val token = Token("ABC")

    println(token)
}
