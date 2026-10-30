package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDPipelineMultisampleState`, extends `RefCounted`. */
abstract class RDPipelineMultisampleState extends RefCounted {
  override def godotClassName: String = "RDPipelineMultisampleState"

  /** RDPipelineMultisampleState.set_sample_count */
  final def setSampleCount(pMember: gdext.classes.RenderingDevice.TextureSamples): Unit = {
    if (gdext.classes.RDPipelineMultisampleState.mb_set_sample_count == null) gdext.classes.RDPipelineMultisampleState.mb_set_sample_count = MethodBind.get("RDPipelineMultisampleState", "set_sample_count", 3774171498L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineMultisampleState.mb_set_sample_count, livePtr, pMember)
  }

  /** RDPipelineMultisampleState.get_sample_count */
  final def getSampleCount(): gdext.classes.RenderingDevice.TextureSamples = {
    if (gdext.classes.RDPipelineMultisampleState.mb_get_sample_count == null) gdext.classes.RDPipelineMultisampleState.mb_get_sample_count = MethodBind.get("RDPipelineMultisampleState", "get_sample_count", 407791724L)
    gdext.classes.RenderingDevice.TextureSamples(Ptrcall.call0[Long](gdext.classes.RDPipelineMultisampleState.mb_get_sample_count, livePtr))
  }

  /** RDPipelineMultisampleState.set_enable_sample_shading */
  final def setEnableSampleShading(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineMultisampleState.mb_set_enable_sample_shading == null) gdext.classes.RDPipelineMultisampleState.mb_set_enable_sample_shading = MethodBind.get("RDPipelineMultisampleState", "set_enable_sample_shading", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineMultisampleState.mb_set_enable_sample_shading, livePtr, pMember)
  }

  /** RDPipelineMultisampleState.get_enable_sample_shading */
  final def getEnableSampleShading(): Boolean = {
    if (gdext.classes.RDPipelineMultisampleState.mb_get_enable_sample_shading == null) gdext.classes.RDPipelineMultisampleState.mb_get_enable_sample_shading = MethodBind.get("RDPipelineMultisampleState", "get_enable_sample_shading", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineMultisampleState.mb_get_enable_sample_shading, livePtr)
  }

  /** RDPipelineMultisampleState.set_min_sample_shading */
  final def setMinSampleShading(pMember: Double): Unit = {
    if (gdext.classes.RDPipelineMultisampleState.mb_set_min_sample_shading == null) gdext.classes.RDPipelineMultisampleState.mb_set_min_sample_shading = MethodBind.get("RDPipelineMultisampleState", "set_min_sample_shading", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineMultisampleState.mb_set_min_sample_shading, livePtr, pMember)
  }

  /** RDPipelineMultisampleState.get_min_sample_shading */
  final def getMinSampleShading(): Double = {
    if (gdext.classes.RDPipelineMultisampleState.mb_get_min_sample_shading == null) gdext.classes.RDPipelineMultisampleState.mb_get_min_sample_shading = MethodBind.get("RDPipelineMultisampleState", "get_min_sample_shading", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineMultisampleState.mb_get_min_sample_shading, livePtr)
  }

  /** RDPipelineMultisampleState.set_enable_alpha_to_coverage */
  final def setEnableAlphaToCoverage(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineMultisampleState.mb_set_enable_alpha_to_coverage == null) gdext.classes.RDPipelineMultisampleState.mb_set_enable_alpha_to_coverage = MethodBind.get("RDPipelineMultisampleState", "set_enable_alpha_to_coverage", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineMultisampleState.mb_set_enable_alpha_to_coverage, livePtr, pMember)
  }

  /** RDPipelineMultisampleState.get_enable_alpha_to_coverage */
  final def getEnableAlphaToCoverage(): Boolean = {
    if (gdext.classes.RDPipelineMultisampleState.mb_get_enable_alpha_to_coverage == null) gdext.classes.RDPipelineMultisampleState.mb_get_enable_alpha_to_coverage = MethodBind.get("RDPipelineMultisampleState", "get_enable_alpha_to_coverage", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineMultisampleState.mb_get_enable_alpha_to_coverage, livePtr)
  }

  /** RDPipelineMultisampleState.set_enable_alpha_to_one */
  final def setEnableAlphaToOne(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineMultisampleState.mb_set_enable_alpha_to_one == null) gdext.classes.RDPipelineMultisampleState.mb_set_enable_alpha_to_one = MethodBind.get("RDPipelineMultisampleState", "set_enable_alpha_to_one", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineMultisampleState.mb_set_enable_alpha_to_one, livePtr, pMember)
  }

  /** RDPipelineMultisampleState.get_enable_alpha_to_one */
  final def getEnableAlphaToOne(): Boolean = {
    if (gdext.classes.RDPipelineMultisampleState.mb_get_enable_alpha_to_one == null) gdext.classes.RDPipelineMultisampleState.mb_get_enable_alpha_to_one = MethodBind.get("RDPipelineMultisampleState", "get_enable_alpha_to_one", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineMultisampleState.mb_get_enable_alpha_to_one, livePtr)
  }

}

object RDPipelineMultisampleState {
  private[classes] var mb_set_sample_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sample_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_sample_shading: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_sample_shading: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_sample_shading: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_sample_shading: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_alpha_to_coverage: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_alpha_to_coverage: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_alpha_to_one: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_alpha_to_one: GDExtensionMethodBindPtr = null
}
