// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.conditions.whenexpression

import java.time.LocalDateTime
import java.time.DayOfWeek

fun main() {
    val moment = LocalDateTime.now()
    val dayOfWeek = moment.getDayOfWeek()

    // Enum to String

    // else branch is mandatory when not all cases are covered
    val dayAsString1: String = when (dayOfWeek) {
      DayOfWeek.SATURDAY,
      DayOfWeek.SUNDAY -> "Weekend 😏"
      else -> "No weekend 😀"
    }
    println(dayAsString1)

    // else branch is not mandatory when all cases are covered
    val dayAsString2: String = when (dayOfWeek) {
      DayOfWeek.MONDAY,
      DayOfWeek.TUESDAY,
      DayOfWeek.WEDNESDAY,
      DayOfWeek.THURSDAY,
      DayOfWeek.FRIDAY -> "No weekend 😀"
      DayOfWeek.SATURDAY,
      DayOfWeek.SUNDAY -> "Weekend 😏"
    }
    println(dayAsString2)

    // Int to String

    // else branch is mandatory when not all cases are covered
    val dayAsString3: String = when (dayOfWeek.value) {
      in 1..5 -> "No weekend 😀"
      else -> "Weekend 😏"
    }
    println(dayAsString3)
}
