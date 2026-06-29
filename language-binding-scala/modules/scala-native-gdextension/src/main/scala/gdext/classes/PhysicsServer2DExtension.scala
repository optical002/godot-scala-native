package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsServer2DExtension`, extends `PhysicsServer2D`. */
abstract class PhysicsServer2DExtension extends PhysicsServer2D {
  override def godotClassName: String = "PhysicsServer2DExtension"

  /** PhysicsServer2DExtension.body_test_motion_is_excluding_object */
  final def bodyTestMotionIsExcludingObject(`object`: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PhysicsServer2DExtension", "body_test_motion_is_excluding_object", 1116898809L), hostObject.objectPtr, `object`)

}
