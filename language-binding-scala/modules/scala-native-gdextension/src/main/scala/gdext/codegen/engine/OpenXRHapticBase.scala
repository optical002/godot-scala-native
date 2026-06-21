package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRHapticBase`, extends `Resource`. */
abstract class OpenXRHapticBase extends Resource {

}

object OpenXRHapticBase {
  /** Class metadata for Gd[OpenXRHapticBase] lifetime management and casting. */
  given GodotClass[OpenXRHapticBase] with {
    def className = "OpenXRHapticBase"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRHapticBase = new OpenXRHapticBase {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRHapticBase): GodotObject = t.hostObject
  }
}
