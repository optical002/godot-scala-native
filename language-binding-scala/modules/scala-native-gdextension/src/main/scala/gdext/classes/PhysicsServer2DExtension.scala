package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer2DExtension`, extends `PhysicsServer2D`. */
abstract class PhysicsServer2DExtension extends PhysicsServer2D {
  override def godotClassName: String = "PhysicsServer2DExtension"

  /** PhysicsServer2DExtension.body_test_motion_is_excluding_object */
  final def bodyTestMotionIsExcludingObject(`object`: Long): Boolean = {
    if (gdext.classes.PhysicsServer2DExtension.mb_body_test_motion_is_excluding_object == null) gdext.classes.PhysicsServer2DExtension.mb_body_test_motion_is_excluding_object = MethodBind.get("PhysicsServer2DExtension", "body_test_motion_is_excluding_object", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PhysicsServer2DExtension.mb_body_test_motion_is_excluding_object, livePtr, `object`)
  }

}

object PhysicsServer2DExtension {
  private[classes] var mb_body_test_motion_is_excluding_object: GDExtensionMethodBindPtr = null
}
