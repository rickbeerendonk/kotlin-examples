// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.operators.logical.parenthesis

fun main() {
    val a = false;
    val b = true;
    val c = true;

    if (a && b || c)
    {
        // Executed
        println("First");
    }

    if (a && (b || c))
    {
        // NOT executed
        println("Second");
    }
}

// First