// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class Demo {
    var prop = "init"
        set(value) {
            field = value + "!"
        }
}

val demo = Demo()
println(demo.prop)  // init

demo.prop = "new"
println(demo.prop)  // new!
