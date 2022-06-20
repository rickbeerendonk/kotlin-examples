// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.withreturn

fun add(a: Int, b: Int): Int {
    return a + b;
}

fun main() {
    val sum = add(1, 2)

    println(sum)  // 3
}
