// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.operatoroverloading.binaryminus

class MyNumber(var value: Int) {

    operator fun minus(other: MyNumber): MyNumber {
        return MyNumber(value - other.value)
    }

    operator fun minus(other: Int): MyNumber {
        return MyNumber(value - other)
    }

    fun subtract(other: MyNumber): MyNumber {
        return this - other
    }

    override fun toString(): String {
        return "MyNumber: $value"
    }
}

fun main() {
    val one = MyNumber(1)
    val two = MyNumber(2)

    println(one)                // MyNumber: 1
    println(one.subtract(two))  // MyNumber: -1
    println(one - two)          // MyNumber: -1
    println(one - 3)            // MyNumber: -2
}
