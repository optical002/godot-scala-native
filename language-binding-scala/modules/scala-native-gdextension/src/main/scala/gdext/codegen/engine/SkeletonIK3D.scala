package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonIK3D`, extends `SkeletonModifier3D`. */
abstract class SkeletonIK3D extends SkeletonModifier3D {

  /** SkeletonIK3D.set_root_bone */
  final def setRootBone(root_bone: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_root_bone", 3304788590L), hostObject.objectPtr, root_bone)

  /** SkeletonIK3D.get_root_bone */
  final def getRootBone(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("SkeletonIK3D", "get_root_bone", 2002593661L), hostObject.objectPtr)

  /** SkeletonIK3D.set_tip_bone */
  final def setTipBone(tip_bone: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_tip_bone", 3304788590L), hostObject.objectPtr, tip_bone)

  /** SkeletonIK3D.get_tip_bone */
  final def getTipBone(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("SkeletonIK3D", "get_tip_bone", 2002593661L), hostObject.objectPtr)

  /** SkeletonIK3D.set_target_transform */
  final def setTargetTransform(target: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_target_transform", 2952846383L), hostObject.objectPtr, target)

  /** SkeletonIK3D.get_target_transform */
  final def getTargetTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("SkeletonIK3D", "get_target_transform", 3229777777L), hostObject.objectPtr)

  /** SkeletonIK3D.set_override_tip_basis */
  final def setOverrideTipBasis(`override`: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_override_tip_basis", 2586408642L), hostObject.objectPtr, `override`)

  /** SkeletonIK3D.is_override_tip_basis */
  final def isOverrideTipBasis(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonIK3D", "is_override_tip_basis", 36873697L), hostObject.objectPtr)

  /** SkeletonIK3D.set_use_magnet */
  final def setUseMagnet(use: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_use_magnet", 2586408642L), hostObject.objectPtr, use)

  /** SkeletonIK3D.is_using_magnet */
  final def isUsingMagnet(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonIK3D", "is_using_magnet", 36873697L), hostObject.objectPtr)

  /** SkeletonIK3D.set_magnet_position */
  final def setMagnetPosition(local_position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_magnet_position", 3460891852L), hostObject.objectPtr, local_position)

  /** SkeletonIK3D.get_magnet_position */
  final def getMagnetPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("SkeletonIK3D", "get_magnet_position", 3360562783L), hostObject.objectPtr)

  /** SkeletonIK3D.get_parent_skeleton */
  final def getParentSkeleton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkeletonIK3D", "get_parent_skeleton", 1488626673L), hostObject.objectPtr)

  /** SkeletonIK3D.is_running */
  final def isRunning(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonIK3D", "is_running", 2240911060L), hostObject.objectPtr)

  /** SkeletonIK3D.set_min_distance */
  final def setMinDistance(min_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_min_distance", 373806689L), hostObject.objectPtr, min_distance)

  /** SkeletonIK3D.get_min_distance */
  final def getMinDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonIK3D", "get_min_distance", 1740695150L), hostObject.objectPtr)

  /** SkeletonIK3D.set_max_iterations */
  final def setMaxIterations(iterations: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_max_iterations", 1286410249L), hostObject.objectPtr, iterations)

  /** SkeletonIK3D.get_max_iterations */
  final def getMaxIterations(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonIK3D", "get_max_iterations", 3905245786L), hostObject.objectPtr)

  /** SkeletonIK3D.start */
  final def start(one_time: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "start", 107499316L), hostObject.objectPtr, one_time)

  /** SkeletonIK3D.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SkeletonIK3D", "stop", 3218959716L), hostObject.objectPtr)

  /** SkeletonIK3D.set_interpolation */
  final def setInterpolation(interpolation: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonIK3D", "set_interpolation", 373806689L), hostObject.objectPtr, interpolation)

  /** SkeletonIK3D.get_interpolation */
  final def getInterpolation(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonIK3D", "get_interpolation", 1740695150L), hostObject.objectPtr)

}

object SkeletonIK3D {
  /** Class metadata for Gd[SkeletonIK3D] lifetime management and casting. */
  given GodotClass[SkeletonIK3D] with {
    def className = "SkeletonIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SkeletonIK3D = new SkeletonIK3D {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonIK3D): GodotObject = t.hostObject
  }
}
