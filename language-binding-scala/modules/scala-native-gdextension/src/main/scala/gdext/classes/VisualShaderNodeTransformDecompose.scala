package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformDecompose`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformDecompose extends VisualShaderNode {

}

object VisualShaderNodeTransformDecompose {
  /** Class metadata for Gd[VisualShaderNodeTransformDecompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformDecompose] with {
    def className = "VisualShaderNodeTransformDecompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformDecompose = new VisualShaderNodeTransformDecompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformDecompose): GodotObject = t.hostObject
  }
}
