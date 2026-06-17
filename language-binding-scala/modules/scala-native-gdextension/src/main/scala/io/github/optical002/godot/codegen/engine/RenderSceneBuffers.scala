package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneBuffers`, extends `RefCounted`. */
abstract class RenderSceneBuffers extends RefCounted {

  /** RenderSceneBuffers.configure */
  final def configure(config: RenderSceneBuffersConfiguration): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffers", "configure", 3072623270L), hostObject.objectPtr, config.hostObject)

}

object RenderSceneBuffers {
  /** Class metadata for Gd[RenderSceneBuffers] lifetime management and casting. */
  given GodotClass[RenderSceneBuffers] with {
    def className = "RenderSceneBuffers"
    def isRefCounted = true
    def wrap(o: GodotObject): RenderSceneBuffers = new RenderSceneBuffers {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneBuffers): GodotObject = t.hostObject
  }
}
