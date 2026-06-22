package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRActionBindingModifier`, extends `OpenXRBindingModifier`. */
abstract class OpenXRActionBindingModifier extends OpenXRBindingModifier {

}

object OpenXRActionBindingModifier {
  /** Class metadata for Gd[OpenXRActionBindingModifier] lifetime management and casting. */
  given GodotClass[OpenXRActionBindingModifier] with {
    def className = "OpenXRActionBindingModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRActionBindingModifier = new OpenXRActionBindingModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRActionBindingModifier): GodotObject = t.hostObject
  }
}
