package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeDistanceFade`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeDistanceFade extends VisualShaderNode {

}

object VisualShaderNodeDistanceFade {
  /** Class metadata for Gd[VisualShaderNodeDistanceFade] lifetime management and casting. */
  given GodotClass[VisualShaderNodeDistanceFade] with {
    def className = "VisualShaderNodeDistanceFade"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeDistanceFade = new VisualShaderNodeDistanceFade {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeDistanceFade): GodotObject = t.hostObject
  }
}
