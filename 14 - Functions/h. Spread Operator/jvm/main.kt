// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.spread

fun sum(vararg a: Int): Int {
    var result = 0;
    for (value in a) result += value
    return result
}

fun main() {
    val arr = intArrayOf(1, 2, 3)

    // With * as spread operator
    println(sum(*arr))     // 6

    println(sum(1, 2, 3))  // 6
}
