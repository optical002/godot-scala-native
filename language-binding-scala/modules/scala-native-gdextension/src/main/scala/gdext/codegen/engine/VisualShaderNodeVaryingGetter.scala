package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVaryingGetter`, extends `VisualShaderNodeVarying`. */
abstract class VisualShaderNodeVaryingGetter extends VisualShaderNodeVarying {

}

object VisualShaderNodeVaryingGetter {
  /** Class metadata for Gd[VisualShaderNodeVaryingGetter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVaryingGetter] with {
    def className = "VisualShaderNodeVaryingGetter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVaryingGetter = new VisualShaderNodeVaryingGetter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVaryingGetter): GodotObject = t.hostObject
  }
}
