package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorRefract`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorRefract extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorRefract {
  /** Class metadata for Gd[VisualShaderNodeVectorRefract] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorRefract] with {
    def className = "VisualShaderNodeVectorRefract"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorRefract = new VisualShaderNodeVectorRefract {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorRefract): GodotObject = t.hostObject
  }
}
