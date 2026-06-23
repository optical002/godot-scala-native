package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDPipelineMultisampleState`, extends `RefCounted`. */
abstract class RDPipelineMultisampleState extends RefCounted {

  /** RDPipelineMultisampleState.set_sample_count */
  final def setSampleCount(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineMultisampleState", "set_sample_count", 3774171498L), hostObject.objectPtr, p_member)

  /** RDPipelineMultisampleState.get_sample_count */
  final def getSampleCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineMultisampleState", "get_sample_count", 407791724L), hostObject.objectPtr)

  /** RDPipelineMultisampleState.set_enable_sample_shading */
  final def setEnableSampleShading(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineMultisampleState", "set_enable_sample_shading", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineMultisampleState.get_enable_sample_shading */
  final def getEnableSampleShading(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineMultisampleState", "get_enable_sample_shading", 36873697L), hostObject.objectPtr)

  /** RDPipelineMultisampleState.set_min_sample_shading */
  final def setMinSampleShading(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineMultisampleState", "set_min_sample_shading", 373806689L), hostObject.objectPtr, p_member)

  /** RDPipelineMultisampleState.get_min_sample_shading */
  final def getMinSampleShading(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDPipelineMultisampleState", "get_min_sample_shading", 1740695150L), hostObject.objectPtr)

  /** RDPipelineMultisampleState.set_enable_alpha_to_coverage */
  final def setEnableAlphaToCoverage(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineMultisampleState", "set_enable_alpha_to_coverage", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineMultisampleState.get_enable_alpha_to_coverage */
  final def getEnableAlphaToCoverage(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineMultisampleState", "get_enable_alpha_to_coverage", 36873697L), hostObject.objectPtr)

  /** RDPipelineMultisampleState.set_enable_alpha_to_one */
  final def setEnableAlphaToOne(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineMultisampleState", "set_enable_alpha_to_one", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineMultisampleState.get_enable_alpha_to_one */
  final def getEnableAlphaToOne(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineMultisampleState", "get_enable_alpha_to_one", 36873697L), hostObject.objectPtr)

}

object RDPipelineMultisampleState {
  /** Class metadata for Gd[RDPipelineMultisampleState] lifetime management and casting. */
  given GodotClass[RDPipelineMultisampleState] with {
    def className = "RDPipelineMultisampleState"
    def isRefCounted = true
    def wrap(o: GodotObject): RDPipelineMultisampleState = new RDPipelineMultisampleState {}.withHost(o.objectPtr)
    def unwrap(t: RDPipelineMultisampleState): GodotObject = t.hostObject
  }
}
