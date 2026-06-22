package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectBodyState2DExtension`, extends `PhysicsDirectBodyState2D`. */
abstract class PhysicsDirectBodyState2DExtension extends PhysicsDirectBodyState2D {

}

object PhysicsDirectBodyState2DExtension {
  /** Class metadata for Gd[PhysicsDirectBodyState2DExtension] lifetime management and casting. */
  given GodotClass[PhysicsDirectBodyState2DExtension] with {
    def className = "PhysicsDirectBodyState2DExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsDirectBodyState2DExtension = new PhysicsDirectBodyState2DExtension {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsDirectBodyState2DExtension): GodotObject = t.hostObject
  }
}
