package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Path2D`, extends `Node2D`. */
abstract class Path2D extends Node2D {
  override def godotClassName: String = "Path2D"

  /** Path2D.set_curve */
  final def setCurve(curve: Curve2D): Unit = {
    if (gdext.classes.Path2D.mb_set_curve == null) gdext.classes.Path2D.mb_set_curve = MethodBind.get("Path2D", "set_curve", 659985499L)
    Ptrcall.callVoid1(gdext.classes.Path2D.mb_set_curve, livePtr, Wrappers.handle(curve))
  }

  /** Path2D.get_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurve(): Curve2D = {
    if (gdext.classes.Path2D.mb_get_curve == null) gdext.classes.Path2D.mb_get_curve = MethodBind.get("Path2D", "get_curve", 660369445L)
    Wrappers.owned[Curve2D](Ptrcall.call0[Long](gdext.classes.Path2D.mb_get_curve, livePtr))
  }

}

object Path2D {
  private[classes] var mb_set_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve: GDExtensionMethodBindPtr = null
}
