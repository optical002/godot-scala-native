package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectBodyState3DExtension`, extends `PhysicsDirectBodyState3D`. */
abstract class PhysicsDirectBodyState3DExtension extends PhysicsDirectBodyState3D {

}

object PhysicsDirectBodyState3DExtension {
  /** Class metadata for Gd[PhysicsDirectBodyState3DExtension] lifetime management and casting. */
  given GodotClass[PhysicsDirectBodyState3DExtension] with {
    def className = "PhysicsDirectBodyState3DExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsDirectBodyState3DExtension = new PhysicsDirectBodyState3DExtension {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsDirectBodyState3DExtension): GodotObject = t.hostObject
  }
}
