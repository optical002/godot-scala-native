package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RayCast3D`, extends `Node3D`. */
abstract class RayCast3D extends Node3D {

  /** RayCast3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RayCast3D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast3D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast3D.set_target_position */
  final def setTargetPosition(local_point: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_target_position", 3460891852L), hostObject.objectPtr, local_point)

  /** RayCast3D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("RayCast3D", "get_target_position", 3360562783L), hostObject.objectPtr)

  /** RayCast3D.is_colliding */
  final def isColliding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast3D", "is_colliding", 36873697L), hostObject.objectPtr)

  /** RayCast3D.force_raycast_update */
  final def forceRaycastUpdate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RayCast3D", "force_raycast_update", 3218959716L), hostObject.objectPtr)

  /** RayCast3D.get_collider */
  final def getCollider(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RayCast3D", "get_collider", 1981248198L), hostObject.objectPtr)

  /** RayCast3D.get_collider_shape */
  final def getColliderShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("RayCast3D", "get_collider_shape", 3905245786L), hostObject.objectPtr)

  /** RayCast3D.get_collision_point */
  final def getCollisionPoint(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("RayCast3D", "get_collision_point", 3360562783L), hostObject.objectPtr)

  /** RayCast3D.get_collision_normal */
  final def getCollisionNormal(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("RayCast3D", "get_collision_normal", 3360562783L), hostObject.objectPtr)

  /** RayCast3D.get_collision_face_index */
  final def getCollisionFaceIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("RayCast3D", "get_collision_face_index", 3905245786L), hostObject.objectPtr)

  /** RayCast3D.add_exception */
  final def addException(node: CollisionObject3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "add_exception", 1976431078L), hostObject.objectPtr, node.hostObject)

  /** RayCast3D.remove_exception */
  final def removeException(node: CollisionObject3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "remove_exception", 1976431078L), hostObject.objectPtr, node.hostObject)

  /** RayCast3D.clear_exceptions */
  final def clearExceptions(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RayCast3D", "clear_exceptions", 3218959716L), hostObject.objectPtr)

  /** RayCast3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** RayCast3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("RayCast3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** RayCast3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("RayCast3D", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** RayCast3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("RayCast3D", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** RayCast3D.set_exclude_parent_body */
  final def setExcludeParentBody(mask: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_exclude_parent_body", 2586408642L), hostObject.objectPtr, mask)

  /** RayCast3D.get_exclude_parent_body */
  final def getExcludeParentBody(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast3D", "get_exclude_parent_body", 36873697L), hostObject.objectPtr)

  /** RayCast3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** RayCast3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast3D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** RayCast3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast3D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast3D.set_hit_from_inside */
  final def setHitFromInside(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_hit_from_inside", 2586408642L), hostObject.objectPtr, enable)

  /** RayCast3D.is_hit_from_inside_enabled */
  final def isHitFromInsideEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast3D", "is_hit_from_inside_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast3D.set_hit_back_faces */
  final def setHitBackFaces(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_hit_back_faces", 2586408642L), hostObject.objectPtr, enable)

  /** RayCast3D.is_hit_back_faces_enabled */
  final def isHitBackFacesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast3D", "is_hit_back_faces_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast3D.set_debug_shape_custom_color */
  final def setDebugShapeCustomColor(debug_shape_custom_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_debug_shape_custom_color", 2920490490L), hostObject.objectPtr, debug_shape_custom_color)

  /** RayCast3D.get_debug_shape_custom_color */
  final def getDebugShapeCustomColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("RayCast3D", "get_debug_shape_custom_color", 3444240500L), hostObject.objectPtr)

  /** RayCast3D.set_debug_shape_thickness */
  final def setDebugShapeThickness(debug_shape_thickness: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast3D", "set_debug_shape_thickness", 1286410249L), hostObject.objectPtr, debug_shape_thickness)

  /** RayCast3D.get_debug_shape_thickness */
  final def getDebugShapeThickness(): Long =
    Ptrcall.call0[Long](MethodBind.get("RayCast3D", "get_debug_shape_thickness", 3905245786L), hostObject.objectPtr)

}

object RayCast3D {
  /** Class metadata for Gd[RayCast3D] lifetime management and casting. */
  given GodotClass[RayCast3D] with {
    def className = "RayCast3D"
    def isRefCounted = false
    def wrap(o: GodotObject): RayCast3D = new RayCast3D {}.withHost(o.objectPtr)
    def unwrap(t: RayCast3D): GodotObject = t.hostObject
  }
}
