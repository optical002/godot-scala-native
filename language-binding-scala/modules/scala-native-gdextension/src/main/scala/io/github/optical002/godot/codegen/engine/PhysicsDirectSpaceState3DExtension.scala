package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectSpaceState3DExtension`, extends `PhysicsDirectSpaceState3D`. */
abstract class PhysicsDirectSpaceState3DExtension extends PhysicsDirectSpaceState3D {

}

object PhysicsDirectSpaceState3DExtension {
  /** Class metadata for Gd[PhysicsDirectSpaceState3DExtension] lifetime management and casting. */
  given GodotClass[PhysicsDirectSpaceState3DExtension] with {
    def className = "PhysicsDirectSpaceState3DExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsDirectSpaceState3DExtension = new PhysicsDirectSpaceState3DExtension {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsDirectSpaceState3DExtension): GodotObject = t.hostObject
  }
}
