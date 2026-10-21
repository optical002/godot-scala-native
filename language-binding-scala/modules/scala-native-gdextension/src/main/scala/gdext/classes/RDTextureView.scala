package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDTextureView`, extends `RefCounted`. */
abstract class RDTextureView extends RefCounted {
  override def godotClassName: String = "RDTextureView"

  /** RDTextureView.set_format_override */
  final def setFormatOverride(p_member: Long): Unit = {
    if (gdext.classes.RDTextureView.mb_set_format_override == null) gdext.classes.RDTextureView.mb_set_format_override = MethodBind.get("RDTextureView", "set_format_override", 565531219L)
    Ptrcall.callVoid1(gdext.classes.RDTextureView.mb_set_format_override, livePtr, p_member)
  }

  /** RDTextureView.get_format_override */
  final def getFormatOverride(): Long = {
    if (gdext.classes.RDTextureView.mb_get_format_override == null) gdext.classes.RDTextureView.mb_get_format_override = MethodBind.get("RDTextureView", "get_format_override", 2235804183L)
    Ptrcall.call0[Long](gdext.classes.RDTextureView.mb_get_format_override, livePtr)
  }

  /** RDTextureView.set_swizzle_r */
  final def setSwizzleR(p_member: Long): Unit = {
    if (gdext.classes.RDTextureView.mb_set_swizzle_r == null) gdext.classes.RDTextureView.mb_set_swizzle_r = MethodBind.get("RDTextureView", "set_swizzle_r", 3833362581L)
    Ptrcall.callVoid1(gdext.classes.RDTextureView.mb_set_swizzle_r, livePtr, p_member)
  }

  /** RDTextureView.get_swizzle_r */
  final def getSwizzleR(): Long = {
    if (gdext.classes.RDTextureView.mb_get_swizzle_r == null) gdext.classes.RDTextureView.mb_get_swizzle_r = MethodBind.get("RDTextureView", "get_swizzle_r", 4150792614L)
    Ptrcall.call0[Long](gdext.classes.RDTextureView.mb_get_swizzle_r, livePtr)
  }

  /** RDTextureView.set_swizzle_g */
  final def setSwizzleG(p_member: Long): Unit = {
    if (gdext.classes.RDTextureView.mb_set_swizzle_g == null) gdext.classes.RDTextureView.mb_set_swizzle_g = MethodBind.get("RDTextureView", "set_swizzle_g", 3833362581L)
    Ptrcall.callVoid1(gdext.classes.RDTextureView.mb_set_swizzle_g, livePtr, p_member)
  }

  /** RDTextureView.get_swizzle_g */
  final def getSwizzleG(): Long = {
    if (gdext.classes.RDTextureView.mb_get_swizzle_g == null) gdext.classes.RDTextureView.mb_get_swizzle_g = MethodBind.get("RDTextureView", "get_swizzle_g", 4150792614L)
    Ptrcall.call0[Long](gdext.classes.RDTextureView.mb_get_swizzle_g, livePtr)
  }

  /** RDTextureView.set_swizzle_b */
  final def setSwizzleB(p_member: Long): Unit = {
    if (gdext.classes.RDTextureView.mb_set_swizzle_b == null) gdext.classes.RDTextureView.mb_set_swizzle_b = MethodBind.get("RDTextureView", "set_swizzle_b", 3833362581L)
    Ptrcall.callVoid1(gdext.classes.RDTextureView.mb_set_swizzle_b, livePtr, p_member)
  }

  /** RDTextureView.get_swizzle_b */
  final def getSwizzleB(): Long = {
    if (gdext.classes.RDTextureView.mb_get_swizzle_b == null) gdext.classes.RDTextureView.mb_get_swizzle_b = MethodBind.get("RDTextureView", "get_swizzle_b", 4150792614L)
    Ptrcall.call0[Long](gdext.classes.RDTextureView.mb_get_swizzle_b, livePtr)
  }

  /** RDTextureView.set_swizzle_a */
  final def setSwizzleA(p_member: Long): Unit = {
    if (gdext.classes.RDTextureView.mb_set_swizzle_a == null) gdext.classes.RDTextureView.mb_set_swizzle_a = MethodBind.get("RDTextureView", "set_swizzle_a", 3833362581L)
    Ptrcall.callVoid1(gdext.classes.RDTextureView.mb_set_swizzle_a, livePtr, p_member)
  }

  /** RDTextureView.get_swizzle_a */
  final def getSwizzleA(): Long = {
    if (gdext.classes.RDTextureView.mb_get_swizzle_a == null) gdext.classes.RDTextureView.mb_get_swizzle_a = MethodBind.get("RDTextureView", "get_swizzle_a", 4150792614L)
    Ptrcall.call0[Long](gdext.classes.RDTextureView.mb_get_swizzle_a, livePtr)
  }

}

object RDTextureView {
  private[classes] var mb_set_format_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_swizzle_r: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_swizzle_r: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_swizzle_g: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_swizzle_g: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_swizzle_b: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_swizzle_b: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_swizzle_a: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_swizzle_a: GDExtensionMethodBindPtr = null
}
