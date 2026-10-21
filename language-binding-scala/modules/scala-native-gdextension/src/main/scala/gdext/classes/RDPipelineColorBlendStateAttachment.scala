package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDPipelineColorBlendStateAttachment`, extends `RefCounted`. */
abstract class RDPipelineColorBlendStateAttachment extends RefCounted {
  override def godotClassName: String = "RDPipelineColorBlendStateAttachment"

  /** RDPipelineColorBlendStateAttachment.set_as_mix */
  final def setAsMix(): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_as_mix == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_as_mix = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_as_mix", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_as_mix, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_enable_blend */
  final def setEnableBlend(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_enable_blend == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_enable_blend = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_enable_blend", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_enable_blend, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_enable_blend */
  final def getEnableBlend(): Boolean = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_enable_blend == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_enable_blend = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_enable_blend", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_enable_blend, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_src_color_blend_factor */
  final def setSrcColorBlendFactor(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_src_color_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_src_color_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_src_color_blend_factor", 2251019273L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_src_color_blend_factor, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_src_color_blend_factor */
  final def getSrcColorBlendFactor(): Long = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_src_color_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_src_color_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_src_color_blend_factor", 3691288359L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_src_color_blend_factor, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_dst_color_blend_factor */
  final def setDstColorBlendFactor(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_dst_color_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_dst_color_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_dst_color_blend_factor", 2251019273L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_dst_color_blend_factor, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_dst_color_blend_factor */
  final def getDstColorBlendFactor(): Long = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_dst_color_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_dst_color_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_dst_color_blend_factor", 3691288359L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_dst_color_blend_factor, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_color_blend_op */
  final def setColorBlendOp(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_color_blend_op == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_color_blend_op = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_color_blend_op", 3073022720L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_color_blend_op, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_color_blend_op */
  final def getColorBlendOp(): Long = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_color_blend_op == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_color_blend_op = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_color_blend_op", 1385093561L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_color_blend_op, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_src_alpha_blend_factor */
  final def setSrcAlphaBlendFactor(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_src_alpha_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_src_alpha_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_src_alpha_blend_factor", 2251019273L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_src_alpha_blend_factor, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_src_alpha_blend_factor */
  final def getSrcAlphaBlendFactor(): Long = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_src_alpha_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_src_alpha_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_src_alpha_blend_factor", 3691288359L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_src_alpha_blend_factor, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_dst_alpha_blend_factor */
  final def setDstAlphaBlendFactor(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_dst_alpha_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_dst_alpha_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_dst_alpha_blend_factor", 2251019273L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_dst_alpha_blend_factor, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_dst_alpha_blend_factor */
  final def getDstAlphaBlendFactor(): Long = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_dst_alpha_blend_factor == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_dst_alpha_blend_factor = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_dst_alpha_blend_factor", 3691288359L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_dst_alpha_blend_factor, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_alpha_blend_op */
  final def setAlphaBlendOp(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_alpha_blend_op == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_alpha_blend_op = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_alpha_blend_op", 3073022720L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_alpha_blend_op, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_alpha_blend_op */
  final def getAlphaBlendOp(): Long = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_alpha_blend_op == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_alpha_blend_op = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_alpha_blend_op", 1385093561L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_alpha_blend_op, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_write_r */
  final def setWriteR(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_r == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_r = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_r", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_r, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_write_r */
  final def getWriteR(): Boolean = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_r == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_r = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_r", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_r, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_write_g */
  final def setWriteG(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_g == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_g = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_g", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_g, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_write_g */
  final def getWriteG(): Boolean = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_g == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_g = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_g", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_g, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_write_b */
  final def setWriteB(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_b == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_b = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_b", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_b, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_write_b */
  final def getWriteB(): Boolean = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_b == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_b = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_b", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_b, livePtr)
  }

  /** RDPipelineColorBlendStateAttachment.set_write_a */
  final def setWriteA(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_a == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_a = MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_a", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendStateAttachment.mb_set_write_a, livePtr, p_member)
  }

  /** RDPipelineColorBlendStateAttachment.get_write_a */
  final def getWriteA(): Boolean = {
    if (gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_a == null) gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_a = MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_a", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineColorBlendStateAttachment.mb_get_write_a, livePtr)
  }

}

object RDPipelineColorBlendStateAttachment {
  private[classes] var mb_set_as_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_src_color_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_src_color_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dst_color_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dst_color_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_blend_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_blend_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_src_alpha_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_src_alpha_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dst_alpha_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dst_alpha_blend_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_blend_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_blend_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_write_r: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_write_r: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_write_g: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_write_g: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_write_b: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_write_b: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_write_a: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_write_a: GDExtensionMethodBindPtr = null
}
