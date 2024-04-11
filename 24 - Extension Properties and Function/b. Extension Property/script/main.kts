// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

class Demo {
    val first = 1
    val second = 2
}

// Extension property
val Demo.sum: Int
    get() = this.first + this.second

val demo = Demo()

// Use extension property
println(demo.sum)  // 3
