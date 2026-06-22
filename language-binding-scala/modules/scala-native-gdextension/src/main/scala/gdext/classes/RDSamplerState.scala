package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDSamplerState`, extends `RefCounted`. */
abstract class RDSamplerState extends RefCounted {

  /** RDSamplerState.set_mag_filter */
  final def setMagFilter(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_mag_filter", 1493420382L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_mag_filter */
  final def getMagFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_mag_filter", 2209202801L), hostObject.objectPtr)

  /** RDSamplerState.set_min_filter */
  final def setMinFilter(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_min_filter", 1493420382L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_min_filter */
  final def getMinFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_min_filter", 2209202801L), hostObject.objectPtr)

  /** RDSamplerState.set_mip_filter */
  final def setMipFilter(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_mip_filter", 1493420382L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_mip_filter */
  final def getMipFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_mip_filter", 2209202801L), hostObject.objectPtr)

  /** RDSamplerState.set_repeat_u */
  final def setRepeatU(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_repeat_u", 246127626L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_repeat_u */
  final def getRepeatU(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_repeat_u", 3227895872L), hostObject.objectPtr)

  /** RDSamplerState.set_repeat_v */
  final def setRepeatV(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_repeat_v", 246127626L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_repeat_v */
  final def getRepeatV(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_repeat_v", 3227895872L), hostObject.objectPtr)

  /** RDSamplerState.set_repeat_w */
  final def setRepeatW(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_repeat_w", 246127626L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_repeat_w */
  final def getRepeatW(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_repeat_w", 3227895872L), hostObject.objectPtr)

  /** RDSamplerState.set_lod_bias */
  final def setLodBias(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_lod_bias", 373806689L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_lod_bias */
  final def getLodBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDSamplerState", "get_lod_bias", 1740695150L), hostObject.objectPtr)

  /** RDSamplerState.set_use_anisotropy */
  final def setUseAnisotropy(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_use_anisotropy", 2586408642L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_use_anisotropy */
  final def getUseAnisotropy(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDSamplerState", "get_use_anisotropy", 36873697L), hostObject.objectPtr)

  /** RDSamplerState.set_anisotropy_max */
  final def setAnisotropyMax(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_anisotropy_max", 373806689L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_anisotropy_max */
  final def getAnisotropyMax(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDSamplerState", "get_anisotropy_max", 1740695150L), hostObject.objectPtr)

  /** RDSamplerState.set_enable_compare */
  final def setEnableCompare(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_enable_compare", 2586408642L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_enable_compare */
  final def getEnableCompare(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDSamplerState", "get_enable_compare", 36873697L), hostObject.objectPtr)

  /** RDSamplerState.set_compare_op */
  final def setCompareOp(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_compare_op", 2573711505L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_compare_op */
  final def getCompareOp(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_compare_op", 269730778L), hostObject.objectPtr)

  /** RDSamplerState.set_min_lod */
  final def setMinLod(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_min_lod", 373806689L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_min_lod */
  final def getMinLod(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDSamplerState", "get_min_lod", 1740695150L), hostObject.objectPtr)

  /** RDSamplerState.set_max_lod */
  final def setMaxLod(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_max_lod", 373806689L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_max_lod */
  final def getMaxLod(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDSamplerState", "get_max_lod", 1740695150L), hostObject.objectPtr)

  /** RDSamplerState.set_border_color */
  final def setBorderColor(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_border_color", 1115869595L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_border_color */
  final def getBorderColor(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDSamplerState", "get_border_color", 3514246478L), hostObject.objectPtr)

  /** RDSamplerState.set_unnormalized_uvw */
  final def setUnnormalizedUvw(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDSamplerState", "set_unnormalized_uvw", 2586408642L), hostObject.objectPtr, p_member)

  /** RDSamplerState.get_unnormalized_uvw */
  final def getUnnormalizedUvw(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDSamplerState", "get_unnormalized_uvw", 36873697L), hostObject.objectPtr)

}

object RDSamplerState {
  /** Class metadata for Gd[RDSamplerState] lifetime management and casting. */
  given GodotClass[RDSamplerState] with {
    def className = "RDSamplerState"
    def isRefCounted = true
    def wrap(o: GodotObject): RDSamplerState = new RDSamplerState {}.withHost(o.objectPtr)
    def unwrap(t: RDSamplerState): GodotObject = t.hostObject
  }
}
