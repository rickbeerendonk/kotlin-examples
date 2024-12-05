// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.result.getorthrow

fun divide(a: Int, b: Int): Result<Int> {
    return runCatching { a / b }
}

fun main() {
    val result1 = divide(4, 2)
    println(result1.getOrThrow())

    val result2 = divide(4, 0)
    println(result2.getOrThrow())
}

// 2
// Exception in thread "main" java.lang.ArithmeticException: / by zero
