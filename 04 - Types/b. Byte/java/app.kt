// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun main() {
    // Explicit
    val a: Byte = -128  // Min
    val b: Byte = 127   // Max

    println(a::class.simpleName)    // Byte
    println(b::class.qualifiedName) // kotlin.Byte

    // Implicit
    val aInt = -128
    val bInt = 127
    
    println(aInt::class.simpleName)    // Int
    println(bInt::class.qualifiedName) // kotlin.Int
}
