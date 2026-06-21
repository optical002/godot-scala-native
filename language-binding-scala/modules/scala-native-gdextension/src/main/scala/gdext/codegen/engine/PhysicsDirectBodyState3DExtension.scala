package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
