package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModifier3D`, extends `Node3D`. */
abstract class SkeletonModifier3D extends Node3D {

  /** SkeletonModifier3D.get_skeleton */
  final def getSkeleton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkeletonModifier3D", "get_skeleton", 1488626673L), hostObject.objectPtr)

  /** SkeletonModifier3D.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModifier3D", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** SkeletonModifier3D.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModifier3D", "is_active", 36873697L), hostObject.objectPtr)

  /** SkeletonModifier3D.set_influence */
  final def setInfluence(influence: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModifier3D", "set_influence", 373806689L), hostObject.objectPtr, influence)

  /** SkeletonModifier3D.get_influence */
  final def getInfluence(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModifier3D", "get_influence", 1740695150L), hostObject.objectPtr)

}

object SkeletonModifier3D {
  /** Class metadata for Gd[SkeletonModifier3D] lifetime management and casting. */
  given GodotClass[SkeletonModifier3D] with {
    def className = "SkeletonModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SkeletonModifier3D = new SkeletonModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModifier3D): GodotObject = t.hostObject
  }
}
