// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun test() = "test"

fun test(value: String) = "echo $value"

println(test())       // test
println(test("abc"))  // echo abc
