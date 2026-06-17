package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
