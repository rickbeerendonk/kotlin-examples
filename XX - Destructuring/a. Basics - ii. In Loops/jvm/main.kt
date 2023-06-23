// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.destructuring.basics.loops

class Demo(val a: Int, val b: Int) {
    operator fun component1() = a
    operator fun component2() = b
}

fun main() {
    val lst = listOf(Demo(1, 2), Demo(3, 4))
    for ((first, second) in lst) {
        println(first)
        println(second)
    }
}

// 1
// 2
// 3
// 4
