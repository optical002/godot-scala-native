package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GradientTexture2D`, extends `Texture2D`. */
abstract class GradientTexture2D extends Texture2D {
  override def godotClassName: String = "GradientTexture2D"

  /** GradientTexture2D.set_gradient */
  final def setGradient(gradient: Gradient): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_gradient == null) gdext.classes.GradientTexture2D.mb_set_gradient = MethodBind.get("GradientTexture2D", "set_gradient", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_gradient, livePtr, Wrappers.handle(gradient))
  }

  /** GradientTexture2D.get_gradient. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGradient(): Gradient = {
    if (gdext.classes.GradientTexture2D.mb_get_gradient == null) gdext.classes.GradientTexture2D.mb_get_gradient = MethodBind.get("GradientTexture2D", "get_gradient", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.GradientTexture2D.mb_get_gradient, livePtr))
  }

  /** GradientTexture2D.set_width */
  final def setWidth(width: Long): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_width == null) gdext.classes.GradientTexture2D.mb_set_width = MethodBind.get("GradientTexture2D", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_width, livePtr, width)
  }

  /** GradientTexture2D.set_height */
  final def setHeight(height: Long): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_height == null) gdext.classes.GradientTexture2D.mb_set_height = MethodBind.get("GradientTexture2D", "set_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_height, livePtr, height)
  }

  /** GradientTexture2D.set_use_hdr */
  final def setUseHdr(enabled: Boolean): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_use_hdr == null) gdext.classes.GradientTexture2D.mb_set_use_hdr = MethodBind.get("GradientTexture2D", "set_use_hdr", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_use_hdr, livePtr, enabled)
  }

  /** GradientTexture2D.is_using_hdr */
  final def isUsingHdr(): Boolean = {
    if (gdext.classes.GradientTexture2D.mb_is_using_hdr == null) gdext.classes.GradientTexture2D.mb_is_using_hdr = MethodBind.get("GradientTexture2D", "is_using_hdr", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GradientTexture2D.mb_is_using_hdr, livePtr)
  }

  /** GradientTexture2D.set_fill */
  final def setFill(fill: Long): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_fill == null) gdext.classes.GradientTexture2D.mb_set_fill = MethodBind.get("GradientTexture2D", "set_fill", 3623927636L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_fill, livePtr, fill)
  }

  /** GradientTexture2D.get_fill */
  final def getFill(): Long = {
    if (gdext.classes.GradientTexture2D.mb_get_fill == null) gdext.classes.GradientTexture2D.mb_get_fill = MethodBind.get("GradientTexture2D", "get_fill", 1876227217L)
    Ptrcall.call0[Long](gdext.classes.GradientTexture2D.mb_get_fill, livePtr)
  }

  /** GradientTexture2D.set_fill_from */
  final def setFillFrom(fill_from: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_fill_from == null) gdext.classes.GradientTexture2D.mb_set_fill_from = MethodBind.get("GradientTexture2D", "set_fill_from", 743155724L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_fill_from, livePtr, fill_from)
  }

  /** GradientTexture2D.get_fill_from */
  final def getFillFrom(): gdext.builtin.Vector2 = {
    if (gdext.classes.GradientTexture2D.mb_get_fill_from == null) gdext.classes.GradientTexture2D.mb_get_fill_from = MethodBind.get("GradientTexture2D", "get_fill_from", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.GradientTexture2D.mb_get_fill_from, livePtr)
  }

  /** GradientTexture2D.set_fill_to */
  final def setFillTo(fill_to: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_fill_to == null) gdext.classes.GradientTexture2D.mb_set_fill_to = MethodBind.get("GradientTexture2D", "set_fill_to", 743155724L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_fill_to, livePtr, fill_to)
  }

  /** GradientTexture2D.get_fill_to */
  final def getFillTo(): gdext.builtin.Vector2 = {
    if (gdext.classes.GradientTexture2D.mb_get_fill_to == null) gdext.classes.GradientTexture2D.mb_get_fill_to = MethodBind.get("GradientTexture2D", "get_fill_to", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.GradientTexture2D.mb_get_fill_to, livePtr)
  }

  /** GradientTexture2D.set_repeat */
  final def setRepeat(repeat: Long): Unit = {
    if (gdext.classes.GradientTexture2D.mb_set_repeat == null) gdext.classes.GradientTexture2D.mb_set_repeat = MethodBind.get("GradientTexture2D", "set_repeat", 1357597002L)
    Ptrcall.callVoid1(gdext.classes.GradientTexture2D.mb_set_repeat, livePtr, repeat)
  }

  /** GradientTexture2D.get_repeat */
  final def getRepeat(): Long = {
    if (gdext.classes.GradientTexture2D.mb_get_repeat == null) gdext.classes.GradientTexture2D.mb_get_repeat = MethodBind.get("GradientTexture2D", "get_repeat", 3351758665L)
    Ptrcall.call0[Long](gdext.classes.GradientTexture2D.mb_get_repeat, livePtr)
  }

}

object GradientTexture2D {
  private[classes] var mb_set_gradient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gradient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_hdr: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_hdr: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fill_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fill_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fill_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fill_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_repeat: GDExtensionMethodBindPtr = null
}
