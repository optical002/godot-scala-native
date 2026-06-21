package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFresnel`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFresnel extends VisualShaderNode {

}

object VisualShaderNodeFresnel {
  /** Class metadata for Gd[VisualShaderNodeFresnel] lifetime management and casting. */
  given GodotClass[VisualShaderNodeFresnel] with {
    def className = "VisualShaderNodeFresnel"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeFresnel = new VisualShaderNodeFresnel {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeFresnel): GodotObject = t.hostObject
  }
}
