// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

class Demo {
    val first = 1
    val second = 2
}

// Extension function
fun Demo.sum(): Int {
    return this.first + this.second
}

val demo = Demo()

// Use extension function
println(demo.sum())  // 3
