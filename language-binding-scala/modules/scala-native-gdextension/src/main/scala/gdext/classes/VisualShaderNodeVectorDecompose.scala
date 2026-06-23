package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorDecompose`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorDecompose extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorDecompose {
  /** Class metadata for Gd[VisualShaderNodeVectorDecompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorDecompose] with {
    def className = "VisualShaderNodeVectorDecompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorDecompose = new VisualShaderNodeVectorDecompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorDecompose): GodotObject = t.hostObject
  }
}
