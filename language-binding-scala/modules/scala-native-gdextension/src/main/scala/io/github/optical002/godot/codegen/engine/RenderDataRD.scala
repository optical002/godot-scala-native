package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderDataRD`, extends `RenderData`. */
abstract class RenderDataRD extends RenderData {

}

object RenderDataRD {
  /** Class metadata for Gd[RenderDataRD] lifetime management and casting. */
  given GodotClass[RenderDataRD] with {
    def className = "RenderDataRD"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderDataRD = new RenderDataRD {}.withHost(o.objectPtr)
    def unwrap(t: RenderDataRD): GodotObject = t.hostObject
  }
}
