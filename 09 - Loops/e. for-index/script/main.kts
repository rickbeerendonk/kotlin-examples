// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

val players = arrayOf("Rafael Nadal", "Roger Federer", "Serena Williams")

for (i in players.indices) println("Tennis player $i: ${players[i]}")

for ((index, value) in players.withIndex()) println("Tennis player $index: $value")

// Both:

// Tennis player 0: Rafael Nadal
// Tennis player 1: Roger Federer
// Tennis player 2: Serena Williams