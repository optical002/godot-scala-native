package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectSpaceState2DExtension`, extends `PhysicsDirectSpaceState2D`. */
abstract class PhysicsDirectSpaceState2DExtension extends PhysicsDirectSpaceState2D {

}

object PhysicsDirectSpaceState2DExtension {
  /** Class metadata for Gd[PhysicsDirectSpaceState2DExtension] lifetime management and casting. */
  given GodotClass[PhysicsDirectSpaceState2DExtension] with {
    def className = "PhysicsDirectSpaceState2DExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsDirectSpaceState2DExtension = new PhysicsDirectSpaceState2DExtension {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsDirectSpaceState2DExtension): GodotObject = t.hostObject
  }
}
