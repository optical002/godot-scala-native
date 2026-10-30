package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsRayQueryParameters3D`, extends `RefCounted`. */
abstract class PhysicsRayQueryParameters3D extends RefCounted {
  override def godotClassName: String = "PhysicsRayQueryParameters3D"

  /** PhysicsRayQueryParameters3D.set_from */
  final def setFrom(from: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_set_from == null) gdext.classes.PhysicsRayQueryParameters3D.mb_set_from = MethodBind.get("PhysicsRayQueryParameters3D", "set_from", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicsRayQueryParameters3D.mb_set_from, livePtr, from)
  }

  /** PhysicsRayQueryParameters3D.get_from */
  final def getFrom(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_get_from == null) gdext.classes.PhysicsRayQueryParameters3D.mb_get_from = MethodBind.get("PhysicsRayQueryParameters3D", "get_from", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicsRayQueryParameters3D.mb_get_from, livePtr)
  }

  /** PhysicsRayQueryParameters3D.set_to */
  final def setTo(to: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_set_to == null) gdext.classes.PhysicsRayQueryParameters3D.mb_set_to = MethodBind.get("PhysicsRayQueryParameters3D", "set_to", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicsRayQueryParameters3D.mb_set_to, livePtr, to)
  }

  /** PhysicsRayQueryParameters3D.get_to */
  final def getTo(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_get_to == null) gdext.classes.PhysicsRayQueryParameters3D.mb_get_to = MethodBind.get("PhysicsRayQueryParameters3D", "get_to", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicsRayQueryParameters3D.mb_get_to, livePtr)
  }

  /** PhysicsRayQueryParameters3D.set_collision_mask */
  final def setCollisionMask(collisionMask: Long): Unit = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_set_collision_mask == null) gdext.classes.PhysicsRayQueryParameters3D.mb_set_collision_mask = MethodBind.get("PhysicsRayQueryParameters3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsRayQueryParameters3D.mb_set_collision_mask, livePtr, collisionMask)
  }

  /** PhysicsRayQueryParameters3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_get_collision_mask == null) gdext.classes.PhysicsRayQueryParameters3D.mb_get_collision_mask = MethodBind.get("PhysicsRayQueryParameters3D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsRayQueryParameters3D.mb_get_collision_mask, livePtr)
  }

  /** PhysicsRayQueryParameters3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_set_collide_with_bodies == null) gdext.classes.PhysicsRayQueryParameters3D.mb_set_collide_with_bodies = MethodBind.get("PhysicsRayQueryParameters3D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsRayQueryParameters3D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** PhysicsRayQueryParameters3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_is_collide_with_bodies_enabled == null) gdext.classes.PhysicsRayQueryParameters3D.mb_is_collide_with_bodies_enabled = MethodBind.get("PhysicsRayQueryParameters3D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsRayQueryParameters3D.mb_is_collide_with_bodies_enabled, livePtr)
  }

  /** PhysicsRayQueryParameters3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_set_collide_with_areas == null) gdext.classes.PhysicsRayQueryParameters3D.mb_set_collide_with_areas = MethodBind.get("PhysicsRayQueryParameters3D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsRayQueryParameters3D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** PhysicsRayQueryParameters3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_is_collide_with_areas_enabled == null) gdext.classes.PhysicsRayQueryParameters3D.mb_is_collide_with_areas_enabled = MethodBind.get("PhysicsRayQueryParameters3D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsRayQueryParameters3D.mb_is_collide_with_areas_enabled, livePtr)
  }

  /** PhysicsRayQueryParameters3D.set_hit_from_inside */
  final def setHitFromInside(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_set_hit_from_inside == null) gdext.classes.PhysicsRayQueryParameters3D.mb_set_hit_from_inside = MethodBind.get("PhysicsRayQueryParameters3D", "set_hit_from_inside", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsRayQueryParameters3D.mb_set_hit_from_inside, livePtr, enable)
  }

  /** PhysicsRayQueryParameters3D.is_hit_from_inside_enabled */
  final def isHitFromInsideEnabled(): Boolean = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_is_hit_from_inside_enabled == null) gdext.classes.PhysicsRayQueryParameters3D.mb_is_hit_from_inside_enabled = MethodBind.get("PhysicsRayQueryParameters3D", "is_hit_from_inside_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsRayQueryParameters3D.mb_is_hit_from_inside_enabled, livePtr)
  }

  /** PhysicsRayQueryParameters3D.set_hit_back_faces */
  final def setHitBackFaces(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_set_hit_back_faces == null) gdext.classes.PhysicsRayQueryParameters3D.mb_set_hit_back_faces = MethodBind.get("PhysicsRayQueryParameters3D", "set_hit_back_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsRayQueryParameters3D.mb_set_hit_back_faces, livePtr, enable)
  }

  /** PhysicsRayQueryParameters3D.is_hit_back_faces_enabled */
  final def isHitBackFacesEnabled(): Boolean = {
    if (gdext.classes.PhysicsRayQueryParameters3D.mb_is_hit_back_faces_enabled == null) gdext.classes.PhysicsRayQueryParameters3D.mb_is_hit_back_faces_enabled = MethodBind.get("PhysicsRayQueryParameters3D", "is_hit_back_faces_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsRayQueryParameters3D.mb_is_hit_back_faces_enabled, livePtr)
  }

}

object PhysicsRayQueryParameters3D {
  private[classes] var mb_set_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_bodies_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_areas_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hit_from_inside: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hit_from_inside_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hit_back_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hit_back_faces_enabled: GDExtensionMethodBindPtr = null
}
