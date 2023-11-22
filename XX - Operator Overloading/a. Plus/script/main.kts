// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk


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

val one = MyNumber(1)
val two = MyNumber(2)

println(one)
println(one.add(two))
println(one + two)
println(one + 3)
