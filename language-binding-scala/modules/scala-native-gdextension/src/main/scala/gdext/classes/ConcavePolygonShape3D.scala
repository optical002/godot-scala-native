package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ConcavePolygonShape3D`, extends `Shape3D`. */
abstract class ConcavePolygonShape3D extends Shape3D {
  override def godotClassName: String = "ConcavePolygonShape3D"

  /** ConcavePolygonShape3D.set_backface_collision_enabled */
  final def setBackfaceCollisionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ConcavePolygonShape3D", "set_backface_collision_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** ConcavePolygonShape3D.is_backface_collision_enabled */
  final def isBackfaceCollisionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ConcavePolygonShape3D", "is_backface_collision_enabled", 36873697L), hostObject.objectPtr)

}
