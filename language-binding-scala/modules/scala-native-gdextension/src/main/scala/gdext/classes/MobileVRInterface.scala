package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MobileVRInterface`, extends `XRInterface`. */
abstract class MobileVRInterface extends XRInterface {
  override def godotClassName: String = "MobileVRInterface"

  /** MobileVRInterface.set_eye_height */
  final def setEyeHeight(eyeHeight: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_eye_height == null) gdext.classes.MobileVRInterface.mb_set_eye_height = MethodBind.get("MobileVRInterface", "set_eye_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_eye_height, livePtr, eyeHeight)
  }

  /** MobileVRInterface.get_eye_height */
  final def getEyeHeight(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_eye_height == null) gdext.classes.MobileVRInterface.mb_get_eye_height = MethodBind.get("MobileVRInterface", "get_eye_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_eye_height, livePtr)
  }

  /** MobileVRInterface.set_iod */
  final def setIod(iod: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_iod == null) gdext.classes.MobileVRInterface.mb_set_iod = MethodBind.get("MobileVRInterface", "set_iod", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_iod, livePtr, iod)
  }

  /** MobileVRInterface.get_iod */
  final def getIod(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_iod == null) gdext.classes.MobileVRInterface.mb_get_iod = MethodBind.get("MobileVRInterface", "get_iod", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_iod, livePtr)
  }

  /** MobileVRInterface.set_display_width */
  final def setDisplayWidth(displayWidth: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_display_width == null) gdext.classes.MobileVRInterface.mb_set_display_width = MethodBind.get("MobileVRInterface", "set_display_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_display_width, livePtr, displayWidth)
  }

  /** MobileVRInterface.get_display_width */
  final def getDisplayWidth(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_display_width == null) gdext.classes.MobileVRInterface.mb_get_display_width = MethodBind.get("MobileVRInterface", "get_display_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_display_width, livePtr)
  }

  /** MobileVRInterface.set_display_to_lens */
  final def setDisplayToLens(displayToLens: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_display_to_lens == null) gdext.classes.MobileVRInterface.mb_set_display_to_lens = MethodBind.get("MobileVRInterface", "set_display_to_lens", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_display_to_lens, livePtr, displayToLens)
  }

  /** MobileVRInterface.get_display_to_lens */
  final def getDisplayToLens(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_display_to_lens == null) gdext.classes.MobileVRInterface.mb_get_display_to_lens = MethodBind.get("MobileVRInterface", "get_display_to_lens", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_display_to_lens, livePtr)
  }

  /** MobileVRInterface.set_offset_rect */
  final def setOffsetRect(offsetRect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_offset_rect == null) gdext.classes.MobileVRInterface.mb_set_offset_rect = MethodBind.get("MobileVRInterface", "set_offset_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_offset_rect, livePtr, offsetRect)
  }

  /** MobileVRInterface.get_offset_rect */
  final def getOffsetRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.MobileVRInterface.mb_get_offset_rect == null) gdext.classes.MobileVRInterface.mb_get_offset_rect = MethodBind.get("MobileVRInterface", "get_offset_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.MobileVRInterface.mb_get_offset_rect, livePtr)
  }

  /** MobileVRInterface.set_oversample */
  final def setOversample(oversample: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_oversample == null) gdext.classes.MobileVRInterface.mb_set_oversample = MethodBind.get("MobileVRInterface", "set_oversample", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_oversample, livePtr, oversample)
  }

  /** MobileVRInterface.get_oversample */
  final def getOversample(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_oversample == null) gdext.classes.MobileVRInterface.mb_get_oversample = MethodBind.get("MobileVRInterface", "get_oversample", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_oversample, livePtr)
  }

  /** MobileVRInterface.set_k1 */
  final def setK1(k: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_k1 == null) gdext.classes.MobileVRInterface.mb_set_k1 = MethodBind.get("MobileVRInterface", "set_k1", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_k1, livePtr, k)
  }

  /** MobileVRInterface.get_k1 */
  final def getK1(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_k1 == null) gdext.classes.MobileVRInterface.mb_get_k1 = MethodBind.get("MobileVRInterface", "get_k1", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_k1, livePtr)
  }

  /** MobileVRInterface.set_k2 */
  final def setK2(k: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_k2 == null) gdext.classes.MobileVRInterface.mb_set_k2 = MethodBind.get("MobileVRInterface", "set_k2", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_k2, livePtr, k)
  }

  /** MobileVRInterface.get_k2 */
  final def getK2(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_k2 == null) gdext.classes.MobileVRInterface.mb_get_k2 = MethodBind.get("MobileVRInterface", "get_k2", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_k2, livePtr)
  }

  /** MobileVRInterface.get_vrs_min_radius */
  final def getVrsMinRadius(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_vrs_min_radius == null) gdext.classes.MobileVRInterface.mb_get_vrs_min_radius = MethodBind.get("MobileVRInterface", "get_vrs_min_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_vrs_min_radius, livePtr)
  }

  /** MobileVRInterface.set_vrs_min_radius */
  final def setVrsMinRadius(radius: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_vrs_min_radius == null) gdext.classes.MobileVRInterface.mb_set_vrs_min_radius = MethodBind.get("MobileVRInterface", "set_vrs_min_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_vrs_min_radius, livePtr, radius)
  }

  /** MobileVRInterface.get_vrs_strength */
  final def getVrsStrength(): Double = {
    if (gdext.classes.MobileVRInterface.mb_get_vrs_strength == null) gdext.classes.MobileVRInterface.mb_get_vrs_strength = MethodBind.get("MobileVRInterface", "get_vrs_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MobileVRInterface.mb_get_vrs_strength, livePtr)
  }

  /** MobileVRInterface.set_vrs_strength */
  final def setVrsStrength(strength: Double): Unit = {
    if (gdext.classes.MobileVRInterface.mb_set_vrs_strength == null) gdext.classes.MobileVRInterface.mb_set_vrs_strength = MethodBind.get("MobileVRInterface", "set_vrs_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MobileVRInterface.mb_set_vrs_strength, livePtr, strength)
  }

}

object MobileVRInterface {
  private[classes] var mb_set_eye_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_eye_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_iod: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_iod: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_display_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_display_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_display_to_lens: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_display_to_lens: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_oversample: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_oversample: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_k1: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_k1: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_k2: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_k2: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_min_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_min_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_strength: GDExtensionMethodBindPtr = null
}
