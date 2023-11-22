// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.singleton._object

object Demo1 {
    val a = 1
    var b = "one"
}

// Constructors are not allowed.
/*
object Demo2() {
    val a = 2
    var b = "two"
}
*/

fun main() {
    println(Demo1.a)    // 1
    println(Demo1.b)    // one
}
