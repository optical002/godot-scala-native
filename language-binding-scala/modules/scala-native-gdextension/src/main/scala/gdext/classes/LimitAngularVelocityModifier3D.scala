package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `LimitAngularVelocityModifier3D`, extends `SkeletonModifier3D`. */
abstract class LimitAngularVelocityModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "LimitAngularVelocityModifier3D"

  /** LimitAngularVelocityModifier3D.set_root_bone_name */
  final def setRootBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("LimitAngularVelocityModifier3D", "set_root_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** LimitAngularVelocityModifier3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("LimitAngularVelocityModifier3D", "get_root_bone_name", 844755477L), hostObject.objectPtr, index)

  /** LimitAngularVelocityModifier3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LimitAngularVelocityModifier3D", "set_root_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** LimitAngularVelocityModifier3D.get_root_bone */
  final def getRootBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("LimitAngularVelocityModifier3D", "get_root_bone", 923996154L), hostObject.objectPtr, index)

  /** LimitAngularVelocityModifier3D.set_end_bone_name */
  final def setEndBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("LimitAngularVelocityModifier3D", "set_end_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** LimitAngularVelocityModifier3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("LimitAngularVelocityModifier3D", "get_end_bone_name", 844755477L), hostObject.objectPtr, index)

  /** LimitAngularVelocityModifier3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LimitAngularVelocityModifier3D", "set_end_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** LimitAngularVelocityModifier3D.get_end_bone */
  final def getEndBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("LimitAngularVelocityModifier3D", "get_end_bone", 923996154L), hostObject.objectPtr, index)

  /** LimitAngularVelocityModifier3D.set_chain_count */
  final def setChainCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LimitAngularVelocityModifier3D", "set_chain_count", 1286410249L), hostObject.objectPtr, count)

  /** LimitAngularVelocityModifier3D.get_chain_count */
  final def getChainCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("LimitAngularVelocityModifier3D", "get_chain_count", 3905245786L), hostObject.objectPtr)

  /** LimitAngularVelocityModifier3D.clear_chains */
  final def clearChains(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LimitAngularVelocityModifier3D", "clear_chains", 3218959716L), hostObject.objectPtr)

  /** LimitAngularVelocityModifier3D.set_max_angular_velocity */
  final def setMaxAngularVelocity(angular_velocity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LimitAngularVelocityModifier3D", "set_max_angular_velocity", 373806689L), hostObject.objectPtr, angular_velocity)

  /** LimitAngularVelocityModifier3D.get_max_angular_velocity */
  final def getMaxAngularVelocity(): Double =
    Ptrcall.call0[Double](MethodBind.get("LimitAngularVelocityModifier3D", "get_max_angular_velocity", 1740695150L), hostObject.objectPtr)

  /** LimitAngularVelocityModifier3D.set_exclude */
  final def setExclude(exclude: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LimitAngularVelocityModifier3D", "set_exclude", 2586408642L), hostObject.objectPtr, exclude)

  /** LimitAngularVelocityModifier3D.is_exclude */
  final def isExclude(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LimitAngularVelocityModifier3D", "is_exclude", 36873697L), hostObject.objectPtr)

  /** LimitAngularVelocityModifier3D.reset */
  final def reset(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LimitAngularVelocityModifier3D", "reset", 3218959716L), hostObject.objectPtr)

}
