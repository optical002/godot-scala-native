package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
