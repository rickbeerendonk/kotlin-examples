// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.converions.toint

fun main() {
    // Long

    println(Long.MIN_VALUE.toInt())   // 0
    println(Long.MAX_VALUE.toInt())   // -1


    // Double

    val d1: Double = 123.456;
    val i1 = d1.toInt();

    println(i1)                       // 123
    println(i1::class.qualifiedName)  // kotlin.Int

    println(1.4.toInt())                 // 1
    println(1.9.toInt())                 // 1
    println(1.999999999999999.toInt())   // 1
    println(1.9999999999999999.toInt())  // 2

    println(2147483646.0.toInt())     // 2147483646
    println(2147483647.0.toInt())     // 2147483647
    println(2147483648.0.toInt())     // 2147483647
    println(2147483649.0.toInt())     // 2147483647


    // String

    println("123".toInt())           // 123

    // Exception: java.lang.NumberFormatException
    //println("2147483648".toInt())

    // Exception: java.lang.NumberFormatException
    //println("other".toInt())
}
