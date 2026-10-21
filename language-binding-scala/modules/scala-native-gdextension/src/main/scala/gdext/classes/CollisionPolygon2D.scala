package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CollisionPolygon2D`, extends `Node2D`. */
abstract class CollisionPolygon2D extends Node2D {
  override def godotClassName: String = "CollisionPolygon2D"

  /** CollisionPolygon2D.set_build_mode */
  final def setBuildMode(build_mode: Long): Unit = {
    if (gdext.classes.CollisionPolygon2D.mb_set_build_mode == null) gdext.classes.CollisionPolygon2D.mb_set_build_mode = MethodBind.get("CollisionPolygon2D", "set_build_mode", 2780803135L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon2D.mb_set_build_mode, livePtr, build_mode)
  }

  /** CollisionPolygon2D.get_build_mode */
  final def getBuildMode(): Long = {
    if (gdext.classes.CollisionPolygon2D.mb_get_build_mode == null) gdext.classes.CollisionPolygon2D.mb_get_build_mode = MethodBind.get("CollisionPolygon2D", "get_build_mode", 3044948800L)
    Ptrcall.call0[Long](gdext.classes.CollisionPolygon2D.mb_get_build_mode, livePtr)
  }

  /** CollisionPolygon2D.set_disabled */
  final def setDisabled(disabled: Boolean): Unit = {
    if (gdext.classes.CollisionPolygon2D.mb_set_disabled == null) gdext.classes.CollisionPolygon2D.mb_set_disabled = MethodBind.get("CollisionPolygon2D", "set_disabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon2D.mb_set_disabled, livePtr, disabled)
  }

  /** CollisionPolygon2D.is_disabled */
  final def isDisabled(): Boolean = {
    if (gdext.classes.CollisionPolygon2D.mb_is_disabled == null) gdext.classes.CollisionPolygon2D.mb_is_disabled = MethodBind.get("CollisionPolygon2D", "is_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionPolygon2D.mb_is_disabled, livePtr)
  }

  /** CollisionPolygon2D.set_one_way_collision */
  final def setOneWayCollision(enabled: Boolean): Unit = {
    if (gdext.classes.CollisionPolygon2D.mb_set_one_way_collision == null) gdext.classes.CollisionPolygon2D.mb_set_one_way_collision = MethodBind.get("CollisionPolygon2D", "set_one_way_collision", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon2D.mb_set_one_way_collision, livePtr, enabled)
  }

  /** CollisionPolygon2D.is_one_way_collision_enabled */
  final def isOneWayCollisionEnabled(): Boolean = {
    if (gdext.classes.CollisionPolygon2D.mb_is_one_way_collision_enabled == null) gdext.classes.CollisionPolygon2D.mb_is_one_way_collision_enabled = MethodBind.get("CollisionPolygon2D", "is_one_way_collision_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionPolygon2D.mb_is_one_way_collision_enabled, livePtr)
  }

  /** CollisionPolygon2D.set_one_way_collision_margin */
  final def setOneWayCollisionMargin(margin: Double): Unit = {
    if (gdext.classes.CollisionPolygon2D.mb_set_one_way_collision_margin == null) gdext.classes.CollisionPolygon2D.mb_set_one_way_collision_margin = MethodBind.get("CollisionPolygon2D", "set_one_way_collision_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon2D.mb_set_one_way_collision_margin, livePtr, margin)
  }

  /** CollisionPolygon2D.get_one_way_collision_margin */
  final def getOneWayCollisionMargin(): Double = {
    if (gdext.classes.CollisionPolygon2D.mb_get_one_way_collision_margin == null) gdext.classes.CollisionPolygon2D.mb_get_one_way_collision_margin = MethodBind.get("CollisionPolygon2D", "get_one_way_collision_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CollisionPolygon2D.mb_get_one_way_collision_margin, livePtr)
  }

}

object CollisionPolygon2D {
  private[classes] var mb_set_build_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_build_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_way_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_one_way_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_way_collision_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_one_way_collision_margin: GDExtensionMethodBindPtr = null
}
