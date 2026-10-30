package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GradientTexture1D`, extends `Texture2D`. */
abstract class GradientTexture1D extends Texture2D {
  override def godotClassName: String = "GradientTexture1D"

  /** GradientTexture1D.set_gradient */
  final def setGradient(gradient: Gradient): Unit = {
    if (gdext.classes.GradientTexture1D.mb_set_gradient == null) gdext.classes.GradientTexture1D.mb_set_gradient = MethodBind.get("GradientTexture1D", "set_gradient", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture1D.mb_set_gradient, livePtr, Wrappers.handle(gradient))
  }

  /** GradientTexture1D.get_gradient. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGradient(): Gradient = {
    if (gdext.classes.GradientTexture1D.mb_get_gradient == null) gdext.classes.GradientTexture1D.mb_get_gradient = MethodBind.get("GradientTexture1D", "get_gradient", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.GradientTexture1D.mb_get_gradient, livePtr))
  }

  /** GradientTexture1D.set_width */
  final def setWidth(width: Long): Unit = {
    if (gdext.classes.GradientTexture1D.mb_set_width == null) gdext.classes.GradientTexture1D.mb_set_width = MethodBind.get("GradientTexture1D", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture1D.mb_set_width, livePtr, width)
  }

  /** GradientTexture1D.set_use_hdr */
  final def setUseHdr(enabled: Boolean): Unit = {
    if (gdext.classes.GradientTexture1D.mb_set_use_hdr == null) gdext.classes.GradientTexture1D.mb_set_use_hdr = MethodBind.get("GradientTexture1D", "set_use_hdr", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture1D.mb_set_use_hdr, livePtr, enabled)
  }

  /** GradientTexture1D.is_using_hdr */
  final def isUsingHdr(): Boolean = {
    if (gdext.classes.GradientTexture1D.mb_is_using_hdr == null) gdext.classes.GradientTexture1D.mb_is_using_hdr = MethodBind.get("GradientTexture1D", "is_using_hdr", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GradientTexture1D.mb_is_using_hdr, livePtr)
  }

}

object GradientTexture1D {
  private[classes] var mb_set_gradient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gradient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_hdr: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_hdr: GDExtensionMethodBindPtr = null
}
