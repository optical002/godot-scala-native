package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeOuterProduct`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeOuterProduct extends VisualShaderNode {

}

object VisualShaderNodeOuterProduct {
  /** Class metadata for Gd[VisualShaderNodeOuterProduct] lifetime management and casting. */
  given GodotClass[VisualShaderNodeOuterProduct] with {
    def className = "VisualShaderNodeOuterProduct"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeOuterProduct = new VisualShaderNodeOuterProduct {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeOuterProduct): GodotObject = t.hostObject
  }
}
