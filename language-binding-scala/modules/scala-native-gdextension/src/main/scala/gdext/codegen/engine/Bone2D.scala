package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Bone2D`, extends `Node2D`. */
abstract class Bone2D extends Node2D {

  /** Bone2D.set_rest */
  final def setRest(rest: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Bone2D", "set_rest", 2761652528L), hostObject.objectPtr, rest)

  /** Bone2D.get_rest */
  final def getRest(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("Bone2D", "get_rest", 3814499831L), hostObject.objectPtr)

  /** Bone2D.apply_rest */
  final def applyRest(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Bone2D", "apply_rest", 3218959716L), hostObject.objectPtr)

  /** Bone2D.get_skeleton_rest */
  final def getSkeletonRest(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("Bone2D", "get_skeleton_rest", 3814499831L), hostObject.objectPtr)

  /** Bone2D.get_index_in_skeleton */
  final def getIndexInSkeleton(): Long =
    Ptrcall.call0[Long](MethodBind.get("Bone2D", "get_index_in_skeleton", 3905245786L), hostObject.objectPtr)

  /** Bone2D.set_autocalculate_length_and_angle */
  final def setAutocalculateLengthAndAngle(auto_calculate: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Bone2D", "set_autocalculate_length_and_angle", 2586408642L), hostObject.objectPtr, auto_calculate)

  /** Bone2D.get_autocalculate_length_and_angle */
  final def getAutocalculateLengthAndAngle(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Bone2D", "get_autocalculate_length_and_angle", 36873697L), hostObject.objectPtr)

  /** Bone2D.set_length */
  final def setLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Bone2D", "set_length", 373806689L), hostObject.objectPtr, length)

  /** Bone2D.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Bone2D", "get_length", 1740695150L), hostObject.objectPtr)

  /** Bone2D.set_bone_angle */
  final def setBoneAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Bone2D", "set_bone_angle", 373806689L), hostObject.objectPtr, angle)

  /** Bone2D.get_bone_angle */
  final def getBoneAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("Bone2D", "get_bone_angle", 1740695150L), hostObject.objectPtr)

}

object Bone2D {
  /** Class metadata for Gd[Bone2D] lifetime management and casting. */
  given GodotClass[Bone2D] with {
    def className = "Bone2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Bone2D = new Bone2D {}.withHost(o.objectPtr)
    def unwrap(t: Bone2D): GodotObject = t.hostObject
  }
}
