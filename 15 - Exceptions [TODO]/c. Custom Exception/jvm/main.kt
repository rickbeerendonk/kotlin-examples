// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.exceptions.custom_exception

class MyException(message: String): Exception(message)

fun main() {
    throw MyException("HELP!")
}