// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// -- Array --

val players = arrayOf("Rafael Nadal", "Roger Federer", "Serena Williams")

for (i in players.indices) println("Tennis player $i: ${players[i]}")

for ((index, value) in players.withIndex()) println("Tennis player $index: $value")

// Both:

// Tennis player 0: Rafael Nadal
// Tennis player 1: Roger Federer
// Tennis player 2: Serena Williams

// -- Map --

val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 5 to "e")
for (item in map) println(item)
for ((key, value) in map) println("$key=$value")

// Both:

// 1=a
// 2=b
// 5=e