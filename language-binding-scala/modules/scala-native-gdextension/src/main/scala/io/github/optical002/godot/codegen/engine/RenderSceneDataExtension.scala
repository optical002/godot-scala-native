package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneDataExtension`, extends `RenderSceneData`. */
abstract class RenderSceneDataExtension extends RenderSceneData {

}

object RenderSceneDataExtension {
  /** Class metadata for Gd[RenderSceneDataExtension] lifetime management and casting. */
  given GodotClass[RenderSceneDataExtension] with {
    def className = "RenderSceneDataExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderSceneDataExtension = new RenderSceneDataExtension {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneDataExtension): GodotObject = t.hostObject
  }
}
