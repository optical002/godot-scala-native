package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ShaderIncludeDB`, extends `Object`. */
abstract class ShaderIncludeDB extends Object {

}

object ShaderIncludeDB {
  /** Class metadata for Gd[ShaderIncludeDB] lifetime management and casting. */
  given GodotClass[ShaderIncludeDB] with {
    def className = "ShaderIncludeDB"
    def isRefCounted = false
    def wrap(o: GodotObject): ShaderIncludeDB = new ShaderIncludeDB {}.withHost(o.objectPtr)
    def unwrap(t: ShaderIncludeDB): GodotObject = t.hostObject
  }
}
