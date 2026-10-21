package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimatableBody2D`, extends `StaticBody2D`. */
abstract class AnimatableBody2D extends StaticBody2D {
  override def godotClassName: String = "AnimatableBody2D"

  /** AnimatableBody2D.set_sync_to_physics */
  final def setSyncToPhysics(enable: Boolean): Unit = {
    if (gdext.classes.AnimatableBody2D.mb_set_sync_to_physics == null) gdext.classes.AnimatableBody2D.mb_set_sync_to_physics = MethodBind.get("AnimatableBody2D", "set_sync_to_physics", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimatableBody2D.mb_set_sync_to_physics, livePtr, enable)
  }

  /** AnimatableBody2D.is_sync_to_physics_enabled */
  final def isSyncToPhysicsEnabled(): Boolean = {
    if (gdext.classes.AnimatableBody2D.mb_is_sync_to_physics_enabled == null) gdext.classes.AnimatableBody2D.mb_is_sync_to_physics_enabled = MethodBind.get("AnimatableBody2D", "is_sync_to_physics_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimatableBody2D.mb_is_sync_to_physics_enabled, livePtr)
  }

}

object AnimatableBody2D {
  private[classes] var mb_set_sync_to_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sync_to_physics_enabled: GDExtensionMethodBindPtr = null
}
