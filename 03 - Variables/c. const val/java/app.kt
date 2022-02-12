// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// Explicit type
const val explicit: Int = 123;

// Implicit type
const val implicit = 456;

// error: Only primitives and String are allowed
//const val iserror = listOf("a", "b");

fun main() {
    println(explicit::class.simpleName) // Int
    println(implicit::class.simpleName) // Int

    // error: val cannot be reassigned
    //explicit = implicit;
}
