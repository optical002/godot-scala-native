package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SpringArm3D`, extends `Node3D`. */
abstract class SpringArm3D extends Node3D {

  /** SpringArm3D.get_hit_length */
  final def getHitLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpringArm3D", "get_hit_length", 191475506L), hostObject.objectPtr)

  /** SpringArm3D.set_length */
  final def setLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringArm3D", "set_length", 373806689L), hostObject.objectPtr, length)

  /** SpringArm3D.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpringArm3D", "get_length", 1740695150L), hostObject.objectPtr)

  /** SpringArm3D.set_shape */
  final def setShape(shape: Shape3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringArm3D", "set_shape", 1549710052L), hostObject.objectPtr, shape.hostObject)

  /** SpringArm3D.get_shape */
  final def getShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SpringArm3D", "get_shape", 3214262478L), hostObject.objectPtr)

  /** SpringArm3D.clear_excluded_objects */
  final def clearExcludedObjects(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SpringArm3D", "clear_excluded_objects", 3218959716L), hostObject.objectPtr)

  /** SpringArm3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringArm3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** SpringArm3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpringArm3D", "get_collision_mask", 2455072627L), hostObject.objectPtr)

  /** SpringArm3D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringArm3D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** SpringArm3D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpringArm3D", "get_margin", 191475506L), hostObject.objectPtr)

}

object SpringArm3D {
  /** Class metadata for Gd[SpringArm3D] lifetime management and casting. */
  given GodotClass[SpringArm3D] with {
    def className = "SpringArm3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpringArm3D = new SpringArm3D {}.withHost(o.objectPtr)
    def unwrap(t: SpringArm3D): GodotObject = t.hostObject
  }
}
