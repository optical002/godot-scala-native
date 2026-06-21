package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ConvertTransformModifier3D`, extends `BoneConstraint3D`. */
abstract class ConvertTransformModifier3D extends BoneConstraint3D {

  /** ConvertTransformModifier3D.set_apply_transform_mode */
  final def setApplyTransformMode(index: Long, transform_mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_apply_transform_mode", 1386463405L), hostObject.objectPtr, index, transform_mode)

  /** ConvertTransformModifier3D.get_apply_transform_mode */
  final def getApplyTransformMode(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ConvertTransformModifier3D", "get_apply_transform_mode", 3234663511L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_apply_axis */
  final def setApplyAxis(index: Long, axis: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_apply_axis", 776736805L), hostObject.objectPtr, index, axis)

  /** ConvertTransformModifier3D.get_apply_axis */
  final def getApplyAxis(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ConvertTransformModifier3D", "get_apply_axis", 4131134770L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_apply_range_min */
  final def setApplyRangeMin(index: Long, range_min: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_apply_range_min", 1602489585L), hostObject.objectPtr, index, range_min)

  /** ConvertTransformModifier3D.get_apply_range_min */
  final def getApplyRangeMin(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ConvertTransformModifier3D", "get_apply_range_min", 2339986948L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_apply_range_max */
  final def setApplyRangeMax(index: Long, range_max: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_apply_range_max", 1602489585L), hostObject.objectPtr, index, range_max)

  /** ConvertTransformModifier3D.get_apply_range_max */
  final def getApplyRangeMax(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ConvertTransformModifier3D", "get_apply_range_max", 2339986948L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_reference_transform_mode */
  final def setReferenceTransformMode(index: Long, transform_mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_reference_transform_mode", 1386463405L), hostObject.objectPtr, index, transform_mode)

  /** ConvertTransformModifier3D.get_reference_transform_mode */
  final def getReferenceTransformMode(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ConvertTransformModifier3D", "get_reference_transform_mode", 3234663511L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_reference_axis */
  final def setReferenceAxis(index: Long, axis: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_reference_axis", 776736805L), hostObject.objectPtr, index, axis)

  /** ConvertTransformModifier3D.get_reference_axis */
  final def getReferenceAxis(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ConvertTransformModifier3D", "get_reference_axis", 4131134770L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_reference_range_min */
  final def setReferenceRangeMin(index: Long, range_min: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_reference_range_min", 1602489585L), hostObject.objectPtr, index, range_min)

  /** ConvertTransformModifier3D.get_reference_range_min */
  final def getReferenceRangeMin(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ConvertTransformModifier3D", "get_reference_range_min", 2339986948L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_reference_range_max */
  final def setReferenceRangeMax(index: Long, range_max: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_reference_range_max", 1602489585L), hostObject.objectPtr, index, range_max)

  /** ConvertTransformModifier3D.get_reference_range_max */
  final def getReferenceRangeMax(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ConvertTransformModifier3D", "get_reference_range_max", 2339986948L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_relative */
  final def setRelative(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_relative", 300928843L), hostObject.objectPtr, index, enabled)

  /** ConvertTransformModifier3D.is_relative */
  final def isRelative(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ConvertTransformModifier3D", "is_relative", 1116898809L), hostObject.objectPtr, index)

  /** ConvertTransformModifier3D.set_additive */
  final def setAdditive(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ConvertTransformModifier3D", "set_additive", 300928843L), hostObject.objectPtr, index, enabled)

  /** ConvertTransformModifier3D.is_additive */
  final def isAdditive(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ConvertTransformModifier3D", "is_additive", 1116898809L), hostObject.objectPtr, index)

}

object ConvertTransformModifier3D {
  /** Class metadata for Gd[ConvertTransformModifier3D] lifetime management and casting. */
  given GodotClass[ConvertTransformModifier3D] with {
    def className = "ConvertTransformModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): ConvertTransformModifier3D = new ConvertTransformModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: ConvertTransformModifier3D): GodotObject = t.hostObject
  }
}
