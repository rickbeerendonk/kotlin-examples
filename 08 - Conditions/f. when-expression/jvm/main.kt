// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.conditions.whenexpression

import java.time.LocalDateTime
import java.time.DayOfWeek

fun main() {
    val moment = LocalDateTime.now()
    val hour = moment.hour
    val dayOfWeek = moment.getDayOfWeek()
    val day = moment.getDayOfWeek().value
    val month = moment.monthValue

    var result: String;

    // === Enum ===

    // else branch is mandatory when not all cases are covered
    result = when (dayOfWeek) {
      DayOfWeek.SATURDAY,
      DayOfWeek.SUNDAY -> "Weekend 😏"
      else -> "No weekend 😀"
    }
    println(result)

    // else branch is not mandatory when all cases are covered
    result = when (dayOfWeek) {
      DayOfWeek.MONDAY,
      DayOfWeek.TUESDAY,
      DayOfWeek.WEDNESDAY,
      DayOfWeek.THURSDAY,
      DayOfWeek.FRIDAY -> "No weekend 😀"
      DayOfWeek.SATURDAY,
      DayOfWeek.SUNDAY -> "Weekend 😏"
    }
    println(result)

    // === Int ===

    // else branch is mandatory when not all cases are covered
    result = when (dayOfWeek.value) {
      in 1..5 -> "No weekend 😀"
      else -> "Weekend 😏"
    }
    println(result)

    // else branch is mandatory when not all cases are covered
    result = when (dayOfWeek.value) {
      !in 1..5 -> "Weekend 😏"
      else -> "No weekend 😀"
    }
    println(result)

    // === Type & is ===
    val x: Any = "String"
    result = when (x) {
      is Int -> "Number"
      is String -> "Text"
      !is String -> "No Text"
      else -> "No Number or Text"
    }
    println(result)

    // === Multiple cases & in ===
    result = when (month) {
        1, 2, 3 -> "Winter"
        in 4..6 -> "Spring"
        !in 10..12 -> "Summer"
        else -> "Autumn"
    }
    println(result)

    // === when instead of if-then-else ===
    result = when {
        hour < 6 -> "Good night"
        hour < 12 -> "Good morning"
        hour < 18 -> "Good afternoon"
        else -> "Good evening"
    }
    println(result)
}
