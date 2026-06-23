package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRVisibilityMask`, extends `VisualInstance3D`. */
abstract class OpenXRVisibilityMask extends VisualInstance3D {

}

object OpenXRVisibilityMask {
  /** Class metadata for Gd[OpenXRVisibilityMask] lifetime management and casting. */
  given GodotClass[OpenXRVisibilityMask] with {
    def className = "OpenXRVisibilityMask"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRVisibilityMask = new OpenXRVisibilityMask {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRVisibilityMask): GodotObject = t.hostObject
  }
}
