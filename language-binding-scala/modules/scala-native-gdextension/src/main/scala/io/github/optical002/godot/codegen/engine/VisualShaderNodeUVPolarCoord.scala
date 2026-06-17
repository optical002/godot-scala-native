package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
