package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CurveTexture`, extends `Texture2D`. */
abstract class CurveTexture extends Texture2D {
  override def godotClassName: String = "CurveTexture"

  /** CurveTexture.set_width */
  final def setWidth(width: Long): Unit = {
    if (gdext.classes.CurveTexture.mb_set_width == null) gdext.classes.CurveTexture.mb_set_width = MethodBind.get("CurveTexture", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CurveTexture.mb_set_width, livePtr, width)
  }

  /** CurveTexture.set_curve */
  final def setCurve(curve: Curve): Unit = {
    if (gdext.classes.CurveTexture.mb_set_curve == null) gdext.classes.CurveTexture.mb_set_curve = MethodBind.get("CurveTexture", "set_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CurveTexture.mb_set_curve, livePtr, Wrappers.handle(curve))
  }

  /** CurveTexture.get_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurve(): Curve = {
    if (gdext.classes.CurveTexture.mb_get_curve == null) gdext.classes.CurveTexture.mb_get_curve = MethodBind.get("CurveTexture", "get_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CurveTexture.mb_get_curve, livePtr))
  }

  /** CurveTexture.set_texture_mode */
  final def setTextureMode(texture_mode: Long): Unit = {
    if (gdext.classes.CurveTexture.mb_set_texture_mode == null) gdext.classes.CurveTexture.mb_set_texture_mode = MethodBind.get("CurveTexture", "set_texture_mode", 1321955367L)
    Ptrcall.callVoid1(gdext.classes.CurveTexture.mb_set_texture_mode, livePtr, texture_mode)
  }

  /** CurveTexture.get_texture_mode */
  final def getTextureMode(): Long = {
    if (gdext.classes.CurveTexture.mb_get_texture_mode == null) gdext.classes.CurveTexture.mb_get_texture_mode = MethodBind.get("CurveTexture", "get_texture_mode", 715756376L)
    Ptrcall.call0[Long](gdext.classes.CurveTexture.mb_get_texture_mode, livePtr)
  }

}

object CurveTexture {
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_mode: GDExtensionMethodBindPtr = null
}
