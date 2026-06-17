package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeSync`, extends `AnimationNode`. */
abstract class AnimationNodeSync extends AnimationNode {

  /** AnimationNodeSync.set_use_sync */
  final def setUseSync(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeSync", "set_use_sync", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeSync.is_using_sync */
  final def isUsingSync(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeSync", "is_using_sync", 36873697L), hostObject.objectPtr)

}

object AnimationNodeSync {
  /** Class metadata for Gd[AnimationNodeSync] lifetime management and casting. */
  given GodotClass[AnimationNodeSync] with {
    def className = "AnimationNodeSync"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeSync = new AnimationNodeSync {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeSync): GodotObject = t.hostObject
  }
}
