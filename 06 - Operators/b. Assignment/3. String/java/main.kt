// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.operators.assignment.string

fun main() {
    var s = "a"
    println("s: ${s}") // "a"

    s = "b"
    println("String: s = \"b\": ${s}") // b

    s = "a"
    s += "c"
    println("String: s += \"c\": ${s}") // ac
}
