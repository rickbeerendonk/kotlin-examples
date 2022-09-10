// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.collections.list.create

fun main() {
    val list = listOf("A", 1, true)

    list.forEach{println(it)}
    // A
    // 1
    // true

    /*
    println(listOf<Int>()::class.qualifiedName)     // kotlin.collections.EmptyList
    println(listOf(1)::class.qualifiedName)         // java.util.Collections.SingletonList
    println(mutableListOf(1)::class.qualifiedName)  // java.util.Arrays.ArrayList
    println(arrayOf(1)::class.qualifiedName)        // kotlin.Array
    println(mapOf(1 to 'a')::class.qualifiedName)   // java.util.Collections.SingletonMap

    val a: List<Int>        = listOf<Int>()
    val b: List<Int>        = listOf(1)
    val c: MutableList<Int> = mutableListOf(1)
    val d: Array<Int>       = arrayOf(1)
    val e: Map<Int, Char>   = mapOf(1 to 'a')

    //fun foo(value: List)
    */
}