package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeScreenUVToSDF`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeScreenUVToSDF extends VisualShaderNode {

}

object VisualShaderNodeScreenUVToSDF {
  /** Class metadata for Gd[VisualShaderNodeScreenUVToSDF] lifetime management and casting. */
  given GodotClass[VisualShaderNodeScreenUVToSDF] with {
    def className = "VisualShaderNodeScreenUVToSDF"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeScreenUVToSDF = new VisualShaderNodeScreenUVToSDF {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeScreenUVToSDF): GodotObject = t.hostObject
  }
}
