package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeRotationByAxis`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeRotationByAxis extends VisualShaderNode {

}

object VisualShaderNodeRotationByAxis {
  /** Class metadata for Gd[VisualShaderNodeRotationByAxis] lifetime management and casting. */
  given GodotClass[VisualShaderNodeRotationByAxis] with {
    def className = "VisualShaderNodeRotationByAxis"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeRotationByAxis = new VisualShaderNodeRotationByAxis {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeRotationByAxis): GodotObject = t.hostObject
  }
}
