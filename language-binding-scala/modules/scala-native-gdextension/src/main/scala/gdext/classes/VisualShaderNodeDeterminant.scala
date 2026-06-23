package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeDeterminant`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeDeterminant extends VisualShaderNode {

}

object VisualShaderNodeDeterminant {
  /** Class metadata for Gd[VisualShaderNodeDeterminant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeDeterminant] with {
    def className = "VisualShaderNodeDeterminant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeDeterminant = new VisualShaderNodeDeterminant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeDeterminant): GodotObject = t.hostObject
  }
}
