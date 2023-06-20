// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.functions.varargsspreadoperator

fun test(vararg a: String) {
    // vararg is an Array
    for (item in a) println(item)   // a, b, c
    println(a.size)                 // 3
    println(a::class.qualifiedName) // kotlin.Array
}

fun main() {
    val arr = arrayOf("a", "b", "c")
    //val arr = listOf("a", "b", "c").toTypedArray()
    
    // * = Spread Operator (only on Array types)
    test(*arr)
}
