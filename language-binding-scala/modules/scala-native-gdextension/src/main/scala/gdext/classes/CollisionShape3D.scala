package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CollisionShape3D`, extends `Node3D`. */
abstract class CollisionShape3D extends Node3D {
  override def godotClassName: String = "CollisionShape3D"

  /** CollisionShape3D.resource_changed */
  final def resourceChanged(resource: Resource): Unit = {
    if (gdext.classes.CollisionShape3D.mb_resource_changed == null) gdext.classes.CollisionShape3D.mb_resource_changed = MethodBind.get("CollisionShape3D", "resource_changed", 968641751L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape3D.mb_resource_changed, livePtr, Wrappers.handle(resource))
  }

  /** CollisionShape3D.set_shape */
  final def setShape(shape: Shape3D): Unit = {
    if (gdext.classes.CollisionShape3D.mb_set_shape == null) gdext.classes.CollisionShape3D.mb_set_shape = MethodBind.get("CollisionShape3D", "set_shape", 1549710052L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape3D.mb_set_shape, livePtr, Wrappers.handle(shape))
  }

  /** CollisionShape3D.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(): Shape3D = {
    if (gdext.classes.CollisionShape3D.mb_get_shape == null) gdext.classes.CollisionShape3D.mb_get_shape = MethodBind.get("CollisionShape3D", "get_shape", 3214262478L)
    Wrappers.owned[Shape3D](Ptrcall.call0[Long](gdext.classes.CollisionShape3D.mb_get_shape, livePtr))
  }

  /** CollisionShape3D.set_disabled */
  final def setDisabled(enable: Boolean): Unit = {
    if (gdext.classes.CollisionShape3D.mb_set_disabled == null) gdext.classes.CollisionShape3D.mb_set_disabled = MethodBind.get("CollisionShape3D", "set_disabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape3D.mb_set_disabled, livePtr, enable)
  }

  /** CollisionShape3D.is_disabled */
  final def isDisabled(): Boolean = {
    if (gdext.classes.CollisionShape3D.mb_is_disabled == null) gdext.classes.CollisionShape3D.mb_is_disabled = MethodBind.get("CollisionShape3D", "is_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionShape3D.mb_is_disabled, livePtr)
  }

  /** CollisionShape3D.make_convex_from_siblings */
  final def makeConvexFromSiblings(): Unit = {
    if (gdext.classes.CollisionShape3D.mb_make_convex_from_siblings == null) gdext.classes.CollisionShape3D.mb_make_convex_from_siblings = MethodBind.get("CollisionShape3D", "make_convex_from_siblings", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CollisionShape3D.mb_make_convex_from_siblings, livePtr)
  }

  /** CollisionShape3D.set_debug_color */
  final def setDebugColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CollisionShape3D.mb_set_debug_color == null) gdext.classes.CollisionShape3D.mb_set_debug_color = MethodBind.get("CollisionShape3D", "set_debug_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape3D.mb_set_debug_color, livePtr, color)
  }

  /** CollisionShape3D.get_debug_color */
  final def getDebugColor(): gdext.builtin.Color = {
    if (gdext.classes.CollisionShape3D.mb_get_debug_color == null) gdext.classes.CollisionShape3D.mb_get_debug_color = MethodBind.get("CollisionShape3D", "get_debug_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CollisionShape3D.mb_get_debug_color, livePtr)
  }

  /** CollisionShape3D.set_enable_debug_fill */
  final def setEnableDebugFill(enable: Boolean): Unit = {
    if (gdext.classes.CollisionShape3D.mb_set_enable_debug_fill == null) gdext.classes.CollisionShape3D.mb_set_enable_debug_fill = MethodBind.get("CollisionShape3D", "set_enable_debug_fill", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionShape3D.mb_set_enable_debug_fill, livePtr, enable)
  }

  /** CollisionShape3D.get_enable_debug_fill */
  final def getEnableDebugFill(): Boolean = {
    if (gdext.classes.CollisionShape3D.mb_get_enable_debug_fill == null) gdext.classes.CollisionShape3D.mb_get_enable_debug_fill = MethodBind.get("CollisionShape3D", "get_enable_debug_fill", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionShape3D.mb_get_enable_debug_fill, livePtr)
  }

}

object CollisionShape3D {
  private[classes] var mb_resource_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_convex_from_siblings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_debug_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_debug_fill: GDExtensionMethodBindPtr = null
}
