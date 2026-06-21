package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeConstant`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeConstant extends VisualShaderNode {

}

object VisualShaderNodeConstant {
  /** Class metadata for Gd[VisualShaderNodeConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeConstant] with {
    def className = "VisualShaderNodeConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeConstant = new VisualShaderNodeConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeConstant): GodotObject = t.hostObject
  }
}
