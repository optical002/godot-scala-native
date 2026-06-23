package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorLen`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorLen extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorLen {
  /** Class metadata for Gd[VisualShaderNodeVectorLen] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorLen] with {
    def className = "VisualShaderNodeVectorLen"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorLen = new VisualShaderNodeVectorLen {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorLen): GodotObject = t.hostObject
  }
}
