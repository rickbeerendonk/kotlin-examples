// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

for (i in 1..20) {
    if (i % 10 == 0) break

    if (i % 3 == 0) continue

    println("Iteration: $i")
}

println("Done")

// Iteration: 1
// Iteration: 2
// Iteration: 4
// Iteration: 5
// Iteration: 7
// Iteration: 8
// Done