package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDPipelineRasterizationState`, extends `RefCounted`. */
abstract class RDPipelineRasterizationState extends RefCounted {
  override def godotClassName: String = "RDPipelineRasterizationState"

  /** RDPipelineRasterizationState.set_enable_depth_clamp */
  final def setEnableDepthClamp(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_enable_depth_clamp == null) gdext.classes.RDPipelineRasterizationState.mb_set_enable_depth_clamp = MethodBind.get("RDPipelineRasterizationState", "set_enable_depth_clamp", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_enable_depth_clamp, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_enable_depth_clamp */
  final def getEnableDepthClamp(): Boolean = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_enable_depth_clamp == null) gdext.classes.RDPipelineRasterizationState.mb_get_enable_depth_clamp = MethodBind.get("RDPipelineRasterizationState", "get_enable_depth_clamp", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineRasterizationState.mb_get_enable_depth_clamp, livePtr)
  }

  /** RDPipelineRasterizationState.set_discard_primitives */
  final def setDiscardPrimitives(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_discard_primitives == null) gdext.classes.RDPipelineRasterizationState.mb_set_discard_primitives = MethodBind.get("RDPipelineRasterizationState", "set_discard_primitives", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_discard_primitives, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_discard_primitives */
  final def getDiscardPrimitives(): Boolean = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_discard_primitives == null) gdext.classes.RDPipelineRasterizationState.mb_get_discard_primitives = MethodBind.get("RDPipelineRasterizationState", "get_discard_primitives", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineRasterizationState.mb_get_discard_primitives, livePtr)
  }

  /** RDPipelineRasterizationState.set_wireframe */
  final def setWireframe(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_wireframe == null) gdext.classes.RDPipelineRasterizationState.mb_set_wireframe = MethodBind.get("RDPipelineRasterizationState", "set_wireframe", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_wireframe, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_wireframe */
  final def getWireframe(): Boolean = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_wireframe == null) gdext.classes.RDPipelineRasterizationState.mb_get_wireframe = MethodBind.get("RDPipelineRasterizationState", "get_wireframe", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineRasterizationState.mb_get_wireframe, livePtr)
  }

  /** RDPipelineRasterizationState.set_cull_mode */
  final def setCullMode(pMember: gdext.classes.RenderingDevice.PolygonCullMode): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_cull_mode == null) gdext.classes.RDPipelineRasterizationState.mb_set_cull_mode = MethodBind.get("RDPipelineRasterizationState", "set_cull_mode", 2662586502L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_cull_mode, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_cull_mode */
  final def getCullMode(): gdext.classes.RenderingDevice.PolygonCullMode = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_cull_mode == null) gdext.classes.RDPipelineRasterizationState.mb_get_cull_mode = MethodBind.get("RDPipelineRasterizationState", "get_cull_mode", 2192484313L)
    gdext.classes.RenderingDevice.PolygonCullMode(Ptrcall.call0[Long](gdext.classes.RDPipelineRasterizationState.mb_get_cull_mode, livePtr))
  }

  /** RDPipelineRasterizationState.set_front_face */
  final def setFrontFace(pMember: gdext.classes.RenderingDevice.PolygonFrontFace): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_front_face == null) gdext.classes.RDPipelineRasterizationState.mb_set_front_face = MethodBind.get("RDPipelineRasterizationState", "set_front_face", 2637251213L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_front_face, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_front_face */
  final def getFrontFace(): gdext.classes.RenderingDevice.PolygonFrontFace = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_front_face == null) gdext.classes.RDPipelineRasterizationState.mb_get_front_face = MethodBind.get("RDPipelineRasterizationState", "get_front_face", 708793786L)
    gdext.classes.RenderingDevice.PolygonFrontFace(Ptrcall.call0[Long](gdext.classes.RDPipelineRasterizationState.mb_get_front_face, livePtr))
  }

  /** RDPipelineRasterizationState.set_depth_bias_enabled */
  final def setDepthBiasEnabled(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_enabled == null) gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_enabled = MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_enabled, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_depth_bias_enabled */
  final def getDepthBiasEnabled(): Boolean = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_enabled == null) gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_enabled = MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_enabled, livePtr)
  }

  /** RDPipelineRasterizationState.set_depth_bias_constant_factor */
  final def setDepthBiasConstantFactor(pMember: Double): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_constant_factor == null) gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_constant_factor = MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_constant_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_constant_factor, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_depth_bias_constant_factor */
  final def getDepthBiasConstantFactor(): Double = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_constant_factor == null) gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_constant_factor = MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_constant_factor", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_constant_factor, livePtr)
  }

  /** RDPipelineRasterizationState.set_depth_bias_clamp */
  final def setDepthBiasClamp(pMember: Double): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_clamp == null) gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_clamp = MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_clamp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_clamp, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_depth_bias_clamp */
  final def getDepthBiasClamp(): Double = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_clamp == null) gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_clamp = MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_clamp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_clamp, livePtr)
  }

  /** RDPipelineRasterizationState.set_depth_bias_slope_factor */
  final def setDepthBiasSlopeFactor(pMember: Double): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_slope_factor == null) gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_slope_factor = MethodBind.get("RDPipelineRasterizationState", "set_depth_bias_slope_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_depth_bias_slope_factor, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_depth_bias_slope_factor */
  final def getDepthBiasSlopeFactor(): Double = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_slope_factor == null) gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_slope_factor = MethodBind.get("RDPipelineRasterizationState", "get_depth_bias_slope_factor", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineRasterizationState.mb_get_depth_bias_slope_factor, livePtr)
  }

  /** RDPipelineRasterizationState.set_line_width */
  final def setLineWidth(pMember: Double): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_line_width == null) gdext.classes.RDPipelineRasterizationState.mb_set_line_width = MethodBind.get("RDPipelineRasterizationState", "set_line_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_line_width, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_line_width */
  final def getLineWidth(): Double = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_line_width == null) gdext.classes.RDPipelineRasterizationState.mb_get_line_width = MethodBind.get("RDPipelineRasterizationState", "get_line_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineRasterizationState.mb_get_line_width, livePtr)
  }

  /** RDPipelineRasterizationState.set_patch_control_points */
  final def setPatchControlPoints(pMember: Long): Unit = {
    if (gdext.classes.RDPipelineRasterizationState.mb_set_patch_control_points == null) gdext.classes.RDPipelineRasterizationState.mb_set_patch_control_points = MethodBind.get("RDPipelineRasterizationState", "set_patch_control_points", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineRasterizationState.mb_set_patch_control_points, livePtr, pMember)
  }

  /** RDPipelineRasterizationState.get_patch_control_points */
  final def getPatchControlPoints(): Long = {
    if (gdext.classes.RDPipelineRasterizationState.mb_get_patch_control_points == null) gdext.classes.RDPipelineRasterizationState.mb_get_patch_control_points = MethodBind.get("RDPipelineRasterizationState", "get_patch_control_points", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineRasterizationState.mb_get_patch_control_points, livePtr)
  }

}

object RDPipelineRasterizationState {
  private[classes] var mb_set_enable_depth_clamp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_depth_clamp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_discard_primitives: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_discard_primitives: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wireframe: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wireframe: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_face: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_face: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_bias_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_bias_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_bias_constant_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_bias_constant_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_bias_clamp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_bias_clamp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_bias_slope_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_bias_slope_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_patch_control_points: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_patch_control_points: GDExtensionMethodBindPtr = null
}
