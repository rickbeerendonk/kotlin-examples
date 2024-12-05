// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// Implicit
class Empty1

// Explicit
class Empty2: Any()

// Create
val empty1 = Empty1()
val empty2 = Empty2()

println(empty1 is Any)  // true
println(empty2 is Any)  // true

// Supported methods in Any:
println(empty1.equals(empty2))  // false
println(empty1.hashCode())      // 1829164700
println(empty1.toString())      // org.classes.inheritance.any.Empty1@6d06d69c
