package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CopyTransformModifier3D`, extends `BoneConstraint3D`. */
abstract class CopyTransformModifier3D extends BoneConstraint3D {

  /** CopyTransformModifier3D.set_copy_flags */
  final def setCopyFlags(index: Long, copy_flags: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_copy_flags", 2252507859L), hostObject.objectPtr, index, copy_flags)

  /** CopyTransformModifier3D.get_copy_flags */
  final def getCopyFlags(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CopyTransformModifier3D", "get_copy_flags", 1685185931L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_axis_flags */
  final def setAxisFlags(index: Long, axis_flags: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_axis_flags", 2044211897L), hostObject.objectPtr, index, axis_flags)

  /** CopyTransformModifier3D.get_axis_flags */
  final def getAxisFlags(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CopyTransformModifier3D", "get_axis_flags", 992162046L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_invert_flags */
  final def setInvertFlags(index: Long, axis_flags: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_invert_flags", 2044211897L), hostObject.objectPtr, index, axis_flags)

  /** CopyTransformModifier3D.get_invert_flags */
  final def getInvertFlags(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CopyTransformModifier3D", "get_invert_flags", 992162046L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_copy_position */
  final def setCopyPosition(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_copy_position", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_position_copying */
  final def isPositionCopying(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_position_copying", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_copy_rotation */
  final def setCopyRotation(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_copy_rotation", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_rotation_copying */
  final def isRotationCopying(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_rotation_copying", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_copy_scale */
  final def setCopyScale(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_copy_scale", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_scale_copying */
  final def isScaleCopying(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_scale_copying", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_axis_x_enabled */
  final def setAxisXEnabled(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_axis_x_enabled", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_axis_x_enabled */
  final def isAxisXEnabled(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_axis_x_enabled", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_axis_y_enabled */
  final def setAxisYEnabled(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_axis_y_enabled", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_axis_y_enabled */
  final def isAxisYEnabled(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_axis_y_enabled", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_axis_z_enabled */
  final def setAxisZEnabled(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_axis_z_enabled", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_axis_z_enabled */
  final def isAxisZEnabled(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_axis_z_enabled", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_axis_x_inverted */
  final def setAxisXInverted(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_axis_x_inverted", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_axis_x_inverted */
  final def isAxisXInverted(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_axis_x_inverted", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_axis_y_inverted */
  final def setAxisYInverted(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_axis_y_inverted", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_axis_y_inverted */
  final def isAxisYInverted(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_axis_y_inverted", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_axis_z_inverted */
  final def setAxisZInverted(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_axis_z_inverted", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_axis_z_inverted */
  final def isAxisZInverted(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_axis_z_inverted", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_relative */
  final def setRelative(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_relative", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_relative */
  final def isRelative(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_relative", 1116898809L), hostObject.objectPtr, index)

  /** CopyTransformModifier3D.set_additive */
  final def setAdditive(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CopyTransformModifier3D", "set_additive", 300928843L), hostObject.objectPtr, index, enabled)

  /** CopyTransformModifier3D.is_additive */
  final def isAdditive(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CopyTransformModifier3D", "is_additive", 1116898809L), hostObject.objectPtr, index)

}

object CopyTransformModifier3D {
  /** Class metadata for Gd[CopyTransformModifier3D] lifetime management and casting. */
  given GodotClass[CopyTransformModifier3D] with {
    def className = "CopyTransformModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CopyTransformModifier3D = new CopyTransformModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: CopyTransformModifier3D): GodotObject = t.hostObject
  }
}
