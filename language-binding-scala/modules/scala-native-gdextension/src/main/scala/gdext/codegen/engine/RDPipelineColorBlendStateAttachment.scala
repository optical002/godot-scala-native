package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDPipelineColorBlendStateAttachment`, extends `RefCounted`. */
abstract class RDPipelineColorBlendStateAttachment extends RefCounted {

  /** RDPipelineColorBlendStateAttachment.set_as_mix */
  final def setAsMix(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_as_mix", 3218959716L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_enable_blend */
  final def setEnableBlend(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_enable_blend", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_enable_blend */
  final def getEnableBlend(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_enable_blend", 36873697L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_src_color_blend_factor */
  final def setSrcColorBlendFactor(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_src_color_blend_factor", 2251019273L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_src_color_blend_factor */
  final def getSrcColorBlendFactor(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_src_color_blend_factor", 3691288359L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_dst_color_blend_factor */
  final def setDstColorBlendFactor(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_dst_color_blend_factor", 2251019273L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_dst_color_blend_factor */
  final def getDstColorBlendFactor(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_dst_color_blend_factor", 3691288359L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_color_blend_op */
  final def setColorBlendOp(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_color_blend_op", 3073022720L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_color_blend_op */
  final def getColorBlendOp(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_color_blend_op", 1385093561L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_src_alpha_blend_factor */
  final def setSrcAlphaBlendFactor(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_src_alpha_blend_factor", 2251019273L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_src_alpha_blend_factor */
  final def getSrcAlphaBlendFactor(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_src_alpha_blend_factor", 3691288359L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_dst_alpha_blend_factor */
  final def setDstAlphaBlendFactor(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_dst_alpha_blend_factor", 2251019273L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_dst_alpha_blend_factor */
  final def getDstAlphaBlendFactor(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_dst_alpha_blend_factor", 3691288359L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_alpha_blend_op */
  final def setAlphaBlendOp(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_alpha_blend_op", 3073022720L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_alpha_blend_op */
  final def getAlphaBlendOp(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_alpha_blend_op", 1385093561L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_write_r */
  final def setWriteR(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_r", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_write_r */
  final def getWriteR(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_r", 36873697L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_write_g */
  final def setWriteG(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_g", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_write_g */
  final def getWriteG(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_g", 36873697L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_write_b */
  final def setWriteB(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_b", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_write_b */
  final def getWriteB(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_b", 36873697L), hostObject.objectPtr)

  /** RDPipelineColorBlendStateAttachment.set_write_a */
  final def setWriteA(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendStateAttachment", "set_write_a", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendStateAttachment.get_write_a */
  final def getWriteA(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineColorBlendStateAttachment", "get_write_a", 36873697L), hostObject.objectPtr)

}

object RDPipelineColorBlendStateAttachment {
  /** Class metadata for Gd[RDPipelineColorBlendStateAttachment] lifetime management and casting. */
  given GodotClass[RDPipelineColorBlendStateAttachment] with {
    def className = "RDPipelineColorBlendStateAttachment"
    def isRefCounted = true
    def wrap(o: GodotObject): RDPipelineColorBlendStateAttachment = new RDPipelineColorBlendStateAttachment {}.withHost(o.objectPtr)
    def unwrap(t: RDPipelineColorBlendStateAttachment): GodotObject = t.hostObject
  }
}
