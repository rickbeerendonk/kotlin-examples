See: https://kotlinlang.org/docs/typecasts.html

- is and !is
- Smart casts
- as
- nullable cast

```kotlin
val obj: Any = "Hello"
if (obj is String) {
    println("obj is a String")
} else {
    println("obj is not a String")
}
```
