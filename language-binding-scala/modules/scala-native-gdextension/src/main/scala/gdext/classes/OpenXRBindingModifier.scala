package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRBindingModifier`, extends `Resource`. */
abstract class OpenXRBindingModifier extends Resource {

}

object OpenXRBindingModifier {
  /** Class metadata for Gd[OpenXRBindingModifier] lifetime management and casting. */
  given GodotClass[OpenXRBindingModifier] with {
    def className = "OpenXRBindingModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRBindingModifier = new OpenXRBindingModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRBindingModifier): GodotObject = t.hostObject
  }
}
