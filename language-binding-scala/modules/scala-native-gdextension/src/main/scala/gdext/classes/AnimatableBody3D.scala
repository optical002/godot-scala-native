package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimatableBody3D`, extends `StaticBody3D`. */
abstract class AnimatableBody3D extends StaticBody3D {
  override def godotClassName: String = "AnimatableBody3D"

  /** AnimatableBody3D.set_sync_to_physics */
  final def setSyncToPhysics(enable: Boolean): Unit = {
    if (gdext.classes.AnimatableBody3D.mb_set_sync_to_physics == null) gdext.classes.AnimatableBody3D.mb_set_sync_to_physics = MethodBind.get("AnimatableBody3D", "set_sync_to_physics", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimatableBody3D.mb_set_sync_to_physics, livePtr, enable)
  }

  /** AnimatableBody3D.is_sync_to_physics_enabled */
  final def isSyncToPhysicsEnabled(): Boolean = {
    if (gdext.classes.AnimatableBody3D.mb_is_sync_to_physics_enabled == null) gdext.classes.AnimatableBody3D.mb_is_sync_to_physics_enabled = MethodBind.get("AnimatableBody3D", "is_sync_to_physics_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatableBody3D.mb_is_sync_to_physics_enabled, livePtr)
  }

}

object AnimatableBody3D {
  private[classes] var mb_set_sync_to_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sync_to_physics_enabled: GDExtensionMethodBindPtr = null
}
