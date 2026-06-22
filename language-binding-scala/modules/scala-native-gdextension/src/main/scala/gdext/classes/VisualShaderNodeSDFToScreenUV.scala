package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeSDFToScreenUV`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSDFToScreenUV extends VisualShaderNode {

}

object VisualShaderNodeSDFToScreenUV {
  /** Class metadata for Gd[VisualShaderNodeSDFToScreenUV] lifetime management and casting. */
  given GodotClass[VisualShaderNodeSDFToScreenUV] with {
    def className = "VisualShaderNodeSDFToScreenUV"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeSDFToScreenUV = new VisualShaderNodeSDFToScreenUV {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeSDFToScreenUV): GodotObject = t.hostObject
  }
}
