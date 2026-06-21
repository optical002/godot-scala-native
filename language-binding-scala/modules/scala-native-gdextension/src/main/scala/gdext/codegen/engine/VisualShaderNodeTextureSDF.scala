package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTextureSDF`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTextureSDF extends VisualShaderNode {

}

object VisualShaderNodeTextureSDF {
  /** Class metadata for Gd[VisualShaderNodeTextureSDF] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTextureSDF] with {
    def className = "VisualShaderNodeTextureSDF"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTextureSDF = new VisualShaderNodeTextureSDF {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTextureSDF): GodotObject = t.hostObject
  }
}
