// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun add(a: Int, b: Int): Int = a + b;

// Return type inferred by the compiler
fun multiply(a: Int, b: Int) = a * b;

/*
// Block => Return type cannot be inferred by the compiler
fun multiply2(a: Int, b: Int) {
    return a * b;
}
 */


println(add(1, 2))       // 3
println(multiply(2, 3))  // 6
