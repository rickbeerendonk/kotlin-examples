// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.singleexpression

fun add(a: Int, b: Int): Int = a + b;

// Return type inferred by the compiler
fun multiply(a: Int, b: Int) = a * b;

fun main() {
    println(add(1, 2))       // 3
    println(multiply(2, 3))  // 6
}
