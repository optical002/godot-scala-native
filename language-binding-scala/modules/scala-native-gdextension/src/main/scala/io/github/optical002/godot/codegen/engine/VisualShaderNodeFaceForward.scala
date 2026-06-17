package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
