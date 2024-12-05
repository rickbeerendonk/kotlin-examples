// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class Demo {
    var prop = "init"
        private set

    fun setProp(value: String) {
        this.prop = value
    }
}

val demo = Demo()
println(demo.prop)  // init

// error: cannot assign to 'prop': the setter is private
//demo.prop = "new"

// no error
demo.setProp("new")

println(demo.prop)  // new
