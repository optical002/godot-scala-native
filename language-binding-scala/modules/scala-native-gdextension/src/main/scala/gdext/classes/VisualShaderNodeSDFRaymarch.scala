package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeSDFRaymarch`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSDFRaymarch extends VisualShaderNode {

}

object VisualShaderNodeSDFRaymarch {
  /** Class metadata for Gd[VisualShaderNodeSDFRaymarch] lifetime management and casting. */
  given GodotClass[VisualShaderNodeSDFRaymarch] with {
    def className = "VisualShaderNodeSDFRaymarch"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeSDFRaymarch = new VisualShaderNodeSDFRaymarch {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeSDFRaymarch): GodotObject = t.hostObject
  }
}
