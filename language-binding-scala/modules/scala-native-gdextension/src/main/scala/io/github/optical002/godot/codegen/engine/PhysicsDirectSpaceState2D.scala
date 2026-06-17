package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectSpaceState2D`, extends `Object`. */
abstract class PhysicsDirectSpaceState2D extends Object {

}

object PhysicsDirectSpaceState2D {
  /** Class metadata for Gd[PhysicsDirectSpaceState2D] lifetime management and casting. */
  given GodotClass[PhysicsDirectSpaceState2D] with {
    def className = "PhysicsDirectSpaceState2D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsDirectSpaceState2D = new PhysicsDirectSpaceState2D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsDirectSpaceState2D): GodotObject = t.hostObject
  }
}
