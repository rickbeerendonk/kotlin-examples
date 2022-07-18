// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

val nothing: () -> Unit = fun () {}
val double: (Int) -> Int = fun (a: Int) = 2 * a
val isSize: (String, Int) -> Boolean = fun (text: String, size: Int) = text.length == size

println(nothing())
println(double(2))
println(isSize("abc", 3))

// kotlin.Unit
// 4
// true