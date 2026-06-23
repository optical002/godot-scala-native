package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer2DExtension`, extends `PhysicsServer2D`. */
abstract class PhysicsServer2DExtension extends PhysicsServer2D {

  /** PhysicsServer2DExtension.body_test_motion_is_excluding_object */
  final def bodyTestMotionIsExcludingObject(`object`: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PhysicsServer2DExtension", "body_test_motion_is_excluding_object", 1116898809L), hostObject.objectPtr, `object`)

}

object PhysicsServer2DExtension {
  /** Class metadata for Gd[PhysicsServer2DExtension] lifetime management and casting. */
  given GodotClass[PhysicsServer2DExtension] with {
    def className = "PhysicsServer2DExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsServer2DExtension = new PhysicsServer2DExtension {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsServer2DExtension): GodotObject = t.hostObject
  }
}
