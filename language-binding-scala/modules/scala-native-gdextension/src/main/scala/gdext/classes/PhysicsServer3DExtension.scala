package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsServer3DExtension`, extends `PhysicsServer3D`. */
abstract class PhysicsServer3DExtension extends PhysicsServer3D {
  override def godotClassName: String = "PhysicsServer3DExtension"

  /** PhysicsServer3DExtension.body_test_motion_is_excluding_object */
  final def bodyTestMotionIsExcludingObject(`object`: Long): Boolean = {
    if (gdext.classes.PhysicsServer3DExtension.mb_body_test_motion_is_excluding_object == null) gdext.classes.PhysicsServer3DExtension.mb_body_test_motion_is_excluding_object = MethodBind.get("PhysicsServer3DExtension", "body_test_motion_is_excluding_object", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PhysicsServer3DExtension.mb_body_test_motion_is_excluding_object, livePtr, `object`)
  }

}

object PhysicsServer3DExtension {
  private[classes] var mb_body_test_motion_is_excluding_object: GDExtensionMethodBindPtr = null
}
