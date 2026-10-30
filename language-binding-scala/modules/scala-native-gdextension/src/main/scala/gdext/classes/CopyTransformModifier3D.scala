package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CopyTransformModifier3D`, extends `BoneConstraint3D`. */
abstract class CopyTransformModifier3D extends BoneConstraint3D {
  override def godotClassName: String = "CopyTransformModifier3D"

  /** CopyTransformModifier3D.set_copy_flags */
  final def setCopyFlags(index: Long, copyFlags: gdext.classes.CopyTransformModifier3D.TransformFlag): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_copy_flags == null) gdext.classes.CopyTransformModifier3D.mb_set_copy_flags = MethodBind.get("CopyTransformModifier3D", "set_copy_flags", 2252507859L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_copy_flags, livePtr, index, copyFlags.asInstanceOf[Long])
  }

  /** CopyTransformModifier3D.get_copy_flags */
  final def getCopyFlags(index: Long): gdext.classes.CopyTransformModifier3D.TransformFlag = {
    if (gdext.classes.CopyTransformModifier3D.mb_get_copy_flags == null) gdext.classes.CopyTransformModifier3D.mb_get_copy_flags = MethodBind.get("CopyTransformModifier3D", "get_copy_flags", 1685185931L)
    gdext.classes.CopyTransformModifier3D.TransformFlag(Ptrcall.call1[Long, Long](gdext.classes.CopyTransformModifier3D.mb_get_copy_flags, livePtr, index))
  }

  /** CopyTransformModifier3D.set_axis_flags */
  final def setAxisFlags(index: Long, axisFlags: gdext.classes.CopyTransformModifier3D.AxisFlag): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_axis_flags == null) gdext.classes.CopyTransformModifier3D.mb_set_axis_flags = MethodBind.get("CopyTransformModifier3D", "set_axis_flags", 2044211897L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_axis_flags, livePtr, index, axisFlags.asInstanceOf[Long])
  }

  /** CopyTransformModifier3D.get_axis_flags */
  final def getAxisFlags(index: Long): gdext.classes.CopyTransformModifier3D.AxisFlag = {
    if (gdext.classes.CopyTransformModifier3D.mb_get_axis_flags == null) gdext.classes.CopyTransformModifier3D.mb_get_axis_flags = MethodBind.get("CopyTransformModifier3D", "get_axis_flags", 992162046L)
    gdext.classes.CopyTransformModifier3D.AxisFlag(Ptrcall.call1[Long, Long](gdext.classes.CopyTransformModifier3D.mb_get_axis_flags, livePtr, index))
  }

  /** CopyTransformModifier3D.set_invert_flags */
  final def setInvertFlags(index: Long, axisFlags: gdext.classes.CopyTransformModifier3D.AxisFlag): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_invert_flags == null) gdext.classes.CopyTransformModifier3D.mb_set_invert_flags = MethodBind.get("CopyTransformModifier3D", "set_invert_flags", 2044211897L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_invert_flags, livePtr, index, axisFlags.asInstanceOf[Long])
  }

  /** CopyTransformModifier3D.get_invert_flags */
  final def getInvertFlags(index: Long): gdext.classes.CopyTransformModifier3D.AxisFlag = {
    if (gdext.classes.CopyTransformModifier3D.mb_get_invert_flags == null) gdext.classes.CopyTransformModifier3D.mb_get_invert_flags = MethodBind.get("CopyTransformModifier3D", "get_invert_flags", 992162046L)
    gdext.classes.CopyTransformModifier3D.AxisFlag(Ptrcall.call1[Long, Long](gdext.classes.CopyTransformModifier3D.mb_get_invert_flags, livePtr, index))
  }

  /** CopyTransformModifier3D.set_copy_position */
  final def setCopyPosition(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_copy_position == null) gdext.classes.CopyTransformModifier3D.mb_set_copy_position = MethodBind.get("CopyTransformModifier3D", "set_copy_position", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_copy_position, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_position_copying */
  final def isPositionCopying(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_position_copying == null) gdext.classes.CopyTransformModifier3D.mb_is_position_copying = MethodBind.get("CopyTransformModifier3D", "is_position_copying", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_position_copying, livePtr, index)
  }

  /** CopyTransformModifier3D.set_copy_rotation */
  final def setCopyRotation(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_copy_rotation == null) gdext.classes.CopyTransformModifier3D.mb_set_copy_rotation = MethodBind.get("CopyTransformModifier3D", "set_copy_rotation", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_copy_rotation, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_rotation_copying */
  final def isRotationCopying(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_rotation_copying == null) gdext.classes.CopyTransformModifier3D.mb_is_rotation_copying = MethodBind.get("CopyTransformModifier3D", "is_rotation_copying", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_rotation_copying, livePtr, index)
  }

  /** CopyTransformModifier3D.set_copy_scale */
  final def setCopyScale(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_copy_scale == null) gdext.classes.CopyTransformModifier3D.mb_set_copy_scale = MethodBind.get("CopyTransformModifier3D", "set_copy_scale", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_copy_scale, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_scale_copying */
  final def isScaleCopying(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_scale_copying == null) gdext.classes.CopyTransformModifier3D.mb_is_scale_copying = MethodBind.get("CopyTransformModifier3D", "is_scale_copying", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_scale_copying, livePtr, index)
  }

  /** CopyTransformModifier3D.set_axis_x_enabled */
  final def setAxisXEnabled(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_axis_x_enabled == null) gdext.classes.CopyTransformModifier3D.mb_set_axis_x_enabled = MethodBind.get("CopyTransformModifier3D", "set_axis_x_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_axis_x_enabled, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_axis_x_enabled */
  final def isAxisXEnabled(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_axis_x_enabled == null) gdext.classes.CopyTransformModifier3D.mb_is_axis_x_enabled = MethodBind.get("CopyTransformModifier3D", "is_axis_x_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_axis_x_enabled, livePtr, index)
  }

  /** CopyTransformModifier3D.set_axis_y_enabled */
  final def setAxisYEnabled(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_axis_y_enabled == null) gdext.classes.CopyTransformModifier3D.mb_set_axis_y_enabled = MethodBind.get("CopyTransformModifier3D", "set_axis_y_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_axis_y_enabled, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_axis_y_enabled */
  final def isAxisYEnabled(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_axis_y_enabled == null) gdext.classes.CopyTransformModifier3D.mb_is_axis_y_enabled = MethodBind.get("CopyTransformModifier3D", "is_axis_y_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_axis_y_enabled, livePtr, index)
  }

  /** CopyTransformModifier3D.set_axis_z_enabled */
  final def setAxisZEnabled(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_axis_z_enabled == null) gdext.classes.CopyTransformModifier3D.mb_set_axis_z_enabled = MethodBind.get("CopyTransformModifier3D", "set_axis_z_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_axis_z_enabled, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_axis_z_enabled */
  final def isAxisZEnabled(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_axis_z_enabled == null) gdext.classes.CopyTransformModifier3D.mb_is_axis_z_enabled = MethodBind.get("CopyTransformModifier3D", "is_axis_z_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_axis_z_enabled, livePtr, index)
  }

  /** CopyTransformModifier3D.set_axis_x_inverted */
  final def setAxisXInverted(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_axis_x_inverted == null) gdext.classes.CopyTransformModifier3D.mb_set_axis_x_inverted = MethodBind.get("CopyTransformModifier3D", "set_axis_x_inverted", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_axis_x_inverted, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_axis_x_inverted */
  final def isAxisXInverted(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_axis_x_inverted == null) gdext.classes.CopyTransformModifier3D.mb_is_axis_x_inverted = MethodBind.get("CopyTransformModifier3D", "is_axis_x_inverted", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_axis_x_inverted, livePtr, index)
  }

  /** CopyTransformModifier3D.set_axis_y_inverted */
  final def setAxisYInverted(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_axis_y_inverted == null) gdext.classes.CopyTransformModifier3D.mb_set_axis_y_inverted = MethodBind.get("CopyTransformModifier3D", "set_axis_y_inverted", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_axis_y_inverted, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_axis_y_inverted */
  final def isAxisYInverted(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_axis_y_inverted == null) gdext.classes.CopyTransformModifier3D.mb_is_axis_y_inverted = MethodBind.get("CopyTransformModifier3D", "is_axis_y_inverted", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_axis_y_inverted, livePtr, index)
  }

  /** CopyTransformModifier3D.set_axis_z_inverted */
  final def setAxisZInverted(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_axis_z_inverted == null) gdext.classes.CopyTransformModifier3D.mb_set_axis_z_inverted = MethodBind.get("CopyTransformModifier3D", "set_axis_z_inverted", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_axis_z_inverted, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_axis_z_inverted */
  final def isAxisZInverted(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_axis_z_inverted == null) gdext.classes.CopyTransformModifier3D.mb_is_axis_z_inverted = MethodBind.get("CopyTransformModifier3D", "is_axis_z_inverted", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_axis_z_inverted, livePtr, index)
  }

  /** CopyTransformModifier3D.set_relative */
  final def setRelative(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_relative == null) gdext.classes.CopyTransformModifier3D.mb_set_relative = MethodBind.get("CopyTransformModifier3D", "set_relative", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_relative, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_relative */
  final def isRelative(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_relative == null) gdext.classes.CopyTransformModifier3D.mb_is_relative = MethodBind.get("CopyTransformModifier3D", "is_relative", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_relative, livePtr, index)
  }

  /** CopyTransformModifier3D.set_additive */
  final def setAdditive(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CopyTransformModifier3D.mb_set_additive == null) gdext.classes.CopyTransformModifier3D.mb_set_additive = MethodBind.get("CopyTransformModifier3D", "set_additive", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CopyTransformModifier3D.mb_set_additive, livePtr, index, enabled)
  }

  /** CopyTransformModifier3D.is_additive */
  final def isAdditive(index: Long): Boolean = {
    if (gdext.classes.CopyTransformModifier3D.mb_is_additive == null) gdext.classes.CopyTransformModifier3D.mb_is_additive = MethodBind.get("CopyTransformModifier3D", "is_additive", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CopyTransformModifier3D.mb_is_additive, livePtr, index)
  }

}

object CopyTransformModifier3D {
  private[classes] var mb_set_copy_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_copy_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_axis_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_invert_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_invert_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_copy_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_position_copying: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_copy_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_rotation_copying: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_copy_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scale_copying: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_x_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_axis_x_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_y_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_axis_y_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_z_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_axis_z_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_x_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_axis_x_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_y_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_axis_y_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_z_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_axis_z_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_additive: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_additive: GDExtensionMethodBindPtr = null

  /** Godot bitfield `CopyTransformModifier3D.TransformFlag`. */
  opaque type TransformFlag = Long

  object TransformFlag {
    final val Position: TransformFlag = 1L.asInstanceOf[TransformFlag]
    final val Rotation: TransformFlag = 2L.asInstanceOf[TransformFlag]
    final val Scale: TransformFlag = 4L.asInstanceOf[TransformFlag]
    final val All: TransformFlag = 7L.asInstanceOf[TransformFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TransformFlag = value.asInstanceOf[TransformFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TransformFlag] = scala.IArray[Long](1L, 2L, 4L, 7L).asInstanceOf[scala.IArray[TransformFlag]]

    extension (self: TransformFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Position"
        case 2L => "Rotation"
        case 4L => "Scale"
        case 7L => "All"
        case other => other.toString
      }
    extension (self: TransformFlag) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: TransformFlag): TransformFlag = (self.value | other.value).asInstanceOf[TransformFlag]
      inline def &(other: TransformFlag): TransformFlag = (self.value & other.value).asInstanceOf[TransformFlag]
      /** Every bit of `flag` is set. */
      inline def has(flag: TransformFlag): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot bitfield `CopyTransformModifier3D.AxisFlag`. */
  opaque type AxisFlag = Long

  object AxisFlag {
    final val X: AxisFlag = 1L.asInstanceOf[AxisFlag]
    final val Y: AxisFlag = 2L.asInstanceOf[AxisFlag]
    final val Z: AxisFlag = 4L.asInstanceOf[AxisFlag]
    final val All: AxisFlag = 7L.asInstanceOf[AxisFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AxisFlag = value.asInstanceOf[AxisFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AxisFlag] = scala.IArray[Long](1L, 2L, 4L, 7L).asInstanceOf[scala.IArray[AxisFlag]]

    extension (self: AxisFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "X"
        case 2L => "Y"
        case 4L => "Z"
        case 7L => "All"
        case other => other.toString
      }
    extension (self: AxisFlag) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: AxisFlag): AxisFlag = (self.value | other.value).asInstanceOf[AxisFlag]
      inline def &(other: AxisFlag): AxisFlag = (self.value & other.value).asInstanceOf[AxisFlag]
      /** Every bit of `flag` is set. */
      inline def has(flag: AxisFlag): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
