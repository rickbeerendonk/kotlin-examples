// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class Demo {
    val withType: String = "with"
    val withoutType = "without"  // Inferred
}

val demo = Demo()
println(demo.withType)     // with
println(demo.withoutType)  // without
