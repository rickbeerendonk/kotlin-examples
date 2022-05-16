// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.converions.todouble

fun main() {
    // Int

    // error: The integer literal does not conform to the expected type
    //val d1: Double = 123;

    val d2: Double = 123.toDouble()
    println(d2)                      // 123.0
    

    // String

    println("123.456".toDouble())    // 123.456
    println("1e2".toDouble())        // 100.0

    // Exception: java.lang.NumberFormatException
    println("other".toDouble())
}
