// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class Demo {
    fun nothingExplicit(): Unit {}
    fun nothingImplicit() {}

    fun somethingExplicit(): String = "something"
    fun somethingImplicit() = "something"

    fun echo(str: String) = str
    
    fun addOne(value: Int) = value + 1
    
    fun multipleLine(value: Int): Int {
        var newValue = value + 1
        newValue *= 2
        return newValue
    }
}

val demo = Demo()
println(demo.nothingExplicit())    // kotlin.Unit
println(demo.nothingImplicit())    // kotlin.Unit

println(demo.somethingExplicit())  // something
println(demo.somethingImplicit())  // something

println(demo.echo("Echo"))         // Echo

println(demo.addOne(1))            // 2

println(demo.multipleLine(1))      // 4
