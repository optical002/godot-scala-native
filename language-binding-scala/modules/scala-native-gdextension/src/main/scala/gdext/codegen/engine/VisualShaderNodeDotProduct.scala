package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeDotProduct`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeDotProduct extends VisualShaderNode {

}

object VisualShaderNodeDotProduct {
  /** Class metadata for Gd[VisualShaderNodeDotProduct] lifetime management and casting. */
  given GodotClass[VisualShaderNodeDotProduct] with {
    def className = "VisualShaderNodeDotProduct"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeDotProduct = new VisualShaderNodeDotProduct {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeDotProduct): GodotObject = t.hostObject
  }
}
