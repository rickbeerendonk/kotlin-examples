// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.result.chainingmap

fun divide(a: Int, b: Int): Result<Int> {
    return runCatching { a / b }
}

fun main() {
    val result1 = divide(4, 2).map({ it * 2 }).map({ it.toDouble() })
    result1
        .onSuccess { println("Result: $it") }
        .onFailure { println("Error: ${it.message}") }

    val result2 = divide(4, 0).map({ it * 2 }).map({ it.toDouble() })
    result2
        .onSuccess { println("Result: $it") }
        .onFailure { println("Error: ${it.message}") }
}

// Result: 4.0
// Error: / by zero
