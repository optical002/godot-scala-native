package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneBuffersExtension`, extends `RenderSceneBuffers`. */
abstract class RenderSceneBuffersExtension extends RenderSceneBuffers {

}

object RenderSceneBuffersExtension {
  /** Class metadata for Gd[RenderSceneBuffersExtension] lifetime management and casting. */
  given GodotClass[RenderSceneBuffersExtension] with {
    def className = "RenderSceneBuffersExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): RenderSceneBuffersExtension = new RenderSceneBuffersExtension {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneBuffersExtension): GodotObject = t.hostObject
  }
}
