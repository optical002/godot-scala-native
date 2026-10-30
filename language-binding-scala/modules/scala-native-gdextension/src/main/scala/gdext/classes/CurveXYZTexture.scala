package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CurveXYZTexture`, extends `Texture2D`. */
abstract class CurveXYZTexture extends Texture2D {
  override def godotClassName: String = "CurveXYZTexture"

  /** CurveXYZTexture.set_width */
  final def setWidth(width: Long): Unit = {
    if (gdext.classes.CurveXYZTexture.mb_set_width == null) gdext.classes.CurveXYZTexture.mb_set_width = MethodBind.get("CurveXYZTexture", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CurveXYZTexture.mb_set_width, livePtr, width)
  }

  /** CurveXYZTexture.set_curve_x */
  final def setCurveX(curve: Curve): Unit = {
    if (gdext.classes.CurveXYZTexture.mb_set_curve_x == null) gdext.classes.CurveXYZTexture.mb_set_curve_x = MethodBind.get("CurveXYZTexture", "set_curve_x", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CurveXYZTexture.mb_set_curve_x, livePtr, Wrappers.handle(curve))
  }

  /** CurveXYZTexture.get_curve_x. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurveX(): Curve = {
    if (gdext.classes.CurveXYZTexture.mb_get_curve_x == null) gdext.classes.CurveXYZTexture.mb_get_curve_x = MethodBind.get("CurveXYZTexture", "get_curve_x", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CurveXYZTexture.mb_get_curve_x, livePtr))
  }

  /** CurveXYZTexture.set_curve_y */
  final def setCurveY(curve: Curve): Unit = {
    if (gdext.classes.CurveXYZTexture.mb_set_curve_y == null) gdext.classes.CurveXYZTexture.mb_set_curve_y = MethodBind.get("CurveXYZTexture", "set_curve_y", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CurveXYZTexture.mb_set_curve_y, livePtr, Wrappers.handle(curve))
  }

  /** CurveXYZTexture.get_curve_y. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurveY(): Curve = {
    if (gdext.classes.CurveXYZTexture.mb_get_curve_y == null) gdext.classes.CurveXYZTexture.mb_get_curve_y = MethodBind.get("CurveXYZTexture", "get_curve_y", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CurveXYZTexture.mb_get_curve_y, livePtr))
  }

  /** CurveXYZTexture.set_curve_z */
  final def setCurveZ(curve: Curve): Unit = {
    if (gdext.classes.CurveXYZTexture.mb_set_curve_z == null) gdext.classes.CurveXYZTexture.mb_set_curve_z = MethodBind.get("CurveXYZTexture", "set_curve_z", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CurveXYZTexture.mb_set_curve_z, livePtr, Wrappers.handle(curve))
  }

  /** CurveXYZTexture.get_curve_z. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurveZ(): Curve = {
    if (gdext.classes.CurveXYZTexture.mb_get_curve_z == null) gdext.classes.CurveXYZTexture.mb_get_curve_z = MethodBind.get("CurveXYZTexture", "get_curve_z", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CurveXYZTexture.mb_get_curve_z, livePtr))
  }

}

object CurveXYZTexture {
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve_z: GDExtensionMethodBindPtr = null
}
