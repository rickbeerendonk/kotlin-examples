// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.lambdas.parametersimplicittypes

fun main() {
    val zero: () -> Unit        = {}
    val one:  (Int) -> Int      = { a -> a }
    val two:  (Int, Int) -> Int = { a, b -> a * b }

    println(zero())
    println(one(2))
    println(two(2, 3))

    // kotlin.Unit
    // 2
    // 6
}
