package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorDistance`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorDistance extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorDistance {
  /** Class metadata for Gd[VisualShaderNodeVectorDistance] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorDistance] with {
    def className = "VisualShaderNodeVectorDistance"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorDistance = new VisualShaderNodeVectorDistance {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorDistance): GodotObject = t.hostObject
  }
}
