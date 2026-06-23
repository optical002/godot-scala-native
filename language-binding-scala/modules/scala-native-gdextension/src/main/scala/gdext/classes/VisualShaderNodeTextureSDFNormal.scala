package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTextureSDFNormal`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTextureSDFNormal extends VisualShaderNode {

}

object VisualShaderNodeTextureSDFNormal {
  /** Class metadata for Gd[VisualShaderNodeTextureSDFNormal] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTextureSDFNormal] with {
    def className = "VisualShaderNodeTextureSDFNormal"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTextureSDFNormal = new VisualShaderNodeTextureSDFNormal {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTextureSDFNormal): GodotObject = t.hostObject
  }
}
