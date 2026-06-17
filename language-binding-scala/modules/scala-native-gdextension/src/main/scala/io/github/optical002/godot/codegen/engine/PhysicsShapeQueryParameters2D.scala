package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsShapeQueryParameters2D`, extends `RefCounted`. */
abstract class PhysicsShapeQueryParameters2D extends RefCounted {

  /** PhysicsShapeQueryParameters2D.set_shape */
  final def setShape(shape: Resource): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters2D", "set_shape", 968641751L), hostObject.objectPtr, shape.hostObject)

  /** PhysicsShapeQueryParameters2D.get_shape */
  final def getShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PhysicsShapeQueryParameters2D", "get_shape", 121922552L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters2D.set_transform */
  final def setTransform(transform: io.github.optical002.godot.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters2D", "set_transform", 2761652528L), hostObject.objectPtr, transform)

  /** PhysicsShapeQueryParameters2D.get_transform */
  final def getTransform(): io.github.optical002.godot.builtin.Transform2D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform2D](MethodBind.get("PhysicsShapeQueryParameters2D", "get_transform", 3814499831L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters2D.set_motion */
  final def setMotion(motion: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters2D", "set_motion", 743155724L), hostObject.objectPtr, motion)

  /** PhysicsShapeQueryParameters2D.get_motion */
  final def getMotion(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("PhysicsShapeQueryParameters2D", "get_motion", 3341600327L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters2D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters2D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** PhysicsShapeQueryParameters2D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsShapeQueryParameters2D", "get_margin", 1740695150L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters2D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters2D", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** PhysicsShapeQueryParameters2D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsShapeQueryParameters2D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters2D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsShapeQueryParameters2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsShapeQueryParameters2D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsShapeQueryParameters2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsShapeQueryParameters2D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsShapeQueryParameters2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsShapeQueryParameters2D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

}

object PhysicsShapeQueryParameters2D {
  /** Class metadata for Gd[PhysicsShapeQueryParameters2D] lifetime management and casting. */
  given GodotClass[PhysicsShapeQueryParameters2D] with {
    def className = "PhysicsShapeQueryParameters2D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsShapeQueryParameters2D = new PhysicsShapeQueryParameters2D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsShapeQueryParameters2D): GodotObject = t.hostObject
  }
}
