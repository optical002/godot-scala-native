package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer3DExtension`, extends `PhysicsServer3D`. */
abstract class PhysicsServer3DExtension extends PhysicsServer3D {

  /** PhysicsServer3DExtension.body_test_motion_is_excluding_object */
  final def bodyTestMotionIsExcludingObject(`object`: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PhysicsServer3DExtension", "body_test_motion_is_excluding_object", 1116898809L), hostObject.objectPtr, `object`)

}

object PhysicsServer3DExtension {
  /** Class metadata for Gd[PhysicsServer3DExtension] lifetime management and casting. */
  given GodotClass[PhysicsServer3DExtension] with {
    def className = "PhysicsServer3DExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsServer3DExtension = new PhysicsServer3DExtension {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsServer3DExtension): GodotObject = t.hostObject
  }
}
