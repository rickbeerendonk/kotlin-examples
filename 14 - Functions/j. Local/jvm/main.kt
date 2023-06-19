// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.local

fun test(a: Int = 1) {
    val b = 2

    fun local(c: Int) {
        // Access to everything within fun test()
        println("$a $b $c")
    }

    local(3)
}

fun main() {
    test()  // 1 2 3
}
