package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Skeleton2D`, extends `Node2D`. */
abstract class Skeleton2D extends Node2D {

  /** Skeleton2D.get_bone_count */
  final def getBoneCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Skeleton2D", "get_bone_count", 3905245786L), hostObject.objectPtr)

  /** Skeleton2D.get_bone */
  final def getBone(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Skeleton2D", "get_bone", 2556267111L), hostObject.objectPtr, idx)

  /** Skeleton2D.set_modification_stack */
  final def setModificationStack(modification_stack: SkeletonModificationStack2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton2D", "set_modification_stack", 3907307132L), hostObject.objectPtr, modification_stack.hostObject)

  /** Skeleton2D.get_modification_stack */
  final def getModificationStack(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Skeleton2D", "get_modification_stack", 2107508396L), hostObject.objectPtr)

  /** Skeleton2D.execute_modifications */
  final def executeModifications(delta: Double, execution_mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton2D", "execute_modifications", 1005356550L), hostObject.objectPtr, delta, execution_mode)

  /** Skeleton2D.set_bone_local_pose_override */
  final def setBoneLocalPoseOverride(bone_idx: Long, override_pose: gdext.builtin.Transform2D, strength: Double, persistent: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("Skeleton2D", "set_bone_local_pose_override", 555457532L), hostObject.objectPtr, bone_idx, override_pose, strength, persistent)

  /** Skeleton2D.get_bone_local_pose_override */
  final def getBoneLocalPoseOverride(bone_idx: Long): gdext.builtin.Transform2D =
    Ptrcall.call1[Long, gdext.builtin.Transform2D](MethodBind.get("Skeleton2D", "get_bone_local_pose_override", 2995540667L), hostObject.objectPtr, bone_idx)

}

object Skeleton2D {
  /** Class metadata for Gd[Skeleton2D] lifetime management and casting. */
  given GodotClass[Skeleton2D] with {
    def className = "Skeleton2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Skeleton2D = new Skeleton2D {}.withHost(o.objectPtr)
    def unwrap(t: Skeleton2D): GodotObject = t.hostObject
  }
}
