package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFaceForward`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeFaceForward extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeFaceForward {
  /** Class metadata for Gd[VisualShaderNodeFaceForward] lifetime management and casting. */
  given GodotClass[VisualShaderNodeFaceForward] with {
    def className = "VisualShaderNodeFaceForward"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeFaceForward = new VisualShaderNodeFaceForward {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeFaceForward): GodotObject = t.hostObject
  }
}
