package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
