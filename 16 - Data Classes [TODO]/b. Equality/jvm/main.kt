// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.dataclasses.equality

data class Demo(val one: Int, var two: String)

fun main() {
    val demo1 = Demo(1, "two")
    val demo2 = Demo(1, "two")

    println(demo1 == demo2)  // true
}
