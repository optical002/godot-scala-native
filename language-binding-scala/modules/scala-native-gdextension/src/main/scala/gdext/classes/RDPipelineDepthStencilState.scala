package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDPipelineDepthStencilState`, extends `RefCounted`. */
abstract class RDPipelineDepthStencilState extends RefCounted {
  override def godotClassName: String = "RDPipelineDepthStencilState"

  /** RDPipelineDepthStencilState.set_enable_depth_test */
  final def setEnableDepthTest(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_test", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_enable_depth_test */
  final def getEnableDepthTest(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_test", 36873697L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_enable_depth_write */
  final def setEnableDepthWrite(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_write", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_enable_depth_write */
  final def getEnableDepthWrite(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_write", 36873697L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_depth_compare_operator */
  final def setDepthCompareOperator(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_depth_compare_operator", 2573711505L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_depth_compare_operator */
  final def getDepthCompareOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_depth_compare_operator", 269730778L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_enable_depth_range */
  final def setEnableDepthRange(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_range", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_enable_depth_range */
  final def getEnableDepthRange(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_range", 36873697L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_depth_range_min */
  final def setDepthRangeMin(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_depth_range_min", 373806689L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_depth_range_min */
  final def getDepthRangeMin(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDPipelineDepthStencilState", "get_depth_range_min", 1740695150L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_depth_range_max */
  final def setDepthRangeMax(p_member: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_depth_range_max", 373806689L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_depth_range_max */
  final def getDepthRangeMax(): Double =
    Ptrcall.call0[Double](MethodBind.get("RDPipelineDepthStencilState", "get_depth_range_max", 1740695150L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_enable_stencil */
  final def setEnableStencil(p_member: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_enable_stencil", 2586408642L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_enable_stencil */
  final def getEnableStencil(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RDPipelineDepthStencilState", "get_enable_stencil", 36873697L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_front_op_fail */
  final def setFrontOpFail(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_front_op_fail", 2092799566L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_front_op_fail */
  final def getFrontOpFail(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_front_op_fail", 1714732389L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_front_op_pass */
  final def setFrontOpPass(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_front_op_pass", 2092799566L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_front_op_pass */
  final def getFrontOpPass(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_front_op_pass", 1714732389L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_front_op_depth_fail */
  final def setFrontOpDepthFail(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_front_op_depth_fail", 2092799566L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_front_op_depth_fail */
  final def getFrontOpDepthFail(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_front_op_depth_fail", 1714732389L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_front_op_compare */
  final def setFrontOpCompare(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_front_op_compare", 2573711505L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_front_op_compare */
  final def getFrontOpCompare(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_front_op_compare", 269730778L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_front_op_compare_mask */
  final def setFrontOpCompareMask(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_front_op_compare_mask", 1286410249L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_front_op_compare_mask */
  final def getFrontOpCompareMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_front_op_compare_mask", 3905245786L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_front_op_write_mask */
  final def setFrontOpWriteMask(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_front_op_write_mask", 1286410249L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_front_op_write_mask */
  final def getFrontOpWriteMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_front_op_write_mask", 3905245786L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_front_op_reference */
  final def setFrontOpReference(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_front_op_reference", 1286410249L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_front_op_reference */
  final def getFrontOpReference(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_front_op_reference", 3905245786L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_back_op_fail */
  final def setBackOpFail(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_back_op_fail", 2092799566L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_back_op_fail */
  final def getBackOpFail(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_back_op_fail", 1714732389L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_back_op_pass */
  final def setBackOpPass(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_back_op_pass", 2092799566L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_back_op_pass */
  final def getBackOpPass(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_back_op_pass", 1714732389L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_back_op_depth_fail */
  final def setBackOpDepthFail(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_back_op_depth_fail", 2092799566L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_back_op_depth_fail */
  final def getBackOpDepthFail(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_back_op_depth_fail", 1714732389L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_back_op_compare */
  final def setBackOpCompare(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_back_op_compare", 2573711505L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_back_op_compare */
  final def getBackOpCompare(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_back_op_compare", 269730778L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_back_op_compare_mask */
  final def setBackOpCompareMask(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_back_op_compare_mask", 1286410249L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_back_op_compare_mask */
  final def getBackOpCompareMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_back_op_compare_mask", 3905245786L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_back_op_write_mask */
  final def setBackOpWriteMask(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_back_op_write_mask", 1286410249L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_back_op_write_mask */
  final def getBackOpWriteMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_back_op_write_mask", 3905245786L), hostObject.objectPtr)

  /** RDPipelineDepthStencilState.set_back_op_reference */
  final def setBackOpReference(p_member: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDPipelineDepthStencilState", "set_back_op_reference", 1286410249L), hostObject.objectPtr, p_member)

  /** RDPipelineDepthStencilState.get_back_op_reference */
  final def getBackOpReference(): Long =
    Ptrcall.call0[Long](MethodBind.get("RDPipelineDepthStencilState", "get_back_op_reference", 3905245786L), hostObject.objectPtr)

}
