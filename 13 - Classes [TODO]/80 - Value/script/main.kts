// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.classes.define

// Define
@JvmInline
value class Token(val value: String)

// Create
val token = Token("ABC")

println(token)
