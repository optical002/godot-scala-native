package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIf`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIf extends VisualShaderNode {

}

object VisualShaderNodeIf {
  /** Class metadata for Gd[VisualShaderNodeIf] lifetime management and casting. */
  given GodotClass[VisualShaderNodeIf] with {
    def className = "VisualShaderNodeIf"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeIf = new VisualShaderNodeIf {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeIf): GodotObject = t.hostObject
  }
}
