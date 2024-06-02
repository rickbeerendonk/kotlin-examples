// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.result.getorelse

fun divide(a: Int, b: Int): Result<Int> {
    return runCatching { a / b }
}

fun main() {
    val result1 = divide(4, 2)
    println(result1.getOrElse { "Failed: $it" })

    val result2 = divide(4, 0)
    println(result2.getOrElse { "Failed: $it" })
}

// 2
// Failed java.lang.ArithmeticException: / by zero
