package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeScreenNormalWorldSpace`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeScreenNormalWorldSpace extends VisualShaderNode {

}

object VisualShaderNodeScreenNormalWorldSpace {
  /** Class metadata for Gd[VisualShaderNodeScreenNormalWorldSpace] lifetime management and casting. */
  given GodotClass[VisualShaderNodeScreenNormalWorldSpace] with {
    def className = "VisualShaderNodeScreenNormalWorldSpace"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeScreenNormalWorldSpace = new VisualShaderNodeScreenNormalWorldSpace {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeScreenNormalWorldSpace): GodotObject = t.hostObject
  }
}
