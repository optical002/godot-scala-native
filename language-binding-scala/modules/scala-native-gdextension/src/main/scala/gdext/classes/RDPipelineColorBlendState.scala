package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDPipelineColorBlendState`, extends `RefCounted`. */
abstract class RDPipelineColorBlendState extends RefCounted {
  override def godotClassName: String = "RDPipelineColorBlendState"

  /** RDPipelineColorBlendState.set_enable_logic_op */
  final def setEnableLogicOp(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineColorBlendState.mb_set_enable_logic_op == null) gdext.classes.RDPipelineColorBlendState.mb_set_enable_logic_op = MethodBind.get("RDPipelineColorBlendState", "set_enable_logic_op", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendState.mb_set_enable_logic_op, livePtr, pMember)
  }

  /** RDPipelineColorBlendState.get_enable_logic_op */
  final def getEnableLogicOp(): Boolean = {
    if (gdext.classes.RDPipelineColorBlendState.mb_get_enable_logic_op == null) gdext.classes.RDPipelineColorBlendState.mb_get_enable_logic_op = MethodBind.get("RDPipelineColorBlendState", "get_enable_logic_op", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineColorBlendState.mb_get_enable_logic_op, livePtr)
  }

  /** RDPipelineColorBlendState.set_logic_op */
  final def setLogicOp(pMember: gdext.classes.RenderingDevice.LogicOperation): Unit = {
    if (gdext.classes.RDPipelineColorBlendState.mb_set_logic_op == null) gdext.classes.RDPipelineColorBlendState.mb_set_logic_op = MethodBind.get("RDPipelineColorBlendState", "set_logic_op", 3610841058L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendState.mb_set_logic_op, livePtr, pMember)
  }

  /** RDPipelineColorBlendState.get_logic_op */
  final def getLogicOp(): gdext.classes.RenderingDevice.LogicOperation = {
    if (gdext.classes.RDPipelineColorBlendState.mb_get_logic_op == null) gdext.classes.RDPipelineColorBlendState.mb_get_logic_op = MethodBind.get("RDPipelineColorBlendState", "get_logic_op", 988254690L)
    gdext.classes.RenderingDevice.LogicOperation(Ptrcall.call0[Long](gdext.classes.RDPipelineColorBlendState.mb_get_logic_op, livePtr))
  }

  /** RDPipelineColorBlendState.set_blend_constant */
  final def setBlendConstant(pMember: gdext.builtin.Color): Unit = {
    if (gdext.classes.RDPipelineColorBlendState.mb_set_blend_constant == null) gdext.classes.RDPipelineColorBlendState.mb_set_blend_constant = MethodBind.get("RDPipelineColorBlendState", "set_blend_constant", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineColorBlendState.mb_set_blend_constant, livePtr, pMember)
  }

  /** RDPipelineColorBlendState.get_blend_constant */
  final def getBlendConstant(): gdext.builtin.Color = {
    if (gdext.classes.RDPipelineColorBlendState.mb_get_blend_constant == null) gdext.classes.RDPipelineColorBlendState.mb_get_blend_constant = MethodBind.get("RDPipelineColorBlendState", "get_blend_constant", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.RDPipelineColorBlendState.mb_get_blend_constant, livePtr)
  }

}

object RDPipelineColorBlendState {
  private[classes] var mb_set_enable_logic_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_logic_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_logic_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_logic_op: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_constant: GDExtensionMethodBindPtr = null
}
