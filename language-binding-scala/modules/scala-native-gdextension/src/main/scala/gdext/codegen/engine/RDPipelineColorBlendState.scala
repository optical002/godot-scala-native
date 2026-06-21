package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDPipelineColorBlendState`, extends `RefCounted`. */
abstract class RDPipelineColorBlendState extends RefCounted {

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

object RDPipelineColorBlendState {
  /** Class metadata for Gd[RDPipelineColorBlendState] lifetime management and casting. */
  given GodotClass[RDPipelineColorBlendState] with {
    def className = "RDPipelineColorBlendState"
    def isRefCounted = true
    def wrap(o: GodotObject): RDPipelineColorBlendState = new RDPipelineColorBlendState {}.withHost(o.objectPtr)
    def unwrap(t: RDPipelineColorBlendState): GodotObject = t.hostObject
  }
}
