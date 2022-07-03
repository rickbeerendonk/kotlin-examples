// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.returnjumps.jumpslabel

fun main() {
    myLabel@ for (i in 1..5) {
        for (j in 1..5) {
            println("$i $j")
            if (i == j)
                continue@myLabel
            if (i == 4)
                break@myLabel
        }
    }

    // 1 1
    // 2 1
    // 2 2
    // 3 1
    // 3 2
    // 3 3
    // 4 1
}
