package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDPipelineDepthStencilState`, extends `RefCounted`. */
abstract class RDPipelineDepthStencilState extends RefCounted {
  override def godotClassName: String = "RDPipelineDepthStencilState"

  /** RDPipelineDepthStencilState.set_enable_depth_test */
  final def setEnableDepthTest(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_test == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_test = MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_test", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_test, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_enable_depth_test */
  final def getEnableDepthTest(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_test == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_test = MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_test", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_test, livePtr)
  }

  /** RDPipelineDepthStencilState.set_enable_depth_write */
  final def setEnableDepthWrite(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_write == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_write = MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_write", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_write, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_enable_depth_write */
  final def getEnableDepthWrite(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_write == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_write = MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_write", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_write, livePtr)
  }

  /** RDPipelineDepthStencilState.set_depth_compare_operator */
  final def setDepthCompareOperator(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_depth_compare_operator == null) gdext.classes.RDPipelineDepthStencilState.mb_set_depth_compare_operator = MethodBind.get("RDPipelineDepthStencilState", "set_depth_compare_operator", 2573711505L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_depth_compare_operator, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_depth_compare_operator */
  final def getDepthCompareOperator(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_depth_compare_operator == null) gdext.classes.RDPipelineDepthStencilState.mb_get_depth_compare_operator = MethodBind.get("RDPipelineDepthStencilState", "get_depth_compare_operator", 269730778L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_depth_compare_operator, livePtr)
  }

  /** RDPipelineDepthStencilState.set_enable_depth_range */
  final def setEnableDepthRange(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_range == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_range = MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_range", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_range, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_enable_depth_range */
  final def getEnableDepthRange(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_range == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_range = MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_range", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_range, livePtr)
  }

  /** RDPipelineDepthStencilState.set_depth_range_min */
  final def setDepthRangeMin(p_member: Double): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_min == null) gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_min = MethodBind.get("RDPipelineDepthStencilState", "set_depth_range_min", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_min, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_depth_range_min */
  final def getDepthRangeMin(): Double = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_min == null) gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_min = MethodBind.get("RDPipelineDepthStencilState", "get_depth_range_min", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_min, livePtr)
  }

  /** RDPipelineDepthStencilState.set_depth_range_max */
  final def setDepthRangeMax(p_member: Double): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_max == null) gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_max = MethodBind.get("RDPipelineDepthStencilState", "set_depth_range_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_max, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_depth_range_max */
  final def getDepthRangeMax(): Double = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_max == null) gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_max = MethodBind.get("RDPipelineDepthStencilState", "get_depth_range_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_max, livePtr)
  }

  /** RDPipelineDepthStencilState.set_enable_stencil */
  final def setEnableStencil(p_member: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_stencil == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_stencil = MethodBind.get("RDPipelineDepthStencilState", "set_enable_stencil", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_stencil, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_enable_stencil */
  final def getEnableStencil(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_stencil == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_stencil = MethodBind.get("RDPipelineDepthStencilState", "get_enable_stencil", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_stencil, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_fail */
  final def setFrontOpFail(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_fail = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_fail, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_front_op_fail */
  final def getFrontOpFail(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_fail = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_fail", 1714732389L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_fail, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_pass */
  final def setFrontOpPass(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_pass = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_pass", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_pass, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_front_op_pass */
  final def getFrontOpPass(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_pass = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_pass", 1714732389L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_pass, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_depth_fail */
  final def setFrontOpDepthFail(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_depth_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_depth_fail, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_front_op_depth_fail */
  final def getFrontOpDepthFail(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_depth_fail", 1714732389L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_depth_fail, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_compare */
  final def setFrontOpCompare(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_compare", 2573711505L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_front_op_compare */
  final def getFrontOpCompare(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_compare", 269730778L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_compare_mask */
  final def setFrontOpCompareMask(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_compare_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare_mask, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_front_op_compare_mask */
  final def getFrontOpCompareMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_compare_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_write_mask */
  final def setFrontOpWriteMask(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_write_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_write_mask, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_front_op_write_mask */
  final def getFrontOpWriteMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_write_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_write_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_reference */
  final def setFrontOpReference(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_reference == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_reference = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_reference", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_reference, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_front_op_reference */
  final def getFrontOpReference(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_reference == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_reference = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_reference", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_reference, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_fail */
  final def setBackOpFail(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_fail = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_fail, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_back_op_fail */
  final def getBackOpFail(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_fail = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_fail", 1714732389L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_fail, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_pass */
  final def setBackOpPass(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_pass = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_pass", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_pass, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_back_op_pass */
  final def getBackOpPass(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_pass = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_pass", 1714732389L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_pass, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_depth_fail */
  final def setBackOpDepthFail(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_depth_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_depth_fail, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_back_op_depth_fail */
  final def getBackOpDepthFail(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_depth_fail", 1714732389L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_depth_fail, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_compare */
  final def setBackOpCompare(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_compare", 2573711505L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_back_op_compare */
  final def getBackOpCompare(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_compare", 269730778L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_compare_mask */
  final def setBackOpCompareMask(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_compare_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare_mask, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_back_op_compare_mask */
  final def getBackOpCompareMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_compare_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_write_mask */
  final def setBackOpWriteMask(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_write_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_write_mask, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_back_op_write_mask */
  final def getBackOpWriteMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_write_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_write_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_reference */
  final def setBackOpReference(p_member: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_reference == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_reference = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_reference", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_reference, livePtr, p_member)
  }

  /** RDPipelineDepthStencilState.get_back_op_reference */
  final def getBackOpReference(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_reference == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_reference = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_reference", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_reference, livePtr)
  }

}

object RDPipelineDepthStencilState {
  private[classes] var mb_set_enable_depth_test: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_depth_test: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_depth_write: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_depth_write: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_compare_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_compare_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_depth_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_depth_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_stencil: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_stencil: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_op_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_op_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_op_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_op_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_op_depth_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_op_depth_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_op_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_op_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_op_compare_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_op_compare_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_op_write_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_op_write_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_front_op_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_front_op_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_back_op_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_back_op_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_back_op_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_back_op_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_back_op_depth_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_back_op_depth_fail: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_back_op_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_back_op_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_back_op_compare_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_back_op_compare_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_back_op_write_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_back_op_write_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_back_op_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_back_op_reference: GDExtensionMethodBindPtr = null
}
