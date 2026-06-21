package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeGlobalExpression`, extends `VisualShaderNodeExpression`. */
abstract class VisualShaderNodeGlobalExpression extends VisualShaderNodeExpression {

}

object VisualShaderNodeGlobalExpression {
  /** Class metadata for Gd[VisualShaderNodeGlobalExpression] lifetime management and casting. */
  given GodotClass[VisualShaderNodeGlobalExpression] with {
    def className = "VisualShaderNodeGlobalExpression"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeGlobalExpression = new VisualShaderNodeGlobalExpression {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeGlobalExpression): GodotObject = t.hostObject
  }
}
