// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

class MyException(message: String): Exception(message)

fun main() {
    // TODO: No exception shown (as opposed to Java)
    throw MyException("HELP!")
}