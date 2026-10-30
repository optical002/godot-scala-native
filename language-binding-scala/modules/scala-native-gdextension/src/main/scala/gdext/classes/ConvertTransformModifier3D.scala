package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ConvertTransformModifier3D`, extends `BoneConstraint3D`. */
abstract class ConvertTransformModifier3D extends BoneConstraint3D {
  override def godotClassName: String = "ConvertTransformModifier3D"

  /** ConvertTransformModifier3D.set_apply_transform_mode */
  final def setApplyTransformMode(index: Long, transformMode: gdext.classes.ConvertTransformModifier3D.TransformMode): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_apply_transform_mode == null) gdext.classes.ConvertTransformModifier3D.mb_set_apply_transform_mode = MethodBind.get("ConvertTransformModifier3D", "set_apply_transform_mode", 1386463405L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_apply_transform_mode, livePtr, index, transformMode)
  }

  /** ConvertTransformModifier3D.get_apply_transform_mode */
  final def getApplyTransformMode(index: Long): gdext.classes.ConvertTransformModifier3D.TransformMode = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_apply_transform_mode == null) gdext.classes.ConvertTransformModifier3D.mb_get_apply_transform_mode = MethodBind.get("ConvertTransformModifier3D", "get_apply_transform_mode", 3234663511L)
    gdext.classes.ConvertTransformModifier3D.TransformMode(Ptrcall.call1[Long, Long](gdext.classes.ConvertTransformModifier3D.mb_get_apply_transform_mode, livePtr, index))
  }

  /** ConvertTransformModifier3D.set_apply_axis */
  final def setApplyAxis(index: Long, axis: Long): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_apply_axis == null) gdext.classes.ConvertTransformModifier3D.mb_set_apply_axis = MethodBind.get("ConvertTransformModifier3D", "set_apply_axis", 776736805L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_apply_axis, livePtr, index, axis)
  }

  /** ConvertTransformModifier3D.get_apply_axis */
  final def getApplyAxis(index: Long): Long = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_apply_axis == null) gdext.classes.ConvertTransformModifier3D.mb_get_apply_axis = MethodBind.get("ConvertTransformModifier3D", "get_apply_axis", 4131134770L)
    Ptrcall.call1[Long, Long](gdext.classes.ConvertTransformModifier3D.mb_get_apply_axis, livePtr, index)
  }

  /** ConvertTransformModifier3D.set_apply_range_min */
  final def setApplyRangeMin(index: Long, rangeMin: Double): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_apply_range_min == null) gdext.classes.ConvertTransformModifier3D.mb_set_apply_range_min = MethodBind.get("ConvertTransformModifier3D", "set_apply_range_min", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_apply_range_min, livePtr, index, rangeMin)
  }

  /** ConvertTransformModifier3D.get_apply_range_min */
  final def getApplyRangeMin(index: Long): Double = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_apply_range_min == null) gdext.classes.ConvertTransformModifier3D.mb_get_apply_range_min = MethodBind.get("ConvertTransformModifier3D", "get_apply_range_min", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.ConvertTransformModifier3D.mb_get_apply_range_min, livePtr, index)
  }

  /** ConvertTransformModifier3D.set_apply_range_max */
  final def setApplyRangeMax(index: Long, rangeMax: Double): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_apply_range_max == null) gdext.classes.ConvertTransformModifier3D.mb_set_apply_range_max = MethodBind.get("ConvertTransformModifier3D", "set_apply_range_max", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_apply_range_max, livePtr, index, rangeMax)
  }

  /** ConvertTransformModifier3D.get_apply_range_max */
  final def getApplyRangeMax(index: Long): Double = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_apply_range_max == null) gdext.classes.ConvertTransformModifier3D.mb_get_apply_range_max = MethodBind.get("ConvertTransformModifier3D", "get_apply_range_max", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.ConvertTransformModifier3D.mb_get_apply_range_max, livePtr, index)
  }

  /** ConvertTransformModifier3D.set_reference_transform_mode */
  final def setReferenceTransformMode(index: Long, transformMode: gdext.classes.ConvertTransformModifier3D.TransformMode): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_reference_transform_mode == null) gdext.classes.ConvertTransformModifier3D.mb_set_reference_transform_mode = MethodBind.get("ConvertTransformModifier3D", "set_reference_transform_mode", 1386463405L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_reference_transform_mode, livePtr, index, transformMode)
  }

  /** ConvertTransformModifier3D.get_reference_transform_mode */
  final def getReferenceTransformMode(index: Long): gdext.classes.ConvertTransformModifier3D.TransformMode = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_reference_transform_mode == null) gdext.classes.ConvertTransformModifier3D.mb_get_reference_transform_mode = MethodBind.get("ConvertTransformModifier3D", "get_reference_transform_mode", 3234663511L)
    gdext.classes.ConvertTransformModifier3D.TransformMode(Ptrcall.call1[Long, Long](gdext.classes.ConvertTransformModifier3D.mb_get_reference_transform_mode, livePtr, index))
  }

  /** ConvertTransformModifier3D.set_reference_axis */
  final def setReferenceAxis(index: Long, axis: Long): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_reference_axis == null) gdext.classes.ConvertTransformModifier3D.mb_set_reference_axis = MethodBind.get("ConvertTransformModifier3D", "set_reference_axis", 776736805L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_reference_axis, livePtr, index, axis)
  }

  /** ConvertTransformModifier3D.get_reference_axis */
  final def getReferenceAxis(index: Long): Long = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_reference_axis == null) gdext.classes.ConvertTransformModifier3D.mb_get_reference_axis = MethodBind.get("ConvertTransformModifier3D", "get_reference_axis", 4131134770L)
    Ptrcall.call1[Long, Long](gdext.classes.ConvertTransformModifier3D.mb_get_reference_axis, livePtr, index)
  }

  /** ConvertTransformModifier3D.set_reference_range_min */
  final def setReferenceRangeMin(index: Long, rangeMin: Double): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_reference_range_min == null) gdext.classes.ConvertTransformModifier3D.mb_set_reference_range_min = MethodBind.get("ConvertTransformModifier3D", "set_reference_range_min", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_reference_range_min, livePtr, index, rangeMin)
  }

  /** ConvertTransformModifier3D.get_reference_range_min */
  final def getReferenceRangeMin(index: Long): Double = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_reference_range_min == null) gdext.classes.ConvertTransformModifier3D.mb_get_reference_range_min = MethodBind.get("ConvertTransformModifier3D", "get_reference_range_min", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.ConvertTransformModifier3D.mb_get_reference_range_min, livePtr, index)
  }

  /** ConvertTransformModifier3D.set_reference_range_max */
  final def setReferenceRangeMax(index: Long, rangeMax: Double): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_reference_range_max == null) gdext.classes.ConvertTransformModifier3D.mb_set_reference_range_max = MethodBind.get("ConvertTransformModifier3D", "set_reference_range_max", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_reference_range_max, livePtr, index, rangeMax)
  }

  /** ConvertTransformModifier3D.get_reference_range_max */
  final def getReferenceRangeMax(index: Long): Double = {
    if (gdext.classes.ConvertTransformModifier3D.mb_get_reference_range_max == null) gdext.classes.ConvertTransformModifier3D.mb_get_reference_range_max = MethodBind.get("ConvertTransformModifier3D", "get_reference_range_max", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.ConvertTransformModifier3D.mb_get_reference_range_max, livePtr, index)
  }

  /** ConvertTransformModifier3D.set_relative */
  final def setRelative(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_relative == null) gdext.classes.ConvertTransformModifier3D.mb_set_relative = MethodBind.get("ConvertTransformModifier3D", "set_relative", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_relative, livePtr, index, enabled)
  }

  /** ConvertTransformModifier3D.is_relative */
  final def isRelative(index: Long): Boolean = {
    if (gdext.classes.ConvertTransformModifier3D.mb_is_relative == null) gdext.classes.ConvertTransformModifier3D.mb_is_relative = MethodBind.get("ConvertTransformModifier3D", "is_relative", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ConvertTransformModifier3D.mb_is_relative, livePtr, index)
  }

  /** ConvertTransformModifier3D.set_additive */
  final def setAdditive(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.ConvertTransformModifier3D.mb_set_additive == null) gdext.classes.ConvertTransformModifier3D.mb_set_additive = MethodBind.get("ConvertTransformModifier3D", "set_additive", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ConvertTransformModifier3D.mb_set_additive, livePtr, index, enabled)
  }

  /** ConvertTransformModifier3D.is_additive */
  final def isAdditive(index: Long): Boolean = {
    if (gdext.classes.ConvertTransformModifier3D.mb_is_additive == null) gdext.classes.ConvertTransformModifier3D.mb_is_additive = MethodBind.get("ConvertTransformModifier3D", "is_additive", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ConvertTransformModifier3D.mb_is_additive, livePtr, index)
  }

}

object ConvertTransformModifier3D {
  private[classes] var mb_set_apply_transform_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_apply_transform_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_apply_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_apply_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_apply_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_apply_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_apply_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_apply_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_transform_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_transform_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_additive: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_additive: GDExtensionMethodBindPtr = null

  /** Godot enum `ConvertTransformModifier3D.TransformMode`. */
  opaque type TransformMode <: Long = Long

  object TransformMode {
    final val Position: TransformMode = 0L.asInstanceOf[TransformMode]
    final val Rotation: TransformMode = 1L.asInstanceOf[TransformMode]
    final val Scale: TransformMode = 2L.asInstanceOf[TransformMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TransformMode = value.asInstanceOf[TransformMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TransformMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TransformMode]]

    extension (self: TransformMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Position"
        case 1L => "Rotation"
        case 2L => "Scale"
        case other => other.toString
      }
  }
}
