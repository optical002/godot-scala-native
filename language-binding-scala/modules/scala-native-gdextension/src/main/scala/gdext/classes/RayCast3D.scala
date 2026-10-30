package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RayCast3D`, extends `Node3D`. */
abstract class RayCast3D extends Node3D {
  override def godotClassName: String = "RayCast3D"

  /** RayCast3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RayCast3D.mb_set_enabled == null) gdext.classes.RayCast3D.mb_set_enabled = MethodBind.get("RayCast3D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_enabled, livePtr, enabled)
  }

  /** RayCast3D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.RayCast3D.mb_is_enabled == null) gdext.classes.RayCast3D.mb_is_enabled = MethodBind.get("RayCast3D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast3D.mb_is_enabled, livePtr)
  }

  /** RayCast3D.set_target_position */
  final def setTargetPosition(localPoint: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RayCast3D.mb_set_target_position == null) gdext.classes.RayCast3D.mb_set_target_position = MethodBind.get("RayCast3D", "set_target_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_target_position, livePtr, localPoint)
  }

  /** RayCast3D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.RayCast3D.mb_get_target_position == null) gdext.classes.RayCast3D.mb_get_target_position = MethodBind.get("RayCast3D", "get_target_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RayCast3D.mb_get_target_position, livePtr)
  }

  /** RayCast3D.is_colliding */
  final def isColliding(): Boolean = {
    if (gdext.classes.RayCast3D.mb_is_colliding == null) gdext.classes.RayCast3D.mb_is_colliding = MethodBind.get("RayCast3D", "is_colliding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast3D.mb_is_colliding, livePtr)
  }

  /** RayCast3D.force_raycast_update */
  final def forceRaycastUpdate(): Unit = {
    if (gdext.classes.RayCast3D.mb_force_raycast_update == null) gdext.classes.RayCast3D.mb_force_raycast_update = MethodBind.get("RayCast3D", "force_raycast_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RayCast3D.mb_force_raycast_update, livePtr)
  }

  /** RayCast3D.get_collider */
  final def getCollider(): Object = {
    if (gdext.classes.RayCast3D.mb_get_collider == null) gdext.classes.RayCast3D.mb_get_collider = MethodBind.get("RayCast3D", "get_collider", 1981248198L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.RayCast3D.mb_get_collider, livePtr))
  }

  /** RayCast3D.get_collider_shape */
  final def getColliderShape(): Long = {
    if (gdext.classes.RayCast3D.mb_get_collider_shape == null) gdext.classes.RayCast3D.mb_get_collider_shape = MethodBind.get("RayCast3D", "get_collider_shape", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RayCast3D.mb_get_collider_shape, livePtr)
  }

  /** RayCast3D.get_collision_point */
  final def getCollisionPoint(): gdext.builtin.Vector3 = {
    if (gdext.classes.RayCast3D.mb_get_collision_point == null) gdext.classes.RayCast3D.mb_get_collision_point = MethodBind.get("RayCast3D", "get_collision_point", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RayCast3D.mb_get_collision_point, livePtr)
  }

  /** RayCast3D.get_collision_normal */
  final def getCollisionNormal(): gdext.builtin.Vector3 = {
    if (gdext.classes.RayCast3D.mb_get_collision_normal == null) gdext.classes.RayCast3D.mb_get_collision_normal = MethodBind.get("RayCast3D", "get_collision_normal", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RayCast3D.mb_get_collision_normal, livePtr)
  }

  /** RayCast3D.get_collision_face_index */
  final def getCollisionFaceIndex(): Long = {
    if (gdext.classes.RayCast3D.mb_get_collision_face_index == null) gdext.classes.RayCast3D.mb_get_collision_face_index = MethodBind.get("RayCast3D", "get_collision_face_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RayCast3D.mb_get_collision_face_index, livePtr)
  }

  /** RayCast3D.add_exception */
  final def addException(node: CollisionObject3D): Unit = {
    if (gdext.classes.RayCast3D.mb_add_exception == null) gdext.classes.RayCast3D.mb_add_exception = MethodBind.get("RayCast3D", "add_exception", 1976431078L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_add_exception, livePtr, Wrappers.handle(node))
  }

  /** RayCast3D.remove_exception */
  final def removeException(node: CollisionObject3D): Unit = {
    if (gdext.classes.RayCast3D.mb_remove_exception == null) gdext.classes.RayCast3D.mb_remove_exception = MethodBind.get("RayCast3D", "remove_exception", 1976431078L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_remove_exception, livePtr, Wrappers.handle(node))
  }

  /** RayCast3D.clear_exceptions */
  final def clearExceptions(): Unit = {
    if (gdext.classes.RayCast3D.mb_clear_exceptions == null) gdext.classes.RayCast3D.mb_clear_exceptions = MethodBind.get("RayCast3D", "clear_exceptions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RayCast3D.mb_clear_exceptions, livePtr)
  }

  /** RayCast3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.RayCast3D.mb_set_collision_mask == null) gdext.classes.RayCast3D.mb_set_collision_mask = MethodBind.get("RayCast3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_collision_mask, livePtr, mask)
  }

  /** RayCast3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.RayCast3D.mb_get_collision_mask == null) gdext.classes.RayCast3D.mb_get_collision_mask = MethodBind.get("RayCast3D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RayCast3D.mb_get_collision_mask, livePtr)
  }

  /** RayCast3D.set_collision_mask_value */
  final def setCollisionMaskValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.RayCast3D.mb_set_collision_mask_value == null) gdext.classes.RayCast3D.mb_set_collision_mask_value = MethodBind.get("RayCast3D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.RayCast3D.mb_set_collision_mask_value, livePtr, layerNumber, value)
  }

  /** RayCast3D.get_collision_mask_value */
  final def getCollisionMaskValue(layerNumber: Long): Boolean = {
    if (gdext.classes.RayCast3D.mb_get_collision_mask_value == null) gdext.classes.RayCast3D.mb_get_collision_mask_value = MethodBind.get("RayCast3D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.RayCast3D.mb_get_collision_mask_value, livePtr, layerNumber)
  }

  /** RayCast3D.set_exclude_parent_body */
  final def setExcludeParentBody(mask: Boolean): Unit = {
    if (gdext.classes.RayCast3D.mb_set_exclude_parent_body == null) gdext.classes.RayCast3D.mb_set_exclude_parent_body = MethodBind.get("RayCast3D", "set_exclude_parent_body", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_exclude_parent_body, livePtr, mask)
  }

  /** RayCast3D.get_exclude_parent_body */
  final def getExcludeParentBody(): Boolean = {
    if (gdext.classes.RayCast3D.mb_get_exclude_parent_body == null) gdext.classes.RayCast3D.mb_get_exclude_parent_body = MethodBind.get("RayCast3D", "get_exclude_parent_body", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast3D.mb_get_exclude_parent_body, livePtr)
  }

  /** RayCast3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.RayCast3D.mb_set_collide_with_areas == null) gdext.classes.RayCast3D.mb_set_collide_with_areas = MethodBind.get("RayCast3D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** RayCast3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.RayCast3D.mb_is_collide_with_areas_enabled == null) gdext.classes.RayCast3D.mb_is_collide_with_areas_enabled = MethodBind.get("RayCast3D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast3D.mb_is_collide_with_areas_enabled, livePtr)
  }

  /** RayCast3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.RayCast3D.mb_set_collide_with_bodies == null) gdext.classes.RayCast3D.mb_set_collide_with_bodies = MethodBind.get("RayCast3D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** RayCast3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.RayCast3D.mb_is_collide_with_bodies_enabled == null) gdext.classes.RayCast3D.mb_is_collide_with_bodies_enabled = MethodBind.get("RayCast3D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast3D.mb_is_collide_with_bodies_enabled, livePtr)
  }

  /** RayCast3D.set_hit_from_inside */
  final def setHitFromInside(enable: Boolean): Unit = {
    if (gdext.classes.RayCast3D.mb_set_hit_from_inside == null) gdext.classes.RayCast3D.mb_set_hit_from_inside = MethodBind.get("RayCast3D", "set_hit_from_inside", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_hit_from_inside, livePtr, enable)
  }

  /** RayCast3D.is_hit_from_inside_enabled */
  final def isHitFromInsideEnabled(): Boolean = {
    if (gdext.classes.RayCast3D.mb_is_hit_from_inside_enabled == null) gdext.classes.RayCast3D.mb_is_hit_from_inside_enabled = MethodBind.get("RayCast3D", "is_hit_from_inside_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast3D.mb_is_hit_from_inside_enabled, livePtr)
  }

  /** RayCast3D.set_hit_back_faces */
  final def setHitBackFaces(enable: Boolean): Unit = {
    if (gdext.classes.RayCast3D.mb_set_hit_back_faces == null) gdext.classes.RayCast3D.mb_set_hit_back_faces = MethodBind.get("RayCast3D", "set_hit_back_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_hit_back_faces, livePtr, enable)
  }

  /** RayCast3D.is_hit_back_faces_enabled */
  final def isHitBackFacesEnabled(): Boolean = {
    if (gdext.classes.RayCast3D.mb_is_hit_back_faces_enabled == null) gdext.classes.RayCast3D.mb_is_hit_back_faces_enabled = MethodBind.get("RayCast3D", "is_hit_back_faces_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast3D.mb_is_hit_back_faces_enabled, livePtr)
  }

  /** RayCast3D.set_debug_shape_custom_color */
  final def setDebugShapeCustomColor(debugShapeCustomColor: gdext.builtin.Color): Unit = {
    if (gdext.classes.RayCast3D.mb_set_debug_shape_custom_color == null) gdext.classes.RayCast3D.mb_set_debug_shape_custom_color = MethodBind.get("RayCast3D", "set_debug_shape_custom_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_debug_shape_custom_color, livePtr, debugShapeCustomColor)
  }

  /** RayCast3D.get_debug_shape_custom_color */
  final def getDebugShapeCustomColor(): gdext.builtin.Color = {
    if (gdext.classes.RayCast3D.mb_get_debug_shape_custom_color == null) gdext.classes.RayCast3D.mb_get_debug_shape_custom_color = MethodBind.get("RayCast3D", "get_debug_shape_custom_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.RayCast3D.mb_get_debug_shape_custom_color, livePtr)
  }

  /** RayCast3D.set_debug_shape_thickness */
  final def setDebugShapeThickness(debugShapeThickness: Long): Unit = {
    if (gdext.classes.RayCast3D.mb_set_debug_shape_thickness == null) gdext.classes.RayCast3D.mb_set_debug_shape_thickness = MethodBind.get("RayCast3D", "set_debug_shape_thickness", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RayCast3D.mb_set_debug_shape_thickness, livePtr, debugShapeThickness)
  }

  /** RayCast3D.get_debug_shape_thickness */
  final def getDebugShapeThickness(): Long = {
    if (gdext.classes.RayCast3D.mb_get_debug_shape_thickness == null) gdext.classes.RayCast3D.mb_get_debug_shape_thickness = MethodBind.get("RayCast3D", "get_debug_shape_thickness", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RayCast3D.mb_get_debug_shape_thickness, livePtr)
  }

}

object RayCast3D {
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_colliding: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_raycast_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_face_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_exception: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_exception: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_exceptions: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exclude_parent_body: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exclude_parent_body: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_areas_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_bodies_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hit_from_inside: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hit_from_inside_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hit_back_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hit_back_faces_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_shape_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_shape_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_shape_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_shape_thickness: GDExtensionMethodBindPtr = null
}
