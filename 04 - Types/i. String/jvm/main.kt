// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.types.string

fun main() {
    val str = "Text"
    println(str)                       // Text
    println(str.length)                // 4
    println(str.subSequence(1, 3))     // ex
    println(str::class.qualifiedName)  // kotlin.String
    println()
    println(str[0])                       // T
    println(str[0]::class.qualifiedName)  // kotlin.Char
}
