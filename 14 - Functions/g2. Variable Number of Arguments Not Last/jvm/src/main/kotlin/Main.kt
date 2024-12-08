// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.varargsnotlast

fun test(vararg a: Int, b: Int) {
    for (item in a) println(item)   // 1, 2, 3
    println(b)                      // 4
}

fun main() {
    // Must use Named Arguments for everything after vararg:
    test(1, 2, 3, b = 4)
}
