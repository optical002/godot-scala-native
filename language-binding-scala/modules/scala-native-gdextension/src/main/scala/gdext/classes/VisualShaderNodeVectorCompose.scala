package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorCompose`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorCompose extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorCompose {
  /** Class metadata for Gd[VisualShaderNodeVectorCompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorCompose] with {
    def className = "VisualShaderNodeVectorCompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorCompose = new VisualShaderNodeVectorCompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorCompose): GodotObject = t.hostObject
  }
}
