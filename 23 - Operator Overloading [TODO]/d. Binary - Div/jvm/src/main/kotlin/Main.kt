// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.operatoroverloading.binarydiv

class MyNumber(var value: Int) {

    operator fun div(other: MyNumber): MyNumber {
        return MyNumber(value / other.value)
    }

    operator fun div(other: Int): MyNumber {
        return MyNumber(value / other)
    }

    override fun toString(): String {
        return "MyNumber: $value"
    }
}

fun main() {
    val six = MyNumber(6)
    val three = MyNumber(3)

    println(six)             // MyNumber: 6
    println(six / three)     // MyNumber: 2
    println(six / 2)         // MyNumber: 3
}
