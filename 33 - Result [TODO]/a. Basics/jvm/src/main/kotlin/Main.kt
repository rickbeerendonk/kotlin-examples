// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.result.basics

fun divide(a: Int, b: Int): Result<Int> {
    return if (b != 0) {
        Result.success(a / b)
    } else {
        Result.failure(ArithmeticException("Division by zero"))
    }
}

fun main() {
    val result1 = divide(4, 2)
    result1
        .onSuccess { println("Result: $it") }
        .onFailure { println("Error: ${it.message}") }

    val result2 = divide(4, 0)
    result2
        .onSuccess { println("Result: $it") }
        .onFailure { println("Error: ${it.message}") }
}

// Result: 2
// Error: Division by zero
