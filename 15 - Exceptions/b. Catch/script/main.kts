// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

try {
    val result = 10 / 0
    println(result)  // Not executed
} catch (e: ArithmeticException) {
    println("Error: ${e.message}")  // Error: / by zero
}