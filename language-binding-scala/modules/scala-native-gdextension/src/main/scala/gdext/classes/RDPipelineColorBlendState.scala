package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDPipelineColorBlendState`, extends `RefCounted`. */
abstract class RDPipelineColorBlendState extends RefCounted {
  override def godotClassName: String = "RDPipelineColorBlendState"

  /** RDPipelineColorBlendState.set_enable_logic_op */
  final def setEnableLogicOp(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendState", "set_enable_logic_op", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendState.get_enable_logic_op */
  final def getEnableLogicOp(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineColorBlendState", "get_enable_logic_op", 36873697L), hostObject.objectPtr)

  /** RDPipelineColorBlendState.set_logic_op */
  final def setLogicOp(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendState", "set_logic_op", 3610841058L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendState.get_logic_op */
  final def getLogicOp(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineColorBlendState", "get_logic_op", 988254690L), hostObject.objectPtr)

  /** RDPipelineColorBlendState.set_blend_constant */
  final def setBlendConstant(p_member: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineColorBlendState", "set_blend_constant", 2920490490L), hostObject.objectPtr, p_member)

  /** RDPipelineColorBlendState.get_blend_constant */
  final def getBlendConstant(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("RDPipelineColorBlendState", "get_blend_constant", 3444240500L), hostObject.objectPtr)

}
