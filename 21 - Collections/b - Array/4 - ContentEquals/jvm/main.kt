// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.collections.list.contentequals

fun main() {
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)
    val array3 = arrayOf(3, 2, 1);

    println(array1.contentEquals(array2))  // true
    println(array1.contentEquals(array3))  // false

    // Infix notation.
    println(array1 contentEquals array2)   // true
}