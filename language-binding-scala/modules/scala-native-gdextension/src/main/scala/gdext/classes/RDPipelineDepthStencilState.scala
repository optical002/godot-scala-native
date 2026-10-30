package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDPipelineDepthStencilState`, extends `RefCounted`. */
abstract class RDPipelineDepthStencilState extends RefCounted {
  override def godotClassName: String = "RDPipelineDepthStencilState"

  /** RDPipelineDepthStencilState.set_enable_depth_test */
  final def setEnableDepthTest(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_test == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_test = MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_test", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_test, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_enable_depth_test */
  final def getEnableDepthTest(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_test == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_test = MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_test", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_test, livePtr)
  }

  /** RDPipelineDepthStencilState.set_enable_depth_write */
  final def setEnableDepthWrite(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_write == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_write = MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_write", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_write, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_enable_depth_write */
  final def getEnableDepthWrite(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_write == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_write = MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_write", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_write, livePtr)
  }

  /** RDPipelineDepthStencilState.set_depth_compare_operator */
  final def setDepthCompareOperator(pMember: gdext.classes.RenderingDevice.CompareOperator): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_depth_compare_operator == null) gdext.classes.RDPipelineDepthStencilState.mb_set_depth_compare_operator = MethodBind.get("RDPipelineDepthStencilState", "set_depth_compare_operator", 2573711505L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_depth_compare_operator, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_depth_compare_operator */
  final def getDepthCompareOperator(): gdext.classes.RenderingDevice.CompareOperator = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_depth_compare_operator == null) gdext.classes.RDPipelineDepthStencilState.mb_get_depth_compare_operator = MethodBind.get("RDPipelineDepthStencilState", "get_depth_compare_operator", 269730778L)
    gdext.classes.RenderingDevice.CompareOperator(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_depth_compare_operator, livePtr))
  }

  /** RDPipelineDepthStencilState.set_enable_depth_range */
  final def setEnableDepthRange(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_range == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_range = MethodBind.get("RDPipelineDepthStencilState", "set_enable_depth_range", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_depth_range, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_enable_depth_range */
  final def getEnableDepthRange(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_range == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_range = MethodBind.get("RDPipelineDepthStencilState", "get_enable_depth_range", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_depth_range, livePtr)
  }

  /** RDPipelineDepthStencilState.set_depth_range_min */
  final def setDepthRangeMin(pMember: Double): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_min == null) gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_min = MethodBind.get("RDPipelineDepthStencilState", "set_depth_range_min", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_min, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_depth_range_min */
  final def getDepthRangeMin(): Double = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_min == null) gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_min = MethodBind.get("RDPipelineDepthStencilState", "get_depth_range_min", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_min, livePtr)
  }

  /** RDPipelineDepthStencilState.set_depth_range_max */
  final def setDepthRangeMax(pMember: Double): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_max == null) gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_max = MethodBind.get("RDPipelineDepthStencilState", "set_depth_range_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_depth_range_max, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_depth_range_max */
  final def getDepthRangeMax(): Double = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_max == null) gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_max = MethodBind.get("RDPipelineDepthStencilState", "get_depth_range_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RDPipelineDepthStencilState.mb_get_depth_range_max, livePtr)
  }

  /** RDPipelineDepthStencilState.set_enable_stencil */
  final def setEnableStencil(pMember: Boolean): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_enable_stencil == null) gdext.classes.RDPipelineDepthStencilState.mb_set_enable_stencil = MethodBind.get("RDPipelineDepthStencilState", "set_enable_stencil", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_enable_stencil, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_enable_stencil */
  final def getEnableStencil(): Boolean = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_enable_stencil == null) gdext.classes.RDPipelineDepthStencilState.mb_get_enable_stencil = MethodBind.get("RDPipelineDepthStencilState", "get_enable_stencil", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RDPipelineDepthStencilState.mb_get_enable_stencil, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_fail */
  final def setFrontOpFail(pMember: gdext.classes.RenderingDevice.StencilOperation): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_fail = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_fail, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_front_op_fail */
  final def getFrontOpFail(): gdext.classes.RenderingDevice.StencilOperation = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_fail = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_fail", 1714732389L)
    gdext.classes.RenderingDevice.StencilOperation(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_fail, livePtr))
  }

  /** RDPipelineDepthStencilState.set_front_op_pass */
  final def setFrontOpPass(pMember: gdext.classes.RenderingDevice.StencilOperation): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_pass = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_pass", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_pass, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_front_op_pass */
  final def getFrontOpPass(): gdext.classes.RenderingDevice.StencilOperation = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_pass = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_pass", 1714732389L)
    gdext.classes.RenderingDevice.StencilOperation(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_pass, livePtr))
  }

  /** RDPipelineDepthStencilState.set_front_op_depth_fail */
  final def setFrontOpDepthFail(pMember: gdext.classes.RenderingDevice.StencilOperation): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_depth_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_depth_fail, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_front_op_depth_fail */
  final def getFrontOpDepthFail(): gdext.classes.RenderingDevice.StencilOperation = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_depth_fail", 1714732389L)
    gdext.classes.RenderingDevice.StencilOperation(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_depth_fail, livePtr))
  }

  /** RDPipelineDepthStencilState.set_front_op_compare */
  final def setFrontOpCompare(pMember: gdext.classes.RenderingDevice.CompareOperator): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_compare", 2573711505L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_front_op_compare */
  final def getFrontOpCompare(): gdext.classes.RenderingDevice.CompareOperator = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_compare", 269730778L)
    gdext.classes.RenderingDevice.CompareOperator(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare, livePtr))
  }

  /** RDPipelineDepthStencilState.set_front_op_compare_mask */
  final def setFrontOpCompareMask(pMember: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_compare_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_compare_mask, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_front_op_compare_mask */
  final def getFrontOpCompareMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_compare_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_compare_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_write_mask */
  final def setFrontOpWriteMask(pMember: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_write_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_write_mask, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_front_op_write_mask */
  final def getFrontOpWriteMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_write_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_write_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_front_op_reference */
  final def setFrontOpReference(pMember: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_reference == null) gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_reference = MethodBind.get("RDPipelineDepthStencilState", "set_front_op_reference", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_front_op_reference, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_front_op_reference */
  final def getFrontOpReference(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_reference == null) gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_reference = MethodBind.get("RDPipelineDepthStencilState", "get_front_op_reference", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_front_op_reference, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_fail */
  final def setBackOpFail(pMember: gdext.classes.RenderingDevice.StencilOperation): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_fail = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_fail, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_back_op_fail */
  final def getBackOpFail(): gdext.classes.RenderingDevice.StencilOperation = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_fail = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_fail", 1714732389L)
    gdext.classes.RenderingDevice.StencilOperation(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_fail, livePtr))
  }

  /** RDPipelineDepthStencilState.set_back_op_pass */
  final def setBackOpPass(pMember: gdext.classes.RenderingDevice.StencilOperation): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_pass = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_pass", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_pass, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_back_op_pass */
  final def getBackOpPass(): gdext.classes.RenderingDevice.StencilOperation = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_pass == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_pass = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_pass", 1714732389L)
    gdext.classes.RenderingDevice.StencilOperation(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_pass, livePtr))
  }

  /** RDPipelineDepthStencilState.set_back_op_depth_fail */
  final def setBackOpDepthFail(pMember: gdext.classes.RenderingDevice.StencilOperation): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_depth_fail", 2092799566L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_depth_fail, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_back_op_depth_fail */
  final def getBackOpDepthFail(): gdext.classes.RenderingDevice.StencilOperation = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_depth_fail == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_depth_fail = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_depth_fail", 1714732389L)
    gdext.classes.RenderingDevice.StencilOperation(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_depth_fail, livePtr))
  }

  /** RDPipelineDepthStencilState.set_back_op_compare */
  final def setBackOpCompare(pMember: gdext.classes.RenderingDevice.CompareOperator): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_compare", 2573711505L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_back_op_compare */
  final def getBackOpCompare(): gdext.classes.RenderingDevice.CompareOperator = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_compare", 269730778L)
    gdext.classes.RenderingDevice.CompareOperator(Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare, livePtr))
  }

  /** RDPipelineDepthStencilState.set_back_op_compare_mask */
  final def setBackOpCompareMask(pMember: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_compare_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_compare_mask, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_back_op_compare_mask */
  final def getBackOpCompareMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare_mask = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_compare_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_compare_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_write_mask */
  final def setBackOpWriteMask(pMember: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_write_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_write_mask, livePtr, pMember)
  }

  /** RDPipelineDepthStencilState.get_back_op_write_mask */
  final def getBackOpWriteMask(): Long = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_write_mask == null) gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_write_mask = MethodBind.get("RDPipelineDepthStencilState", "get_back_op_write_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RDPipelineDepthStencilState.mb_get_back_op_write_mask, livePtr)
  }

  /** RDPipelineDepthStencilState.set_back_op_reference */
  final def setBackOpReference(pMember: Long): Unit = {
    if (gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_reference == null) gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_reference = MethodBind.get("RDPipelineDepthStencilState", "set_back_op_reference", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RDPipelineDepthStencilState.mb_set_back_op_reference, livePtr, pMember)
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
