package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsShapeQueryParameters2D`, extends `RefCounted`. */
abstract class PhysicsShapeQueryParameters2D extends RefCounted {
  override def godotClassName: String = "PhysicsShapeQueryParameters2D"

  /** PhysicsShapeQueryParameters2D.set_shape */
  final def setShape(shape: Resource): Unit = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_set_shape == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_set_shape = MethodBind.get("PhysicsShapeQueryParameters2D", "set_shape", 968641751L)
    Ptrcall.callVoid1(gdext.classes.PhysicsShapeQueryParameters2D.mb_set_shape, livePtr, Wrappers.handle(shape))
  }

  /** PhysicsShapeQueryParameters2D.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(): Resource = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_get_shape == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_get_shape = MethodBind.get("PhysicsShapeQueryParameters2D", "get_shape", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.PhysicsShapeQueryParameters2D.mb_get_shape, livePtr))
  }

  /** PhysicsShapeQueryParameters2D.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_set_transform == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_set_transform = MethodBind.get("PhysicsShapeQueryParameters2D", "set_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.PhysicsShapeQueryParameters2D.mb_set_transform, livePtr, transform)
  }

  /** PhysicsShapeQueryParameters2D.get_transform */
  final def getTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_get_transform == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_get_transform = MethodBind.get("PhysicsShapeQueryParameters2D", "get_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.PhysicsShapeQueryParameters2D.mb_get_transform, livePtr)
  }

  /** PhysicsShapeQueryParameters2D.set_motion */
  final def setMotion(motion: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_set_motion == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_set_motion = MethodBind.get("PhysicsShapeQueryParameters2D", "set_motion", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PhysicsShapeQueryParameters2D.mb_set_motion, livePtr, motion)
  }

  /** PhysicsShapeQueryParameters2D.get_motion */
  final def getMotion(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_get_motion == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_get_motion = MethodBind.get("PhysicsShapeQueryParameters2D", "get_motion", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsShapeQueryParameters2D.mb_get_motion, livePtr)
  }

  /** PhysicsShapeQueryParameters2D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_set_margin == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_set_margin = MethodBind.get("PhysicsShapeQueryParameters2D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsShapeQueryParameters2D.mb_set_margin, livePtr, margin)
  }

  /** PhysicsShapeQueryParameters2D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_get_margin == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_get_margin = MethodBind.get("PhysicsShapeQueryParameters2D", "get_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsShapeQueryParameters2D.mb_get_margin, livePtr)
  }

  /** PhysicsShapeQueryParameters2D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collision_mask == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collision_mask = MethodBind.get("PhysicsShapeQueryParameters2D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collision_mask, livePtr, collision_mask)
  }

  /** PhysicsShapeQueryParameters2D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_get_collision_mask == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_get_collision_mask = MethodBind.get("PhysicsShapeQueryParameters2D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsShapeQueryParameters2D.mb_get_collision_mask, livePtr)
  }

  /** PhysicsShapeQueryParameters2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collide_with_bodies == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collide_with_bodies = MethodBind.get("PhysicsShapeQueryParameters2D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** PhysicsShapeQueryParameters2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_is_collide_with_bodies_enabled == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_is_collide_with_bodies_enabled = MethodBind.get("PhysicsShapeQueryParameters2D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsShapeQueryParameters2D.mb_is_collide_with_bodies_enabled, livePtr)
  }

  /** PhysicsShapeQueryParameters2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collide_with_areas == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collide_with_areas = MethodBind.get("PhysicsShapeQueryParameters2D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsShapeQueryParameters2D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** PhysicsShapeQueryParameters2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.PhysicsShapeQueryParameters2D.mb_is_collide_with_areas_enabled == null) gdext.classes.PhysicsShapeQueryParameters2D.mb_is_collide_with_areas_enabled = MethodBind.get("PhysicsShapeQueryParameters2D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsShapeQueryParameters2D.mb_is_collide_with_areas_enabled, livePtr)
  }

}

object PhysicsShapeQueryParameters2D {
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_bodies_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_areas_enabled: GDExtensionMethodBindPtr = null
}
