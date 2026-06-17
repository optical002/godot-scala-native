package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectSpaceState3D`, extends `Object`. */
abstract class PhysicsDirectSpaceState3D extends Object {

}

object PhysicsDirectSpaceState3D {
  /** Class metadata for Gd[PhysicsDirectSpaceState3D] lifetime management and casting. */
  given GodotClass[PhysicsDirectSpaceState3D] with {
    def className = "PhysicsDirectSpaceState3D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsDirectSpaceState3D = new PhysicsDirectSpaceState3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsDirectSpaceState3D): GodotObject = t.hostObject
  }
}
