// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.generics.class_

class Demo<T>(val one: T, val two: T)

fun main() {
    val demo1 = Demo(1, 2)
    val demo2 = Demo(3.0, 4.0)

    println("one=${demo1.one}, two=${demo1.two}")
    println(demo1::class.simpleName)
    println(demo1.one::class.simpleName)

    println("one=${demo2.one}, two=${demo2.two}")
}