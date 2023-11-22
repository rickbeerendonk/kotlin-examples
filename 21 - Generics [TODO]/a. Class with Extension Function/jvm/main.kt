// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.generics.classextensionfun

class Demo<T>(val one: T, val two: T)

// Extension function
fun <T> Demo<T>.addStr() = "${this.one} + ${this.two}"

fun main() {
    val demo1 = Demo(1, 2)
    println(demo1.addStr())  // 1 + 2
}
