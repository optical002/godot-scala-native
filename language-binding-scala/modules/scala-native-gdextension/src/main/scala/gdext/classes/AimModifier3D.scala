package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AimModifier3D`, extends `BoneConstraint3D`. */
abstract class AimModifier3D extends BoneConstraint3D {
  override def godotClassName: String = "AimModifier3D"

  /** AimModifier3D.set_forward_axis */
  final def setForwardAxis(index: Long, axis: Long): Unit = {
    if (gdext.classes.AimModifier3D.mb_set_forward_axis == null) gdext.classes.AimModifier3D.mb_set_forward_axis = MethodBind.get("AimModifier3D", "set_forward_axis", 2496831085L)
    Ptrcall.callVoid2(gdext.classes.AimModifier3D.mb_set_forward_axis, livePtr, index, axis)
  }

  /** AimModifier3D.get_forward_axis */
  final def getForwardAxis(index: Long): Long = {
    if (gdext.classes.AimModifier3D.mb_get_forward_axis == null) gdext.classes.AimModifier3D.mb_get_forward_axis = MethodBind.get("AimModifier3D", "get_forward_axis", 3949866735L)
    Ptrcall.call1[Long, Long](gdext.classes.AimModifier3D.mb_get_forward_axis, livePtr, index)
  }

  /** AimModifier3D.set_use_euler */
  final def setUseEuler(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.AimModifier3D.mb_set_use_euler == null) gdext.classes.AimModifier3D.mb_set_use_euler = MethodBind.get("AimModifier3D", "set_use_euler", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AimModifier3D.mb_set_use_euler, livePtr, index, enabled)
  }

  /** AimModifier3D.is_using_euler */
  final def isUsingEuler(index: Long): Boolean = {
    if (gdext.classes.AimModifier3D.mb_is_using_euler == null) gdext.classes.AimModifier3D.mb_is_using_euler = MethodBind.get("AimModifier3D", "is_using_euler", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AimModifier3D.mb_is_using_euler, livePtr, index)
  }

  /** AimModifier3D.set_primary_rotation_axis */
  final def setPrimaryRotationAxis(index: Long, axis: Long): Unit = {
    if (gdext.classes.AimModifier3D.mb_set_primary_rotation_axis == null) gdext.classes.AimModifier3D.mb_set_primary_rotation_axis = MethodBind.get("AimModifier3D", "set_primary_rotation_axis", 776736805L)
    Ptrcall.callVoid2(gdext.classes.AimModifier3D.mb_set_primary_rotation_axis, livePtr, index, axis)
  }

  /** AimModifier3D.get_primary_rotation_axis */
  final def getPrimaryRotationAxis(index: Long): Long = {
    if (gdext.classes.AimModifier3D.mb_get_primary_rotation_axis == null) gdext.classes.AimModifier3D.mb_get_primary_rotation_axis = MethodBind.get("AimModifier3D", "get_primary_rotation_axis", 4131134770L)
    Ptrcall.call1[Long, Long](gdext.classes.AimModifier3D.mb_get_primary_rotation_axis, livePtr, index)
  }

  /** AimModifier3D.set_use_secondary_rotation */
  final def setUseSecondaryRotation(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.AimModifier3D.mb_set_use_secondary_rotation == null) gdext.classes.AimModifier3D.mb_set_use_secondary_rotation = MethodBind.get("AimModifier3D", "set_use_secondary_rotation", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AimModifier3D.mb_set_use_secondary_rotation, livePtr, index, enabled)
  }

  /** AimModifier3D.is_using_secondary_rotation */
  final def isUsingSecondaryRotation(index: Long): Boolean = {
    if (gdext.classes.AimModifier3D.mb_is_using_secondary_rotation == null) gdext.classes.AimModifier3D.mb_is_using_secondary_rotation = MethodBind.get("AimModifier3D", "is_using_secondary_rotation", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AimModifier3D.mb_is_using_secondary_rotation, livePtr, index)
  }

  /** AimModifier3D.set_relative */
  final def setRelative(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.AimModifier3D.mb_set_relative == null) gdext.classes.AimModifier3D.mb_set_relative = MethodBind.get("AimModifier3D", "set_relative", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AimModifier3D.mb_set_relative, livePtr, index, enabled)
  }

  /** AimModifier3D.is_relative */
  final def isRelative(index: Long): Boolean = {
    if (gdext.classes.AimModifier3D.mb_is_relative == null) gdext.classes.AimModifier3D.mb_is_relative = MethodBind.get("AimModifier3D", "is_relative", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AimModifier3D.mb_is_relative, livePtr, index)
  }

}

object AimModifier3D {
  private[classes] var mb_set_forward_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_forward_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_euler: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_euler: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_secondary_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_secondary_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_relative: GDExtensionMethodBindPtr = null
}
