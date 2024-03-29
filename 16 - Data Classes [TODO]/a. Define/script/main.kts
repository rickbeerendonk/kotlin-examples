// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// error: data class must have at least one primary constructor parameter
//data class DemoNoParams()

// error: data class primary constructor must only have property (val / var) parameters
//data class DemoNoVarVal(one: Int)

// error: Modifier 'abstract/open/sealed/inner' is incompatible with 'data'
//abstract data class DemoNoAbstract(val one: Int)
//open data class DemoNoOpen(val one: Int)
//sealed data class DemoNoSealed(val one: Int)

data class Demo(val one: Int, var two: String)

// Create
val demo1 = Demo(1, "two")
val demo2 = Demo(1, "two")

// Generated Properties
println(demo1.one)                // 1
println(demo1.two)                // two

// Supported methods (open):
println(demo1.equals(demo2))      // true
println(demo1.hashCode())         // 115307
println(demo1.toString())         // Demo(one=1 two=two)

// Supported methods (final):
println(demo1.component1())       // 1
println(demo1.component2())       // two
println(demo1.copy(two = "new"))  // Demo(one=1, two=new)
