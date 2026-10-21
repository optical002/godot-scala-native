package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDSamplerState`, extends `RefCounted`. */
abstract class RDSamplerState extends RefCounted {
  override def godotClassName: String = "RDSamplerState"

  /** RDSamplerState.set_mag_filter */
  final def setMagFilter(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_mag_filter == null) gdext.classes.RDSamplerState.mb_set_mag_filter = MethodBind.get("RDSamplerState", "set_mag_filter", 1493420382L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_mag_filter, livePtr, p_member)
  }

  /** RDSamplerState.get_mag_filter */
  final def getMagFilter(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_mag_filter == null) gdext.classes.RDSamplerState.mb_get_mag_filter = MethodBind.get("RDSamplerState", "get_mag_filter", 2209202801L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_mag_filter, livePtr)
  }

  /** RDSamplerState.set_min_filter */
  final def setMinFilter(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_min_filter == null) gdext.classes.RDSamplerState.mb_set_min_filter = MethodBind.get("RDSamplerState", "set_min_filter", 1493420382L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_min_filter, livePtr, p_member)
  }

  /** RDSamplerState.get_min_filter */
  final def getMinFilter(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_min_filter == null) gdext.classes.RDSamplerState.mb_get_min_filter = MethodBind.get("RDSamplerState", "get_min_filter", 2209202801L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_min_filter, livePtr)
  }

  /** RDSamplerState.set_mip_filter */
  final def setMipFilter(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_mip_filter == null) gdext.classes.RDSamplerState.mb_set_mip_filter = MethodBind.get("RDSamplerState", "set_mip_filter", 1493420382L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_mip_filter, livePtr, p_member)
  }

  /** RDSamplerState.get_mip_filter */
  final def getMipFilter(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_mip_filter == null) gdext.classes.RDSamplerState.mb_get_mip_filter = MethodBind.get("RDSamplerState", "get_mip_filter", 2209202801L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_mip_filter, livePtr)
  }

  /** RDSamplerState.set_repeat_u */
  final def setRepeatU(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_repeat_u == null) gdext.classes.RDSamplerState.mb_set_repeat_u = MethodBind.get("RDSamplerState", "set_repeat_u", 246127626L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_repeat_u, livePtr, p_member)
  }

  /** RDSamplerState.get_repeat_u */
  final def getRepeatU(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_repeat_u == null) gdext.classes.RDSamplerState.mb_get_repeat_u = MethodBind.get("RDSamplerState", "get_repeat_u", 3227895872L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_repeat_u, livePtr)
  }

  /** RDSamplerState.set_repeat_v */
  final def setRepeatV(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_repeat_v == null) gdext.classes.RDSamplerState.mb_set_repeat_v = MethodBind.get("RDSamplerState", "set_repeat_v", 246127626L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_repeat_v, livePtr, p_member)
  }

  /** RDSamplerState.get_repeat_v */
  final def getRepeatV(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_repeat_v == null) gdext.classes.RDSamplerState.mb_get_repeat_v = MethodBind.get("RDSamplerState", "get_repeat_v", 3227895872L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_repeat_v, livePtr)
  }

  /** RDSamplerState.set_repeat_w */
  final def setRepeatW(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_repeat_w == null) gdext.classes.RDSamplerState.mb_set_repeat_w = MethodBind.get("RDSamplerState", "set_repeat_w", 246127626L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_repeat_w, livePtr, p_member)
  }

  /** RDSamplerState.get_repeat_w */
  final def getRepeatW(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_repeat_w == null) gdext.classes.RDSamplerState.mb_get_repeat_w = MethodBind.get("RDSamplerState", "get_repeat_w", 3227895872L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_repeat_w, livePtr)
  }

  /** RDSamplerState.set_lod_bias */
  final def setLodBias(p_member: Double): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_lod_bias == null) gdext.classes.RDSamplerState.mb_set_lod_bias = MethodBind.get("RDSamplerState", "set_lod_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_lod_bias, livePtr, p_member)
  }

  /** RDSamplerState.get_lod_bias */
  final def getLodBias(): Double = {
    if (gdext.classes.RDSamplerState.mb_get_lod_bias == null) gdext.classes.RDSamplerState.mb_get_lod_bias = MethodBind.get("RDSamplerState", "get_lod_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDSamplerState.mb_get_lod_bias, livePtr)
  }

  /** RDSamplerState.set_use_anisotropy */
  final def setUseAnisotropy(p_member: Boolean): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_use_anisotropy == null) gdext.classes.RDSamplerState.mb_set_use_anisotropy = MethodBind.get("RDSamplerState", "set_use_anisotropy", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_use_anisotropy, livePtr, p_member)
  }

  /** RDSamplerState.get_use_anisotropy */
  final def getUseAnisotropy(): Boolean = {
    if (gdext.classes.RDSamplerState.mb_get_use_anisotropy == null) gdext.classes.RDSamplerState.mb_get_use_anisotropy = MethodBind.get("RDSamplerState", "get_use_anisotropy", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDSamplerState.mb_get_use_anisotropy, livePtr)
  }

  /** RDSamplerState.set_anisotropy_max */
  final def setAnisotropyMax(p_member: Double): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_anisotropy_max == null) gdext.classes.RDSamplerState.mb_set_anisotropy_max = MethodBind.get("RDSamplerState", "set_anisotropy_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_anisotropy_max, livePtr, p_member)
  }

  /** RDSamplerState.get_anisotropy_max */
  final def getAnisotropyMax(): Double = {
    if (gdext.classes.RDSamplerState.mb_get_anisotropy_max == null) gdext.classes.RDSamplerState.mb_get_anisotropy_max = MethodBind.get("RDSamplerState", "get_anisotropy_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDSamplerState.mb_get_anisotropy_max, livePtr)
  }

  /** RDSamplerState.set_enable_compare */
  final def setEnableCompare(p_member: Boolean): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_enable_compare == null) gdext.classes.RDSamplerState.mb_set_enable_compare = MethodBind.get("RDSamplerState", "set_enable_compare", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_enable_compare, livePtr, p_member)
  }

  /** RDSamplerState.get_enable_compare */
  final def getEnableCompare(): Boolean = {
    if (gdext.classes.RDSamplerState.mb_get_enable_compare == null) gdext.classes.RDSamplerState.mb_get_enable_compare = MethodBind.get("RDSamplerState", "get_enable_compare", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDSamplerState.mb_get_enable_compare, livePtr)
  }

  /** RDSamplerState.set_compare_op */
  final def setCompareOp(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_compare_op == null) gdext.classes.RDSamplerState.mb_set_compare_op = MethodBind.get("RDSamplerState", "set_compare_op", 2573711505L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_compare_op, livePtr, p_member)
  }

  /** RDSamplerState.get_compare_op */
  final def getCompareOp(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_compare_op == null) gdext.classes.RDSamplerState.mb_get_compare_op = MethodBind.get("RDSamplerState", "get_compare_op", 269730778L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_compare_op, livePtr)
  }

  /** RDSamplerState.set_min_lod */
  final def setMinLod(p_member: Double): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_min_lod == null) gdext.classes.RDSamplerState.mb_set_min_lod = MethodBind.get("RDSamplerState", "set_min_lod", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_min_lod, livePtr, p_member)
  }

  /** RDSamplerState.get_min_lod */
  final def getMinLod(): Double = {
    if (gdext.classes.RDSamplerState.mb_get_min_lod == null) gdext.classes.RDSamplerState.mb_get_min_lod = MethodBind.get("RDSamplerState", "get_min_lod", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDSamplerState.mb_get_min_lod, livePtr)
  }

  /** RDSamplerState.set_max_lod */
  final def setMaxLod(p_member: Double): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_max_lod == null) gdext.classes.RDSamplerState.mb_set_max_lod = MethodBind.get("RDSamplerState", "set_max_lod", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_max_lod, livePtr, p_member)
  }

  /** RDSamplerState.get_max_lod */
  final def getMaxLod(): Double = {
    if (gdext.classes.RDSamplerState.mb_get_max_lod == null) gdext.classes.RDSamplerState.mb_get_max_lod = MethodBind.get("RDSamplerState", "get_max_lod", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDSamplerState.mb_get_max_lod, livePtr)
  }

  /** RDSamplerState.set_border_color */
  final def setBorderColor(p_member: Long): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_border_color == null) gdext.classes.RDSamplerState.mb_set_border_color = MethodBind.get("RDSamplerState", "set_border_color", 1115869595L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_border_color, livePtr, p_member)
  }

  /** RDSamplerState.get_border_color */
  final def getBorderColor(): Long = {
    if (gdext.classes.RDSamplerState.mb_get_border_color == null) gdext.classes.RDSamplerState.mb_get_border_color = MethodBind.get("RDSamplerState", "get_border_color", 3514246478L)
    Ptrcall.call0[Long](gdext.classes.RDSamplerState.mb_get_border_color, livePtr)
  }

  /** RDSamplerState.set_unnormalized_uvw */
  final def setUnnormalizedUvw(p_member: Boolean): Unit = {
    if (gdext.classes.RDSamplerState.mb_set_unnormalized_uvw == null) gdext.classes.RDSamplerState.mb_set_unnormalized_uvw = MethodBind.get("RDSamplerState", "set_unnormalized_uvw", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDSamplerState.mb_set_unnormalized_uvw, livePtr, p_member)
  }

  /** RDSamplerState.get_unnormalized_uvw */
  final def getUnnormalizedUvw(): Boolean = {
    if (gdext.classes.RDSamplerState.mb_get_unnormalized_uvw == null) gdext.classes.RDSamplerState.mb_get_unnormalized_uvw = MethodBind.get("RDSamplerState", "get_unnormalized_uvw", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDSamplerState.mb_get_unnormalized_uvw, livePtr)
  }

}

object RDSamplerState {
  private[classes] var mb_set_mag_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mag_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mip_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mip_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_repeat_u: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_repeat_u: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_repeat_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_repeat_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_repeat_w: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_repeat_w: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lod_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lod_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anisotropy_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_anisotropy_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_compare_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_compare_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_lod: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_lod: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_lod: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_lod: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_unnormalized_uvw: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unnormalized_uvw: GDExtensionMethodBindPtr = null
}
