package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeRandomRange`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeRandomRange extends VisualShaderNode {

}

object VisualShaderNodeRandomRange {
  /** Class metadata for Gd[VisualShaderNodeRandomRange] lifetime management and casting. */
  given GodotClass[VisualShaderNodeRandomRange] with {
    def className = "VisualShaderNodeRandomRange"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeRandomRange = new VisualShaderNodeRandomRange {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeRandomRange): GodotObject = t.hostObject
  }
}
