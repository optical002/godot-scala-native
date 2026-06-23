package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRIPBindingModifier`, extends `OpenXRBindingModifier`. */
abstract class OpenXRIPBindingModifier extends OpenXRBindingModifier {

}

object OpenXRIPBindingModifier {
  /** Class metadata for Gd[OpenXRIPBindingModifier] lifetime management and casting. */
  given GodotClass[OpenXRIPBindingModifier] with {
    def className = "OpenXRIPBindingModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRIPBindingModifier = new OpenXRIPBindingModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRIPBindingModifier): GodotObject = t.hostObject
  }
}
