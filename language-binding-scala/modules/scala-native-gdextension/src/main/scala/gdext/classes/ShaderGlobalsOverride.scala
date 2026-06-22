package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ShaderGlobalsOverride`, extends `Node`. */
abstract class ShaderGlobalsOverride extends Node {

}

object ShaderGlobalsOverride {
  /** Class metadata for Gd[ShaderGlobalsOverride] lifetime management and casting. */
  given GodotClass[ShaderGlobalsOverride] with {
    def className = "ShaderGlobalsOverride"
    def isRefCounted = false
    def wrap(o: GodotObject): ShaderGlobalsOverride = new ShaderGlobalsOverride {}.withHost(o.objectPtr)
    def unwrap(t: ShaderGlobalsOverride): GodotObject = t.hostObject
  }
}
