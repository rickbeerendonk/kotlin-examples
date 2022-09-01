// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

val bool = true
val number = 123
val text = "abc"

println("bool: $bool, number+1: ${number + 1}, text: $text (length: ${text.length})")
// bool: true, number+1: 124, text: abc (length: 3)

println("""
bool: $bool
number+1: ${number + 1}
text: $text (length: ${text.length})
""")
// bool: true
// number+1: 124
// text: abc (length: 3)
