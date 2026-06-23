package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCubemapParameter`, extends `VisualShaderNodeTextureParameter`. */
abstract class VisualShaderNodeCubemapParameter extends VisualShaderNodeTextureParameter {

}

object VisualShaderNodeCubemapParameter {
  /** Class metadata for Gd[VisualShaderNodeCubemapParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeCubemapParameter] with {
    def className = "VisualShaderNodeCubemapParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeCubemapParameter = new VisualShaderNodeCubemapParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeCubemapParameter): GodotObject = t.hostObject
  }
}
