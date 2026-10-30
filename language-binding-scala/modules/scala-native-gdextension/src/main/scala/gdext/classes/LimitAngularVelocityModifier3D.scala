package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LimitAngularVelocityModifier3D`, extends `SkeletonModifier3D`. */
abstract class LimitAngularVelocityModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "LimitAngularVelocityModifier3D"

  /** LimitAngularVelocityModifier3D.set_root_bone_name */
  final def setRootBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_set_root_bone_name == null) gdext.classes.LimitAngularVelocityModifier3D.mb_set_root_bone_name = MethodBind.get("LimitAngularVelocityModifier3D", "set_root_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.LimitAngularVelocityModifier3D.mb_set_root_bone_name, livePtr, index, boneName)
  }

  /** LimitAngularVelocityModifier3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_get_root_bone_name == null) gdext.classes.LimitAngularVelocityModifier3D.mb_get_root_bone_name = MethodBind.get("LimitAngularVelocityModifier3D", "get_root_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.LimitAngularVelocityModifier3D.mb_get_root_bone_name, livePtr, index)
  }

  /** LimitAngularVelocityModifier3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_set_root_bone == null) gdext.classes.LimitAngularVelocityModifier3D.mb_set_root_bone = MethodBind.get("LimitAngularVelocityModifier3D", "set_root_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.LimitAngularVelocityModifier3D.mb_set_root_bone, livePtr, index, bone)
  }

  /** LimitAngularVelocityModifier3D.get_root_bone */
  final def getRootBone(index: Long): Long = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_get_root_bone == null) gdext.classes.LimitAngularVelocityModifier3D.mb_get_root_bone = MethodBind.get("LimitAngularVelocityModifier3D", "get_root_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.LimitAngularVelocityModifier3D.mb_get_root_bone, livePtr, index)
  }

  /** LimitAngularVelocityModifier3D.set_end_bone_name */
  final def setEndBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_set_end_bone_name == null) gdext.classes.LimitAngularVelocityModifier3D.mb_set_end_bone_name = MethodBind.get("LimitAngularVelocityModifier3D", "set_end_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.LimitAngularVelocityModifier3D.mb_set_end_bone_name, livePtr, index, boneName)
  }

  /** LimitAngularVelocityModifier3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_get_end_bone_name == null) gdext.classes.LimitAngularVelocityModifier3D.mb_get_end_bone_name = MethodBind.get("LimitAngularVelocityModifier3D", "get_end_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.LimitAngularVelocityModifier3D.mb_get_end_bone_name, livePtr, index)
  }

  /** LimitAngularVelocityModifier3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_set_end_bone == null) gdext.classes.LimitAngularVelocityModifier3D.mb_set_end_bone = MethodBind.get("LimitAngularVelocityModifier3D", "set_end_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.LimitAngularVelocityModifier3D.mb_set_end_bone, livePtr, index, bone)
  }

  /** LimitAngularVelocityModifier3D.get_end_bone */
  final def getEndBone(index: Long): Long = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_get_end_bone == null) gdext.classes.LimitAngularVelocityModifier3D.mb_get_end_bone = MethodBind.get("LimitAngularVelocityModifier3D", "get_end_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.LimitAngularVelocityModifier3D.mb_get_end_bone, livePtr, index)
  }

  /** LimitAngularVelocityModifier3D.set_chain_count */
  final def setChainCount(count: Long): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_set_chain_count == null) gdext.classes.LimitAngularVelocityModifier3D.mb_set_chain_count = MethodBind.get("LimitAngularVelocityModifier3D", "set_chain_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LimitAngularVelocityModifier3D.mb_set_chain_count, livePtr, count)
  }

  /** LimitAngularVelocityModifier3D.get_chain_count */
  final def getChainCount(): Long = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_get_chain_count == null) gdext.classes.LimitAngularVelocityModifier3D.mb_get_chain_count = MethodBind.get("LimitAngularVelocityModifier3D", "get_chain_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LimitAngularVelocityModifier3D.mb_get_chain_count, livePtr)
  }

  /** LimitAngularVelocityModifier3D.clear_chains */
  final def clearChains(): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_clear_chains == null) gdext.classes.LimitAngularVelocityModifier3D.mb_clear_chains = MethodBind.get("LimitAngularVelocityModifier3D", "clear_chains", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LimitAngularVelocityModifier3D.mb_clear_chains, livePtr)
  }

  /** LimitAngularVelocityModifier3D.set_max_angular_velocity */
  final def setMaxAngularVelocity(angularVelocity: Double): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_set_max_angular_velocity == null) gdext.classes.LimitAngularVelocityModifier3D.mb_set_max_angular_velocity = MethodBind.get("LimitAngularVelocityModifier3D", "set_max_angular_velocity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LimitAngularVelocityModifier3D.mb_set_max_angular_velocity, livePtr, angularVelocity)
  }

  /** LimitAngularVelocityModifier3D.get_max_angular_velocity */
  final def getMaxAngularVelocity(): Double = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_get_max_angular_velocity == null) gdext.classes.LimitAngularVelocityModifier3D.mb_get_max_angular_velocity = MethodBind.get("LimitAngularVelocityModifier3D", "get_max_angular_velocity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LimitAngularVelocityModifier3D.mb_get_max_angular_velocity, livePtr)
  }

  /** LimitAngularVelocityModifier3D.set_exclude */
  final def setExclude(exclude: Boolean): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_set_exclude == null) gdext.classes.LimitAngularVelocityModifier3D.mb_set_exclude = MethodBind.get("LimitAngularVelocityModifier3D", "set_exclude", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LimitAngularVelocityModifier3D.mb_set_exclude, livePtr, exclude)
  }

  /** LimitAngularVelocityModifier3D.is_exclude */
  final def isExclude(): Boolean = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_is_exclude == null) gdext.classes.LimitAngularVelocityModifier3D.mb_is_exclude = MethodBind.get("LimitAngularVelocityModifier3D", "is_exclude", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LimitAngularVelocityModifier3D.mb_is_exclude, livePtr)
  }

  /** LimitAngularVelocityModifier3D.reset */
  final def reset(): Unit = {
    if (gdext.classes.LimitAngularVelocityModifier3D.mb_reset == null) gdext.classes.LimitAngularVelocityModifier3D.mb_reset = MethodBind.get("LimitAngularVelocityModifier3D", "reset", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LimitAngularVelocityModifier3D.mb_reset, livePtr)
  }

}

object LimitAngularVelocityModifier3D {
  private[classes] var mb_set_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_chain_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_chain_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_chains: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exclude: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_exclude: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset: GDExtensionMethodBindPtr = null
}
