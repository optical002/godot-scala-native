package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimatableBody3D`, extends `StaticBody3D`. */
abstract class AnimatableBody3D extends StaticBody3D {

  /** AnimatableBody3D.set_sync_to_physics */
  final def setSyncToPhysics(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatableBody3D", "set_sync_to_physics", 2586408642L), hostObject.objectPtr, enable)

  /** AnimatableBody3D.is_sync_to_physics_enabled */
  final def isSyncToPhysicsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatableBody3D", "is_sync_to_physics_enabled", 36873697L), hostObject.objectPtr)

}

object AnimatableBody3D {
  /** Class metadata for Gd[AnimatableBody3D] lifetime management and casting. */
  given GodotClass[AnimatableBody3D] with {
    def className = "AnimatableBody3D"
    def isRefCounted = false
    def wrap(o: GodotObject): AnimatableBody3D = new AnimatableBody3D {}.withHost(o.objectPtr)
    def unwrap(t: AnimatableBody3D): GodotObject = t.hostObject
  }
}
