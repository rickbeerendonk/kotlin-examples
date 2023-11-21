// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

enum class EuropeanCountry(val countryName: String, var capitalCity: String) {

    // Enum constants.
    DE("Germany", "Berlin"),
    FR("France", "Paris"),
    IT("Italy", "Rome"),
    ES("Spain", "Madrid"),
    UK("United Kingdom", "London"),
    SE("Sweden", "Stockholm"),
    NO("Norway", "Oslo"),
    DK("Denmark", "Copenhagen"),
    FI("Finland", "Helsinki"),
    NL("Netherlands", "Amsterdam"),
    BE("Belgium", "Brussels"),
    LU("Luxembourg", "Luxembourg");
    // ... Other European countries

    // Define additional methods.
    fun isScandinavianCountry(): Boolean {
        return this === SE || this === NO || this === DK || this === FI
    }

    // Define additional properties.
    val isBeneluxCountry: Boolean
        get() = this === NL || this === BE || this === LU
}

// Create and use EuropeanCountry enum variable.
val favouriteCountry: EuropeanCountry = EuropeanCountry.NL
println(favouriteCountry.toString())  // NL
println(favouriteCountry.name)        // NL
println("${favouriteCountry.countryName}, ${favouriteCountry.capitalCity}")  // Netherlands, Amsterdam

// Mutate data (rarely need to do this!).
favouriteCountry.capitalCity = "The Hague"
println("${favouriteCountry.countryName}, ${favouriteCountry.capitalCity}")  // Netherlands, The Hague

// Invoke methods.
if (favouriteCountry.isScandinavianCountry()) {
    println("It's a Scandinavian country.")
} else {
    println("It's NOT a Scandinavian country.")
}

// Access properties.
if (favouriteCountry.isBeneluxCountry) {
    println("It's a Benelux country.")
} else {
    println("It's not a Benelux country.")
}