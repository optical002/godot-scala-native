package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDPipelineRasterizationState`, extends `RefCounted`. */
abstract class RDPipelineRasterizationState extends RefCounted {
  override def godotClassName: String = "RDPipelineRasterizationState"

  /** RDPipelineRasterizationState.set_enable_depth_clamp */
  final def setEnableDepthClamp(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_enable_depth_clamp", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_enable_depth_clamp */
  final def getEnableDepthClamp(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineRasterizationState", "get_enable_depth_clamp", 36873697L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_discard_primitives */
  final def setDiscardPrimitives(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_discard_primitives", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_discard_primitives */
  final def getDiscardPrimitives(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineRasterizationState", "get_discard_primitives", 36873697L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_wireframe */
  final def setWireframe(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_wireframe", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_wireframe */
  final def getWireframe(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineRasterizationState", "get_wireframe", 36873697L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_cull_mode */
  final def setCullMode(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_cull_mode", 2662586502L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_cull_mode */
  final def getCullMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineRasterizationState", "get_cull_mode", 2192484313L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_front_face */
  final def setFrontFace(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_front_face", 2637251213L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_front_face */
  final def getFrontFace(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineRasterizationState", "get_front_face", 708793786L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_depth_bias_enabled */
  final def setDepthBiasEnabled(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_enabled", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_depth_bias_enabled */
  final def getDepthBiasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_enabled", 36873697L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_depth_bias_constant_factor */
  final def setDepthBiasConstantFactor(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_constant_factor", 373806689L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_depth_bias_constant_factor */
  final def getDepthBiasConstantFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_constant_factor", 1740695150L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_depth_bias_clamp */
  final def setDepthBiasClamp(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_clamp", 373806689L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_depth_bias_clamp */
  final def getDepthBiasClamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_clamp", 1740695150L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_depth_bias_slope_factor */
  final def setDepthBiasSlopeFactor(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_slope_factor", 373806689L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_depth_bias_slope_factor */
  final def getDepthBiasSlopeFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_slope_factor", 1740695150L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_line_width */
  final def setLineWidth(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_line_width", 373806689L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_line_width */
  final def getLineWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDPipelineRasterizationState", "get_line_width", 1740695150L), hostObject.objectPtr)

  /** RDPipelineRasterizationState.set_patch_control_points */
  final def setPatchControlPoints(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineRasterizationState", "set_patch_control_points", 1286410249L), hostObject.objectPtr, p_member)

  /** RDPipelineRasterizationState.get_patch_control_points */
  final def getPatchControlPoints(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineRasterizationState", "get_patch_control_points", 3905245786L), hostObject.objectPtr)

}
