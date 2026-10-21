package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDPipelineSpecializationConstant`, extends `RefCounted`. */
abstract class RDPipelineSpecializationConstant extends RefCounted {
  override def godotClassName: String = "RDPipelineSpecializationConstant"

  /** RDPipelineSpecializationConstant.set_constant_id */
  final def setConstantId(constant_id: Long): Unit = {
    if (gdext.classes.RDPipelineSpecializationConstant.mb_set_constant_id == null) gdext.classes.RDPipelineSpecializationConstant.mb_set_constant_id = MethodBind.get("RDPipelineSpecializationConstant", "set_constant_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineSpecializationConstant.mb_set_constant_id, livePtr, constant_id)
  }

  /** RDPipelineSpecializationConstant.get_constant_id */
  final def getConstantId(): Long = {
    if (gdext.classes.RDPipelineSpecializationConstant.mb_get_constant_id == null) gdext.classes.RDPipelineSpecializationConstant.mb_get_constant_id = MethodBind.get("RDPipelineSpecializationConstant", "get_constant_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineSpecializationConstant.mb_get_constant_id, livePtr)
  }

}

object RDPipelineSpecializationConstant {
  private[classes] var mb_set_constant_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_id: GDExtensionMethodBindPtr = null
}
