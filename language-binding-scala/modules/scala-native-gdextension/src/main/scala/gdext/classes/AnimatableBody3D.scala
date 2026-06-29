package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimatableBody3D`, extends `StaticBody3D`. */
abstract class AnimatableBody3D extends StaticBody3D {
  override def godotClassName: String = "AnimatableBody3D"

  /** AnimatableBody3D.set_sync_to_physics */
  final def setSyncToPhysics(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimatableBody3D", "set_sync_to_physics", 2586408642L), hostObject.objectPtr, enable)

  /** AnimatableBody3D.is_sync_to_physics_enabled */
  final def isSyncToPhysicsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimatableBody3D", "is_sync_to_physics_enabled", 36873697L), hostObject.objectPtr)

}
