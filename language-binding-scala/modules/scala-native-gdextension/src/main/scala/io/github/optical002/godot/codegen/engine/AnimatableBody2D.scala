package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimatableBody2D`, extends `StaticBody2D`. */
abstract class AnimatableBody2D extends StaticBody2D {

  /** AnimatableBody2D.set_sync_to_physics */
  final def setSyncToPhysics(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatableBody2D", "set_sync_to_physics", 2586408642L), hostObject.objectPtr, enable)

  /** AnimatableBody2D.is_sync_to_physics_enabled */
  final def isSyncToPhysicsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatableBody2D", "is_sync_to_physics_enabled", 36873697L), hostObject.objectPtr)

}

object AnimatableBody2D {
  /** Class metadata for Gd[AnimatableBody2D] lifetime management and casting. */
  given GodotClass[AnimatableBody2D] with {
    def className = "AnimatableBody2D"
    def isRefCounted = false
    def wrap(o: GodotObject): AnimatableBody2D = new AnimatableBody2D {}.withHost(o.objectPtr)
    def unwrap(t: AnimatableBody2D): GodotObject = t.hostObject
  }
}
