// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class FinalBase
// error: this type is final, so it cannot be inherited from
class DerivedFromFinal : FinalBase()

open class OpenBase
class DerivedFromOpen : OpenBase()
