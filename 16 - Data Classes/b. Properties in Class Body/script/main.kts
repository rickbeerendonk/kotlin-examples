// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

data class Demo(val one: Char) {
    var two: String = ""
    //operator fun component2() = two;
}

// Create
val demo1 = Demo('1')
demo1.two = "A"
val demo2 = Demo('1')
demo2.two = "B"

// Supported methods (open):
println(demo1.equals(demo2))      // true   <<< FAIL
println(demo1.hashCode())         // 49
println(demo1.toString())         // Demo(one=1)

// Supported methods (final):
println(demo1.component1())       // 1
//println(demo1.component2())       // FAIL, unless manually written
//println(demo1.copy(two = "new"))  // FAIL
