package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture2DArrayParameter`, extends `VisualShaderNodeTextureParameter`. */
abstract class VisualShaderNodeTexture2DArrayParameter extends VisualShaderNodeTextureParameter {

}

object VisualShaderNodeTexture2DArrayParameter {
  /** Class metadata for Gd[VisualShaderNodeTexture2DArrayParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTexture2DArrayParameter] with {
    def className = "VisualShaderNodeTexture2DArrayParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTexture2DArrayParameter = new VisualShaderNodeTexture2DArrayParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTexture2DArrayParameter): GodotObject = t.hostObject
  }
}
