package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeProximityFade`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeProximityFade extends VisualShaderNode {

}

object VisualShaderNodeProximityFade {
  /** Class metadata for Gd[VisualShaderNodeProximityFade] lifetime management and casting. */
  given GodotClass[VisualShaderNodeProximityFade] with {
    def className = "VisualShaderNodeProximityFade"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeProximityFade = new VisualShaderNodeProximityFade {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeProximityFade): GodotObject = t.hostObject
  }
}
