package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture2DParameter`, extends `VisualShaderNodeTextureParameter`. */
abstract class VisualShaderNodeTexture2DParameter extends VisualShaderNodeTextureParameter {

}

object VisualShaderNodeTexture2DParameter {
  /** Class metadata for Gd[VisualShaderNodeTexture2DParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTexture2DParameter] with {
    def className = "VisualShaderNodeTexture2DParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTexture2DParameter = new VisualShaderNodeTexture2DParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTexture2DParameter): GodotObject = t.hostObject
  }
}
