package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Path3D`, extends `Node3D`. */
abstract class Path3D extends Node3D {
  override def godotClassName: String = "Path3D"

  /** Path3D.set_curve */
  final def setCurve(curve: Curve3D): Unit = {
    if (gdext.classes.Path3D.mb_set_curve == null) gdext.classes.Path3D.mb_set_curve = MethodBind.get("Path3D", "set_curve", 408955118L)
    Ptrcall.callVoid1(gdext.classes.Path3D.mb_set_curve, livePtr, Wrappers.handle(curve))
  }

  /** Path3D.get_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurve(): Curve3D = {
    if (gdext.classes.Path3D.mb_get_curve == null) gdext.classes.Path3D.mb_get_curve = MethodBind.get("Path3D", "get_curve", 4244715212L)
    Wrappers.owned[Curve3D](Ptrcall.call0[Long](gdext.classes.Path3D.mb_get_curve, livePtr))
  }

  /** Path3D.set_debug_custom_color */
  final def setDebugCustomColor(debug_custom_color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Path3D.mb_set_debug_custom_color == null) gdext.classes.Path3D.mb_set_debug_custom_color = MethodBind.get("Path3D", "set_debug_custom_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Path3D.mb_set_debug_custom_color, livePtr, debug_custom_color)
  }

  /** Path3D.get_debug_custom_color */
  final def getDebugCustomColor(): gdext.builtin.Color = {
    if (gdext.classes.Path3D.mb_get_debug_custom_color == null) gdext.classes.Path3D.mb_get_debug_custom_color = MethodBind.get("Path3D", "get_debug_custom_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Path3D.mb_get_debug_custom_color, livePtr)
  }

}

object Path3D {
  private[classes] var mb_set_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_custom_color: GDExtensionMethodBindPtr = null
}
