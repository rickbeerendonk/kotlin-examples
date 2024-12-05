// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class Demo {
    val prop1: String
        get() = "getter 1" + "..."

    val prop2
        get() = "getter 2" + "..."

    val prop3 = "prop 3"
        get() = field + "..."

}

val demo = Demo()
println(demo.prop1)  // getter 1...
println(demo.prop2)  // getter 2...
println(demo.prop3)  // prop 3...
