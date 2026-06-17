package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneDataRD`, extends `RenderSceneData`. */
abstract class RenderSceneDataRD extends RenderSceneData {

}

object RenderSceneDataRD {
  /** Class metadata for Gd[RenderSceneDataRD] lifetime management and casting. */
  given GodotClass[RenderSceneDataRD] with {
    def className = "RenderSceneDataRD"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderSceneDataRD = new RenderSceneDataRD {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneDataRD): GodotObject = t.hostObject
  }
}
