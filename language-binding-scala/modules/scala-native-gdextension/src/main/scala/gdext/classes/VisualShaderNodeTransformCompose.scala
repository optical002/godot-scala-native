package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformCompose`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformCompose extends VisualShaderNode {

}

object VisualShaderNodeTransformCompose {
  /** Class metadata for Gd[VisualShaderNodeTransformCompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformCompose] with {
    def className = "VisualShaderNodeTransformCompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformCompose = new VisualShaderNodeTransformCompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformCompose): GodotObject = t.hostObject
  }
}
