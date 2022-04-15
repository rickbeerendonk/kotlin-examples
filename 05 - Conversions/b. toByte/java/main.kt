// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.converions.tobyte

fun main() {
    // Int

    val i1: Int = 100;
    val b1 = i1.toByte();

    println(b1)                       // 100
    println(b1::class.qualifiedName)  // kotlin.Byte

    println(Int.MIN_VALUE.toByte())   // 0
    println(Int.MAX_VALUE.toByte())   // -1

    println(127.toByte())             // 127
    println(128.toByte())             // -128
    println(129.toByte())             // -127
    println(130.toByte())             // -126


    // String

    println("123".toByte())           // 123

    // Exception: java.lang.NumberFormatException
    //println("other".toByte())
}
