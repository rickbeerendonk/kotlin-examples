// European Union Public License version 1.2
// Copyright © 2025 Rick Beerendonk

val citySequence = generateSequence(1) { it + 1 }

println(citySequence.take(5).toList())

// [1, 2, 3, 4, 5]