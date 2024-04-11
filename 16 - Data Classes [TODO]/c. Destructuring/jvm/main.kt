// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.dataclasses.equality

data class Demo(val one: Int, var two: String)

fun main() {
    val demo = Demo(1, "two")

    val (first, second) = demo;

    println(first)   // 1
    println(second)  // two
}
