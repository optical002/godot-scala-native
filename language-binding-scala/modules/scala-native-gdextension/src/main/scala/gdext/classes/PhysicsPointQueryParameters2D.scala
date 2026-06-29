package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsPointQueryParameters2D`, extends `RefCounted`. */
abstract class PhysicsPointQueryParameters2D extends RefCounted {
  override def godotClassName: String = "PhysicsPointQueryParameters2D"

  /** PhysicsPointQueryParameters2D.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters2D", "set_position", 743155724L), hostObject.objectPtr, position)

  /** PhysicsPointQueryParameters2D.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsPointQueryParameters2D", "get_position", 3341600327L), hostObject.objectPtr)

  /** PhysicsPointQueryParameters2D.set_canvas_instance_id */
  final def setCanvasInstanceId(canvas_instance_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters2D", "set_canvas_instance_id", 1286410249L), hostObject.objectPtr, canvas_instance_id)

  /** PhysicsPointQueryParameters2D.get_canvas_instance_id */
  final def getCanvasInstanceId(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsPointQueryParameters2D", "get_canvas_instance_id", 3905245786L), hostObject.objectPtr)

  /** PhysicsPointQueryParameters2D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters2D", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** PhysicsPointQueryParameters2D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsPointQueryParameters2D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsPointQueryParameters2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters2D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsPointQueryParameters2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsPointQueryParameters2D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsPointQueryParameters2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters2D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsPointQueryParameters2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsPointQueryParameters2D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

}
