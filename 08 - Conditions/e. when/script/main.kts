// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

import java.time.LocalDateTime
import java.time.DayOfWeek

val moment = LocalDateTime.now()
val hour = moment.hour
val dayOfWeek = moment.getDayOfWeek()
val day = moment.getDayOfWeek().value
val month = moment.monthValue

// Enum
when (dayOfWeek) {
    DayOfWeek.MONDAY -> println("Monday")
    DayOfWeek.TUESDAY -> println("Tuesday")
    DayOfWeek.WEDNESDAY -> println("Wednesday")
    DayOfWeek.THURSDAY -> println("Thursday")
    DayOfWeek.FRIDAY -> {
        println("Friday")
        println("Almost weekend")
    }
    else -> println("Weekend!")
}

// Int
when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    3 -> println("Wednesday")
    4 -> println("Thursday")
    5 -> {
        println("Friday")
        println("Almost weekend")
    }
    else -> println("Weekend!")
}

// Multiple cases
when (month) {
    1, 2, 3 -> println("Winter")
    4, 5, 6 -> println("Spring")
    7, 8, 9 -> println("Autumn")
    else -> println("Winter")
}

// when instead of if-then-else
when {
    hour < 6 -> println("Good night")
    hour < 12 -> println("Good morning")
    hour < 18 -> println("Good afternoon")
    else -> println("Good evening")
}
