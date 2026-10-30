package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CollisionPolygon3D`, extends `Node3D`. */
abstract class CollisionPolygon3D extends Node3D {
  override def godotClassName: String = "CollisionPolygon3D"

  /** CollisionPolygon3D.set_depth */
  final def setDepth(depth: Double): Unit = {
    if (gdext.classes.CollisionPolygon3D.mb_set_depth == null) gdext.classes.CollisionPolygon3D.mb_set_depth = MethodBind.get("CollisionPolygon3D", "set_depth", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon3D.mb_set_depth, livePtr, depth)
  }

  /** CollisionPolygon3D.get_depth */
  final def getDepth(): Double = {
    if (gdext.classes.CollisionPolygon3D.mb_get_depth == null) gdext.classes.CollisionPolygon3D.mb_get_depth = MethodBind.get("CollisionPolygon3D", "get_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CollisionPolygon3D.mb_get_depth, livePtr)
  }

  /** CollisionPolygon3D.set_disabled */
  final def setDisabled(disabled: Boolean): Unit = {
    if (gdext.classes.CollisionPolygon3D.mb_set_disabled == null) gdext.classes.CollisionPolygon3D.mb_set_disabled = MethodBind.get("CollisionPolygon3D", "set_disabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon3D.mb_set_disabled, livePtr, disabled)
  }

  /** CollisionPolygon3D.is_disabled */
  final def isDisabled(): Boolean = {
    if (gdext.classes.CollisionPolygon3D.mb_is_disabled == null) gdext.classes.CollisionPolygon3D.mb_is_disabled = MethodBind.get("CollisionPolygon3D", "is_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionPolygon3D.mb_is_disabled, livePtr)
  }

  /** CollisionPolygon3D.set_debug_color */
  final def setDebugColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CollisionPolygon3D.mb_set_debug_color == null) gdext.classes.CollisionPolygon3D.mb_set_debug_color = MethodBind.get("CollisionPolygon3D", "set_debug_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon3D.mb_set_debug_color, livePtr, color)
  }

  /** CollisionPolygon3D.get_debug_color */
  final def getDebugColor(): gdext.builtin.Color = {
    if (gdext.classes.CollisionPolygon3D.mb_get_debug_color == null) gdext.classes.CollisionPolygon3D.mb_get_debug_color = MethodBind.get("CollisionPolygon3D", "get_debug_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CollisionPolygon3D.mb_get_debug_color, livePtr)
  }

  /** CollisionPolygon3D.set_enable_debug_fill */
  final def setEnableDebugFill(enable: Boolean): Unit = {
    if (gdext.classes.CollisionPolygon3D.mb_set_enable_debug_fill == null) gdext.classes.CollisionPolygon3D.mb_set_enable_debug_fill = MethodBind.get("CollisionPolygon3D", "set_enable_debug_fill", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon3D.mb_set_enable_debug_fill, livePtr, enable)
  }

  /** CollisionPolygon3D.get_enable_debug_fill */
  final def getEnableDebugFill(): Boolean = {
    if (gdext.classes.CollisionPolygon3D.mb_get_enable_debug_fill == null) gdext.classes.CollisionPolygon3D.mb_get_enable_debug_fill = MethodBind.get("CollisionPolygon3D", "get_enable_debug_fill", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionPolygon3D.mb_get_enable_debug_fill, livePtr)
  }

  /** CollisionPolygon3D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.CollisionPolygon3D.mb_set_margin == null) gdext.classes.CollisionPolygon3D.mb_set_margin = MethodBind.get("CollisionPolygon3D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CollisionPolygon3D.mb_set_margin, livePtr, margin)
  }

  /** CollisionPolygon3D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.CollisionPolygon3D.mb_get_margin == null) gdext.classes.CollisionPolygon3D.mb_get_margin = MethodBind.get("CollisionPolygon3D", "get_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CollisionPolygon3D.mb_get_margin, livePtr)
  }

}

object CollisionPolygon3D {
  private[classes] var mb_set_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_debug_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_debug_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
}
