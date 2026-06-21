package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsShapeQueryParameters3D`, extends `RefCounted`. */
abstract class PhysicsShapeQueryParameters3D extends RefCounted {

  /** PhysicsShapeQueryParameters3D.set_shape */
  final def setShape(shape: Resource): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters3D", "set_shape", 968641751L), hostObject.objectPtr, shape.hostObject)

  /** PhysicsShapeQueryParameters3D.get_shape */
  final def getShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PhysicsShapeQueryParameters3D", "get_shape", 121922552L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters3D.set_transform */
  final def setTransform(transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters3D", "set_transform", 2952846383L), hostObject.objectPtr, transform)

  /** PhysicsShapeQueryParameters3D.get_transform */
  final def getTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("PhysicsShapeQueryParameters3D", "get_transform", 3229777777L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters3D.set_motion */
  final def setMotion(motion: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters3D", "set_motion", 3460891852L), hostObject.objectPtr, motion)

  /** PhysicsShapeQueryParameters3D.get_motion */
  final def getMotion(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicsShapeQueryParameters3D", "get_motion", 3360562783L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters3D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters3D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** PhysicsShapeQueryParameters3D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsShapeQueryParameters3D", "get_margin", 1740695150L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters3D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** PhysicsShapeQueryParameters3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsShapeQueryParameters3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters3D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsShapeQueryParameters3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsShapeQueryParameters3D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters3D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsShapeQueryParameters3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsShapeQueryParameters3D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

}

object PhysicsShapeQueryParameters3D {
  /** Class metadata for Gd[PhysicsShapeQueryParameters3D] lifetime management and casting. */
  given GodotClass[PhysicsShapeQueryParameters3D] with {
    def className = "PhysicsShapeQueryParameters3D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsShapeQueryParameters3D = new PhysicsShapeQueryParameters3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsShapeQueryParameters3D): GodotObject = t.hostObject
  }
}
