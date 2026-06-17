package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderDataExtension`, extends `RenderData`. */
abstract class RenderDataExtension extends RenderData {

}

object RenderDataExtension {
  /** Class metadata for Gd[RenderDataExtension] lifetime management and casting. */
  given GodotClass[RenderDataExtension] with {
    def className = "RenderDataExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderDataExtension = new RenderDataExtension {}.withHost(o.objectPtr)
    def unwrap(t: RenderDataExtension): GodotObject = t.hostObject
  }
}
