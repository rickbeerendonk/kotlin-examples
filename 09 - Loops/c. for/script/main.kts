// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

val players = arrayOf("Rafael Nadal", "Roger Federer", "Serena Williams")

// One line
for (player in players) println("Tennis player: $player")

// Block
for (c in players[0]) {
    println(c)
}