package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUVPolarCoord`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUVPolarCoord extends VisualShaderNode {

}

object VisualShaderNodeUVPolarCoord {
  /** Class metadata for Gd[VisualShaderNodeUVPolarCoord] lifetime management and casting. */
  given GodotClass[VisualShaderNodeUVPolarCoord] with {
    def className = "VisualShaderNodeUVPolarCoord"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeUVPolarCoord = new VisualShaderNodeUVPolarCoord {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeUVPolarCoord): GodotObject = t.hostObject
  }
}
