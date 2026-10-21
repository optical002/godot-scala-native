package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonIK3D`, extends `SkeletonModifier3D`. */
abstract class SkeletonIK3D extends SkeletonModifier3D {
  override def godotClassName: String = "SkeletonIK3D"

  /** SkeletonIK3D.set_root_bone */
  final def setRootBone(root_bone: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_root_bone == null) gdext.classes.SkeletonIK3D.mb_set_root_bone = MethodBind.get("SkeletonIK3D", "set_root_bone", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_root_bone, livePtr, root_bone)
  }

  /** SkeletonIK3D.get_root_bone */
  final def getRootBone(): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonIK3D.mb_get_root_bone == null) gdext.classes.SkeletonIK3D.mb_get_root_bone = MethodBind.get("SkeletonIK3D", "get_root_bone", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.SkeletonIK3D.mb_get_root_bone, livePtr)
  }

  /** SkeletonIK3D.set_tip_bone */
  final def setTipBone(tip_bone: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_tip_bone == null) gdext.classes.SkeletonIK3D.mb_set_tip_bone = MethodBind.get("SkeletonIK3D", "set_tip_bone", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_tip_bone, livePtr, tip_bone)
  }

  /** SkeletonIK3D.get_tip_bone */
  final def getTipBone(): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonIK3D.mb_get_tip_bone == null) gdext.classes.SkeletonIK3D.mb_get_tip_bone = MethodBind.get("SkeletonIK3D", "get_tip_bone", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.SkeletonIK3D.mb_get_tip_bone, livePtr)
  }

  /** SkeletonIK3D.set_target_transform */
  final def setTargetTransform(target: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_target_transform == null) gdext.classes.SkeletonIK3D.mb_set_target_transform = MethodBind.get("SkeletonIK3D", "set_target_transform", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_target_transform, livePtr, target)
  }

  /** SkeletonIK3D.get_target_transform */
  final def getTargetTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.SkeletonIK3D.mb_get_target_transform == null) gdext.classes.SkeletonIK3D.mb_get_target_transform = MethodBind.get("SkeletonIK3D", "get_target_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.SkeletonIK3D.mb_get_target_transform, livePtr)
  }

  /** SkeletonIK3D.set_override_tip_basis */
  final def setOverrideTipBasis(`override`: Boolean): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_override_tip_basis == null) gdext.classes.SkeletonIK3D.mb_set_override_tip_basis = MethodBind.get("SkeletonIK3D", "set_override_tip_basis", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_override_tip_basis, livePtr, `override`)
  }

  /** SkeletonIK3D.is_override_tip_basis */
  final def isOverrideTipBasis(): Boolean = {
    if (gdext.classes.SkeletonIK3D.mb_is_override_tip_basis == null) gdext.classes.SkeletonIK3D.mb_is_override_tip_basis = MethodBind.get("SkeletonIK3D", "is_override_tip_basis", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonIK3D.mb_is_override_tip_basis, livePtr)
  }

  /** SkeletonIK3D.set_use_magnet */
  final def setUseMagnet(use: Boolean): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_use_magnet == null) gdext.classes.SkeletonIK3D.mb_set_use_magnet = MethodBind.get("SkeletonIK3D", "set_use_magnet", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_use_magnet, livePtr, use)
  }

  /** SkeletonIK3D.is_using_magnet */
  final def isUsingMagnet(): Boolean = {
    if (gdext.classes.SkeletonIK3D.mb_is_using_magnet == null) gdext.classes.SkeletonIK3D.mb_is_using_magnet = MethodBind.get("SkeletonIK3D", "is_using_magnet", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonIK3D.mb_is_using_magnet, livePtr)
  }

  /** SkeletonIK3D.set_magnet_position */
  final def setMagnetPosition(local_position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_magnet_position == null) gdext.classes.SkeletonIK3D.mb_set_magnet_position = MethodBind.get("SkeletonIK3D", "set_magnet_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_magnet_position, livePtr, local_position)
  }

  /** SkeletonIK3D.get_magnet_position */
  final def getMagnetPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.SkeletonIK3D.mb_get_magnet_position == null) gdext.classes.SkeletonIK3D.mb_get_magnet_position = MethodBind.get("SkeletonIK3D", "get_magnet_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.SkeletonIK3D.mb_get_magnet_position, livePtr)
  }

  /** SkeletonIK3D.get_parent_skeleton */
  final def getParentSkeleton(): Skeleton3D = {
    if (gdext.classes.SkeletonIK3D.mb_get_parent_skeleton == null) gdext.classes.SkeletonIK3D.mb_get_parent_skeleton = MethodBind.get("SkeletonIK3D", "get_parent_skeleton", 1488626673L)
    Wrappers.borrowed[Skeleton3D](Ptrcall.call0[Long](gdext.classes.SkeletonIK3D.mb_get_parent_skeleton, livePtr))
  }

  /** SkeletonIK3D.is_running */
  final def isRunning(): Boolean = {
    if (gdext.classes.SkeletonIK3D.mb_is_running == null) gdext.classes.SkeletonIK3D.mb_is_running = MethodBind.get("SkeletonIK3D", "is_running", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonIK3D.mb_is_running, livePtr)
  }

  /** SkeletonIK3D.set_min_distance */
  final def setMinDistance(min_distance: Double): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_min_distance == null) gdext.classes.SkeletonIK3D.mb_set_min_distance = MethodBind.get("SkeletonIK3D", "set_min_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_min_distance, livePtr, min_distance)
  }

  /** SkeletonIK3D.get_min_distance */
  final def getMinDistance(): Double = {
    if (gdext.classes.SkeletonIK3D.mb_get_min_distance == null) gdext.classes.SkeletonIK3D.mb_get_min_distance = MethodBind.get("SkeletonIK3D", "get_min_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonIK3D.mb_get_min_distance, livePtr)
  }

  /** SkeletonIK3D.set_max_iterations */
  final def setMaxIterations(iterations: Long): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_max_iterations == null) gdext.classes.SkeletonIK3D.mb_set_max_iterations = MethodBind.get("SkeletonIK3D", "set_max_iterations", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_max_iterations, livePtr, iterations)
  }

  /** SkeletonIK3D.get_max_iterations */
  final def getMaxIterations(): Long = {
    if (gdext.classes.SkeletonIK3D.mb_get_max_iterations == null) gdext.classes.SkeletonIK3D.mb_get_max_iterations = MethodBind.get("SkeletonIK3D", "get_max_iterations", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SkeletonIK3D.mb_get_max_iterations, livePtr)
  }

  /** SkeletonIK3D.start */
  final def start(one_time: Boolean): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_start == null) gdext.classes.SkeletonIK3D.mb_start = MethodBind.get("SkeletonIK3D", "start", 107499316L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_start, livePtr, one_time)
  }

  /** SkeletonIK3D.stop */
  final def stop(): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_stop == null) gdext.classes.SkeletonIK3D.mb_stop = MethodBind.get("SkeletonIK3D", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SkeletonIK3D.mb_stop, livePtr)
  }

  /** SkeletonIK3D.set_interpolation */
  final def setInterpolation(interpolation: Double): Unit = {
    if (gdext.classes.SkeletonIK3D.mb_set_interpolation == null) gdext.classes.SkeletonIK3D.mb_set_interpolation = MethodBind.get("SkeletonIK3D", "set_interpolation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonIK3D.mb_set_interpolation, livePtr, interpolation)
  }

  /** SkeletonIK3D.get_interpolation */
  final def getInterpolation(): Double = {
    if (gdext.classes.SkeletonIK3D.mb_get_interpolation == null) gdext.classes.SkeletonIK3D.mb_get_interpolation = MethodBind.get("SkeletonIK3D", "get_interpolation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonIK3D.mb_get_interpolation, livePtr)
  }

}

object SkeletonIK3D {
  private[classes] var mb_set_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tip_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tip_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_override_tip_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_override_tip_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_magnet: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_magnet: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_magnet_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_magnet_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_running: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_iterations: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_iterations: GDExtensionMethodBindPtr = null
  private[classes] var mb_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interpolation: GDExtensionMethodBindPtr = null
}
