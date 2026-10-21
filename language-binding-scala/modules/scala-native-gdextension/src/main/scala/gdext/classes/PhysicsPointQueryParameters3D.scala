package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsPointQueryParameters3D`, extends `RefCounted`. */
abstract class PhysicsPointQueryParameters3D extends RefCounted {
  override def godotClassName: String = "PhysicsPointQueryParameters3D"

  /** PhysicsPointQueryParameters3D.set_position */
  final def setPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_set_position == null) gdext.classes.PhysicsPointQueryParameters3D.mb_set_position = MethodBind.get("PhysicsPointQueryParameters3D", "set_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters3D.mb_set_position, livePtr, position)
  }

  /** PhysicsPointQueryParameters3D.get_position */
  final def getPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_get_position == null) gdext.classes.PhysicsPointQueryParameters3D.mb_get_position = MethodBind.get("PhysicsPointQueryParameters3D", "get_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicsPointQueryParameters3D.mb_get_position, livePtr)
  }

  /** PhysicsPointQueryParameters3D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_set_collision_mask == null) gdext.classes.PhysicsPointQueryParameters3D.mb_set_collision_mask = MethodBind.get("PhysicsPointQueryParameters3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters3D.mb_set_collision_mask, livePtr, collision_mask)
  }

  /** PhysicsPointQueryParameters3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_get_collision_mask == null) gdext.classes.PhysicsPointQueryParameters3D.mb_get_collision_mask = MethodBind.get("PhysicsPointQueryParameters3D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsPointQueryParameters3D.mb_get_collision_mask, livePtr)
  }

  /** PhysicsPointQueryParameters3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_set_collide_with_bodies == null) gdext.classes.PhysicsPointQueryParameters3D.mb_set_collide_with_bodies = MethodBind.get("PhysicsPointQueryParameters3D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters3D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** PhysicsPointQueryParameters3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_is_collide_with_bodies_enabled == null) gdext.classes.PhysicsPointQueryParameters3D.mb_is_collide_with_bodies_enabled = MethodBind.get("PhysicsPointQueryParameters3D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsPointQueryParameters3D.mb_is_collide_with_bodies_enabled, livePtr)
  }

  /** PhysicsPointQueryParameters3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_set_collide_with_areas == null) gdext.classes.PhysicsPointQueryParameters3D.mb_set_collide_with_areas = MethodBind.get("PhysicsPointQueryParameters3D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters3D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** PhysicsPointQueryParameters3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.PhysicsPointQueryParameters3D.mb_is_collide_with_areas_enabled == null) gdext.classes.PhysicsPointQueryParameters3D.mb_is_collide_with_areas_enabled = MethodBind.get("PhysicsPointQueryParameters3D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsPointQueryParameters3D.mb_is_collide_with_areas_enabled, livePtr)
  }

}

object PhysicsPointQueryParameters3D {
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_bodies_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_areas_enabled: GDExtensionMethodBindPtr = null
}
