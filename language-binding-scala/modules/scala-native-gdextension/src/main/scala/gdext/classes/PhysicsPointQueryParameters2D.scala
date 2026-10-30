package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsPointQueryParameters2D`, extends `RefCounted`. */
abstract class PhysicsPointQueryParameters2D extends RefCounted {
  override def godotClassName: String = "PhysicsPointQueryParameters2D"

  /** PhysicsPointQueryParameters2D.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_set_position == null) gdext.classes.PhysicsPointQueryParameters2D.mb_set_position = MethodBind.get("PhysicsPointQueryParameters2D", "set_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters2D.mb_set_position, livePtr, position)
  }

  /** PhysicsPointQueryParameters2D.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_get_position == null) gdext.classes.PhysicsPointQueryParameters2D.mb_get_position = MethodBind.get("PhysicsPointQueryParameters2D", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsPointQueryParameters2D.mb_get_position, livePtr)
  }

  /** PhysicsPointQueryParameters2D.set_canvas_instance_id */
  final def setCanvasInstanceId(canvasInstanceId: Long): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_set_canvas_instance_id == null) gdext.classes.PhysicsPointQueryParameters2D.mb_set_canvas_instance_id = MethodBind.get("PhysicsPointQueryParameters2D", "set_canvas_instance_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters2D.mb_set_canvas_instance_id, livePtr, canvasInstanceId)
  }

  /** PhysicsPointQueryParameters2D.get_canvas_instance_id */
  final def getCanvasInstanceId(): Long = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_get_canvas_instance_id == null) gdext.classes.PhysicsPointQueryParameters2D.mb_get_canvas_instance_id = MethodBind.get("PhysicsPointQueryParameters2D", "get_canvas_instance_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsPointQueryParameters2D.mb_get_canvas_instance_id, livePtr)
  }

  /** PhysicsPointQueryParameters2D.set_collision_mask */
  final def setCollisionMask(collisionMask: Long): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_set_collision_mask == null) gdext.classes.PhysicsPointQueryParameters2D.mb_set_collision_mask = MethodBind.get("PhysicsPointQueryParameters2D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters2D.mb_set_collision_mask, livePtr, collisionMask)
  }

  /** PhysicsPointQueryParameters2D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_get_collision_mask == null) gdext.classes.PhysicsPointQueryParameters2D.mb_get_collision_mask = MethodBind.get("PhysicsPointQueryParameters2D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsPointQueryParameters2D.mb_get_collision_mask, livePtr)
  }

  /** PhysicsPointQueryParameters2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_set_collide_with_bodies == null) gdext.classes.PhysicsPointQueryParameters2D.mb_set_collide_with_bodies = MethodBind.get("PhysicsPointQueryParameters2D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters2D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** PhysicsPointQueryParameters2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_is_collide_with_bodies_enabled == null) gdext.classes.PhysicsPointQueryParameters2D.mb_is_collide_with_bodies_enabled = MethodBind.get("PhysicsPointQueryParameters2D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsPointQueryParameters2D.mb_is_collide_with_bodies_enabled, livePtr)
  }

  /** PhysicsPointQueryParameters2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_set_collide_with_areas == null) gdext.classes.PhysicsPointQueryParameters2D.mb_set_collide_with_areas = MethodBind.get("PhysicsPointQueryParameters2D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsPointQueryParameters2D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** PhysicsPointQueryParameters2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.PhysicsPointQueryParameters2D.mb_is_collide_with_areas_enabled == null) gdext.classes.PhysicsPointQueryParameters2D.mb_is_collide_with_areas_enabled = MethodBind.get("PhysicsPointQueryParameters2D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsPointQueryParameters2D.mb_is_collide_with_areas_enabled, livePtr)
  }

}

object PhysicsPointQueryParameters2D {
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_canvas_instance_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_canvas_instance_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_bodies_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_areas_enabled: GDExtensionMethodBindPtr = null
}
