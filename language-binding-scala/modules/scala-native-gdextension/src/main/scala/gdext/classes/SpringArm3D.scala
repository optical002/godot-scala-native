package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpringArm3D`, extends `Node3D`. */
abstract class SpringArm3D extends Node3D {
  override def godotClassName: String = "SpringArm3D"

  /** SpringArm3D.get_hit_length */
  final def getHitLength(): Double = {
    if (gdext.classes.SpringArm3D.mb_get_hit_length == null) gdext.classes.SpringArm3D.mb_get_hit_length = MethodBind.get("SpringArm3D", "get_hit_length", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SpringArm3D.mb_get_hit_length, livePtr)
  }

  /** SpringArm3D.set_length */
  final def setLength(length: Double): Unit = {
    if (gdext.classes.SpringArm3D.mb_set_length == null) gdext.classes.SpringArm3D.mb_set_length = MethodBind.get("SpringArm3D", "set_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpringArm3D.mb_set_length, livePtr, length)
  }

  /** SpringArm3D.get_length */
  final def getLength(): Double = {
    if (gdext.classes.SpringArm3D.mb_get_length == null) gdext.classes.SpringArm3D.mb_get_length = MethodBind.get("SpringArm3D", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpringArm3D.mb_get_length, livePtr)
  }

  /** SpringArm3D.set_shape */
  final def setShape(shape: Shape3D): Unit = {
    if (gdext.classes.SpringArm3D.mb_set_shape == null) gdext.classes.SpringArm3D.mb_set_shape = MethodBind.get("SpringArm3D", "set_shape", 1549710052L)
    Ptrcall.callVoid1(gdext.classes.SpringArm3D.mb_set_shape, livePtr, Wrappers.handle(shape))
  }

  /** SpringArm3D.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(): Shape3D = {
    if (gdext.classes.SpringArm3D.mb_get_shape == null) gdext.classes.SpringArm3D.mb_get_shape = MethodBind.get("SpringArm3D", "get_shape", 3214262478L)
    Wrappers.owned[Shape3D](Ptrcall.call0[Long](gdext.classes.SpringArm3D.mb_get_shape, livePtr))
  }

  /** SpringArm3D.clear_excluded_objects */
  final def clearExcludedObjects(): Unit = {
    if (gdext.classes.SpringArm3D.mb_clear_excluded_objects == null) gdext.classes.SpringArm3D.mb_clear_excluded_objects = MethodBind.get("SpringArm3D", "clear_excluded_objects", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SpringArm3D.mb_clear_excluded_objects, livePtr)
  }

  /** SpringArm3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.SpringArm3D.mb_set_collision_mask == null) gdext.classes.SpringArm3D.mb_set_collision_mask = MethodBind.get("SpringArm3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SpringArm3D.mb_set_collision_mask, livePtr, mask)
  }

  /** SpringArm3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.SpringArm3D.mb_get_collision_mask == null) gdext.classes.SpringArm3D.mb_get_collision_mask = MethodBind.get("SpringArm3D", "get_collision_mask", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SpringArm3D.mb_get_collision_mask, livePtr)
  }

  /** SpringArm3D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.SpringArm3D.mb_set_margin == null) gdext.classes.SpringArm3D.mb_set_margin = MethodBind.get("SpringArm3D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpringArm3D.mb_set_margin, livePtr, margin)
  }

  /** SpringArm3D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.SpringArm3D.mb_get_margin == null) gdext.classes.SpringArm3D.mb_get_margin = MethodBind.get("SpringArm3D", "get_margin", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SpringArm3D.mb_get_margin, livePtr)
  }

}

object SpringArm3D {
  private[classes] var mb_get_hit_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_excluded_objects: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
}
