// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.types.nothing

fun err(): Nothing {
    throw Exception("Error!")
}

err()
