package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeOuterProduct`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeOuterProduct extends VisualShaderNode {

}

object VisualShaderNodeOuterProduct {
  /** Class metadata for Gd[VisualShaderNodeOuterProduct] lifetime management and casting. */
  given GodotClass[VisualShaderNodeOuterProduct] with {
    def className = "VisualShaderNodeOuterProduct"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeOuterProduct = new VisualShaderNodeOuterProduct {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeOuterProduct): GodotObject = t.hostObject
  }
}
