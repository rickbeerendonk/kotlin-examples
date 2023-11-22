// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

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

val one = MyNumber(1)
val two = MyNumber(2)

println(one)                //  1
println(one.subtract(two))  // -1
println(one - two)          // -1
println(one - 3)            // -2
