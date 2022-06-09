// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.withoutreturn

fun one(a: String) {
    println(a)
}

fun two(a: Int, b: Boolean): Unit {
    println(a)
    println(b)
}

fun main() {
    one("abc")
    two(2, true)
}
