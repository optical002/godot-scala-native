package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AimModifier3D`, extends `BoneConstraint3D`. */
abstract class AimModifier3D extends BoneConstraint3D {

  /** AimModifier3D.set_forward_axis */
  final def setForwardAxis(index: Long, axis: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AimModifier3D", "set_forward_axis", 2496831085L), hostObject.objectPtr, index, axis)

  /** AimModifier3D.get_forward_axis */
  final def getForwardAxis(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("AimModifier3D", "get_forward_axis", 3949866735L), hostObject.objectPtr, index)

  /** AimModifier3D.set_use_euler */
  final def setUseEuler(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AimModifier3D", "set_use_euler", 300928843L), hostObject.objectPtr, index, enabled)

  /** AimModifier3D.is_using_euler */
  final def isUsingEuler(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AimModifier3D", "is_using_euler", 1116898809L), hostObject.objectPtr, index)

  /** AimModifier3D.set_primary_rotation_axis */
  final def setPrimaryRotationAxis(index: Long, axis: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AimModifier3D", "set_primary_rotation_axis", 776736805L), hostObject.objectPtr, index, axis)

  /** AimModifier3D.get_primary_rotation_axis */
  final def getPrimaryRotationAxis(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("AimModifier3D", "get_primary_rotation_axis", 4131134770L), hostObject.objectPtr, index)

  /** AimModifier3D.set_use_secondary_rotation */
  final def setUseSecondaryRotation(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AimModifier3D", "set_use_secondary_rotation", 300928843L), hostObject.objectPtr, index, enabled)

  /** AimModifier3D.is_using_secondary_rotation */
  final def isUsingSecondaryRotation(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AimModifier3D", "is_using_secondary_rotation", 1116898809L), hostObject.objectPtr, index)

  /** AimModifier3D.set_relative */
  final def setRelative(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AimModifier3D", "set_relative", 300928843L), hostObject.objectPtr, index, enabled)

  /** AimModifier3D.is_relative */
  final def isRelative(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AimModifier3D", "is_relative", 1116898809L), hostObject.objectPtr, index)

}

object AimModifier3D {
  /** Class metadata for Gd[AimModifier3D] lifetime management and casting. */
  given GodotClass[AimModifier3D] with {
    def className = "AimModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): AimModifier3D = new AimModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: AimModifier3D): GodotObject = t.hostObject
  }
}
