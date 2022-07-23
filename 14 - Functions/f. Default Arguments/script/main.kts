// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun test(a: Int, b: Int = 10, c: String = "default", d: () -> String = {"Hello world!"}) {
    println(a)
    println(b)
    println(c)
    println(d())
    println("")
}


println("test(1)")
test(1)
// 1, 10, default, Hello world!

println("test(1, 2)")
test(1, 2)
// 1, 2, default, Hello world!

println("test(1, c = \"other\")")
test(1, c = "other")
// 1, 10, other, Hello world!

println("test(1, d = {\"Hello Kotlin!\"})")
test(1, d = {"Hello Kotlin!"})
// 1, 10, default, Hello Kotlin!
