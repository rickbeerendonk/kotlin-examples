// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.destructuring.skipvalues

class Demo() {
    operator fun component1() = "one"
    operator fun component2() = "two"
}

fun main() {
    // Last
    val (a) = Demo()
    println(a)  // one

    // Skip before last
    val (_, b) = Demo()
    println(b)  // two
}
