package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVaryingSetter`, extends `VisualShaderNodeVarying`. */
abstract class VisualShaderNodeVaryingSetter extends VisualShaderNodeVarying {

}

object VisualShaderNodeVaryingSetter {
  /** Class metadata for Gd[VisualShaderNodeVaryingSetter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVaryingSetter] with {
    def className = "VisualShaderNodeVaryingSetter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVaryingSetter = new VisualShaderNodeVaryingSetter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVaryingSetter): GodotObject = t.hostObject
  }
}
