// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class Demo {
    private var _prop = "init"
    public var prop
        get() = _prop
        set(value) {
            _prop = value + "!"
        }
}

val demo = Demo()
println(demo.prop)  // init

demo.prop = "new"
println(demo.prop)  // new!
