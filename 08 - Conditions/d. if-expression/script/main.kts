// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

import java.time.LocalDateTime

val moment = LocalDateTime.now()
val hour = moment.hour

println(if (hour >= 6 && hour < 18) "Good day" else "Good night")
