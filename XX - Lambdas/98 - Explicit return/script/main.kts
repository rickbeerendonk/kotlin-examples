// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

fun execute(f: () -> String) = f()

println(execute {
    return@execute "bar"  // explicit return value
})

// bar