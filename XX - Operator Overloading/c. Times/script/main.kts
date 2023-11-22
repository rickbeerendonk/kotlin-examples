// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

class MyNumber(var value: Int) {

    operator fun times(other: MyNumber): MyNumber {
        return MyNumber(value * other.value)
    }

    operator fun times(other: Int): MyNumber {
        return MyNumber(value * other)
    }

    fun multiply(other: MyNumber): MyNumber {
        return this * other
    }

    override fun toString(): String {
        return "MyNumber: $value"
    }
}

val two = MyNumber(2)
val three = MyNumber(3)

println(two)                  // MyNumber: 2
println(two.multiply(three))  // MyNumber: 6
println(two * three)          // MyNumber: 6
println(two * 4)              // MyNumber: 8