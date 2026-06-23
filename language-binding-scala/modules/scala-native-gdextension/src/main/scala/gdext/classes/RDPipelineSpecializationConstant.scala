package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDPipelineSpecializationConstant`, extends `RefCounted`. */
abstract class RDPipelineSpecializationConstant extends RefCounted {

  /** RDPipelineSpecializationConstant.set_constant_id */
  final def setConstantId(constant_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineSpecializationConstant", "set_constant_id", 1286410249L), hostObject.objectPtr, constant_id)

  /** RDPipelineSpecializationConstant.get_constant_id */
  final def getConstantId(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineSpecializationConstant", "get_constant_id", 3905245786L), hostObject.objectPtr)

}

object RDPipelineSpecializationConstant {
  /** Class metadata for Gd[RDPipelineSpecializationConstant] lifetime management and casting. */
  given GodotClass[RDPipelineSpecializationConstant] with {
    def className = "RDPipelineSpecializationConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): RDPipelineSpecializationConstant = new RDPipelineSpecializationConstant {}.withHost(o.objectPtr)
    def unwrap(t: RDPipelineSpecializationConstant): GodotObject = t.hostObject
  }
}
