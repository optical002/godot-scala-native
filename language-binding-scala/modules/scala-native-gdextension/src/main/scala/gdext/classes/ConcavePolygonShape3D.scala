package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ConcavePolygonShape3D`, extends `Shape3D`. */
abstract class ConcavePolygonShape3D extends Shape3D {
  override def godotClassName: String = "ConcavePolygonShape3D"

  /** ConcavePolygonShape3D.set_backface_collision_enabled */
  final def setBackfaceCollisionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.ConcavePolygonShape3D.mb_set_backface_collision_enabled == null) gdext.classes.ConcavePolygonShape3D.mb_set_backface_collision_enabled = MethodBind.get("ConcavePolygonShape3D", "set_backface_collision_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ConcavePolygonShape3D.mb_set_backface_collision_enabled, livePtr, enabled)
  }

  /** ConcavePolygonShape3D.is_backface_collision_enabled */
  final def isBackfaceCollisionEnabled(): Boolean = {
    if (gdext.classes.ConcavePolygonShape3D.mb_is_backface_collision_enabled == null) gdext.classes.ConcavePolygonShape3D.mb_is_backface_collision_enabled = MethodBind.get("ConcavePolygonShape3D", "is_backface_collision_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ConcavePolygonShape3D.mb_is_backface_collision_enabled, livePtr)
  }

}

object ConcavePolygonShape3D {
  private[classes] var mb_set_backface_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_backface_collision_enabled: GDExtensionMethodBindPtr = null
}
