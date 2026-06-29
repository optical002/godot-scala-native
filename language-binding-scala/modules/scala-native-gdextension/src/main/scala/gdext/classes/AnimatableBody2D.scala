package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimatableBody2D`, extends `StaticBody2D`. */
abstract class AnimatableBody2D extends StaticBody2D {
  override def godotClassName: String = "AnimatableBody2D"

  /** AnimatableBody2D.set_sync_to_physics */
  final def setSyncToPhysics(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatableBody2D", "set_sync_to_physics", 2586408642L), hostObject.objectPtr, enable)

  /** AnimatableBody2D.is_sync_to_physics_enabled */
  final def isSyncToPhysicsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatableBody2D", "is_sync_to_physics_enabled", 36873697L), hostObject.objectPtr)

}
