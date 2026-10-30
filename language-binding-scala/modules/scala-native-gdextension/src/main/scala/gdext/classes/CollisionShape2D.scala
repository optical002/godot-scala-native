package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CollisionShape2D`, extends `Node2D`. */
abstract class CollisionShape2D extends Node2D {
  override def godotClassName: String = "CollisionShape2D"

  /** CollisionShape2D.set_shape */
  final def setShape(shape: Shape2D): Unit = {
    if (gdext.classes.CollisionShape2D.mb_set_shape == null) gdext.classes.CollisionShape2D.mb_set_shape = MethodBind.get("CollisionShape2D", "set_shape", 771364740L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape2D.mb_set_shape, livePtr, Wrappers.handle(shape))
  }

  /** CollisionShape2D.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(): Shape2D = {
    if (gdext.classes.CollisionShape2D.mb_get_shape == null) gdext.classes.CollisionShape2D.mb_get_shape = MethodBind.get("CollisionShape2D", "get_shape", 522005891L)
    Wrappers.owned[Shape2D](Ptrcall.call0[Long](gdext.classes.CollisionShape2D.mb_get_shape, livePtr))
  }

  /** CollisionShape2D.set_disabled */
  final def setDisabled(disabled: Boolean): Unit = {
    if (gdext.classes.CollisionShape2D.mb_set_disabled == null) gdext.classes.CollisionShape2D.mb_set_disabled = MethodBind.get("CollisionShape2D", "set_disabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape2D.mb_set_disabled, livePtr, disabled)
  }

  /** CollisionShape2D.is_disabled */
  final def isDisabled(): Boolean = {
    if (gdext.classes.CollisionShape2D.mb_is_disabled == null) gdext.classes.CollisionShape2D.mb_is_disabled = MethodBind.get("CollisionShape2D", "is_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionShape2D.mb_is_disabled, livePtr)
  }

  /** CollisionShape2D.set_one_way_collision */
  final def setOneWayCollision(enabled: Boolean): Unit = {
    if (gdext.classes.CollisionShape2D.mb_set_one_way_collision == null) gdext.classes.CollisionShape2D.mb_set_one_way_collision = MethodBind.get("CollisionShape2D", "set_one_way_collision", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape2D.mb_set_one_way_collision, livePtr, enabled)
  }

  /** CollisionShape2D.is_one_way_collision_enabled */
  final def isOneWayCollisionEnabled(): Boolean = {
    if (gdext.classes.CollisionShape2D.mb_is_one_way_collision_enabled == null) gdext.classes.CollisionShape2D.mb_is_one_way_collision_enabled = MethodBind.get("CollisionShape2D", "is_one_way_collision_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionShape2D.mb_is_one_way_collision_enabled, livePtr)
  }

  /** CollisionShape2D.set_one_way_collision_margin */
  final def setOneWayCollisionMargin(margin: Double): Unit = {
    if (gdext.classes.CollisionShape2D.mb_set_one_way_collision_margin == null) gdext.classes.CollisionShape2D.mb_set_one_way_collision_margin = MethodBind.get("CollisionShape2D", "set_one_way_collision_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape2D.mb_set_one_way_collision_margin, livePtr, margin)
  }

  /** CollisionShape2D.get_one_way_collision_margin */
  final def getOneWayCollisionMargin(): Double = {
    if (gdext.classes.CollisionShape2D.mb_get_one_way_collision_margin == null) gdext.classes.CollisionShape2D.mb_get_one_way_collision_margin = MethodBind.get("CollisionShape2D", "get_one_way_collision_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CollisionShape2D.mb_get_one_way_collision_margin, livePtr)
  }

  /** CollisionShape2D.set_debug_color */
  final def setDebugColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CollisionShape2D.mb_set_debug_color == null) gdext.classes.CollisionShape2D.mb_set_debug_color = MethodBind.get("CollisionShape2D", "set_debug_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape2D.mb_set_debug_color, livePtr, color)
  }

  /** CollisionShape2D.get_debug_color */
  final def getDebugColor(): gdext.builtin.Color = {
    if (gdext.classes.CollisionShape2D.mb_get_debug_color == null) gdext.classes.CollisionShape2D.mb_get_debug_color = MethodBind.get("CollisionShape2D", "get_debug_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CollisionShape2D.mb_get_debug_color, livePtr)
  }

}

object CollisionShape2D {
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_way_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_one_way_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_way_collision_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_one_way_collision_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_color: GDExtensionMethodBindPtr = null
}
