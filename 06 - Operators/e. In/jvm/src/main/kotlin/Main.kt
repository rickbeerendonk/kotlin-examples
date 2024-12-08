// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.operators._in

fun main() {
    val a = 5

    println(a in 1..10) // true
    println(a !in 1..10) // false
}
