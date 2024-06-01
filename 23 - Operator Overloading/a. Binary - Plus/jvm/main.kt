// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.operatoroverloading.binaryplus

class MyNumber(var value: Int) {

    operator fun plus(other: MyNumber): MyNumber {
        return MyNumber(value + other.value)
    }

    operator fun plus(other: Int): MyNumber {
        return MyNumber(value + other)
    }

    fun add(other: MyNumber): MyNumber {
        return this + other
    }

    override fun toString(): String {
        return "MyNumber: $value"
    }
}

fun main() {
    val one = MyNumber(1)
    val two = MyNumber(2)

    println(one)           // MyNumber: 1
    println(one.add(two))  // MyNumber: 3
    println(one + two)     // MyNumber: 3
    println(one + 3)       // MyNumber: 4
}
