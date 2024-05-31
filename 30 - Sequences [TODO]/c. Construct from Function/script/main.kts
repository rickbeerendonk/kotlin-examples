// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

val numberSequence = generateSequence(10) { it + 10 }

for (n in numberSequence.take(10)) {
    println(n)
}

// 10
// 20
// ..
// 100