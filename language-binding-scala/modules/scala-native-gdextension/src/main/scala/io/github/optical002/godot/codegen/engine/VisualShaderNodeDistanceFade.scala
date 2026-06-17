package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
