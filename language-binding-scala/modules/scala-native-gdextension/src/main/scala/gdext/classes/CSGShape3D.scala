package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGShape3D`, extends `GeometryInstance3D`. */
abstract class CSGShape3D extends GeometryInstance3D {
  override def godotClassName: String = "CSGShape3D"

  /** CSGShape3D.is_root_shape */
  final def isRootShape(): Boolean = {
    if (gdext.classes.CSGShape3D.mb_is_root_shape == null) gdext.classes.CSGShape3D.mb_is_root_shape = MethodBind.get("CSGShape3D", "is_root_shape", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGShape3D.mb_is_root_shape, livePtr)
  }

  /** CSGShape3D.set_operation */
  final def setOperation(operation: Long): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_operation == null) gdext.classes.CSGShape3D.mb_set_operation = MethodBind.get("CSGShape3D", "set_operation", 811425055L)
    Ptrcall.callVoid1(gdext.classes.CSGShape3D.mb_set_operation, livePtr, operation)
  }

  /** CSGShape3D.get_operation */
  final def getOperation(): Long = {
    if (gdext.classes.CSGShape3D.mb_get_operation == null) gdext.classes.CSGShape3D.mb_get_operation = MethodBind.get("CSGShape3D", "get_operation", 2662425879L)
    Ptrcall.call0[Long](gdext.classes.CSGShape3D.mb_get_operation, livePtr)
  }

  /** CSGShape3D.set_snap */
  final def setSnap(snap: Double): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_snap == null) gdext.classes.CSGShape3D.mb_set_snap = MethodBind.get("CSGShape3D", "set_snap", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGShape3D.mb_set_snap, livePtr, snap)
  }

  /** CSGShape3D.get_snap */
  final def getSnap(): Double = {
    if (gdext.classes.CSGShape3D.mb_get_snap == null) gdext.classes.CSGShape3D.mb_get_snap = MethodBind.get("CSGShape3D", "get_snap", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGShape3D.mb_get_snap, livePtr)
  }

  /** CSGShape3D.set_use_collision */
  final def setUseCollision(operation: Boolean): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_use_collision == null) gdext.classes.CSGShape3D.mb_set_use_collision = MethodBind.get("CSGShape3D", "set_use_collision", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGShape3D.mb_set_use_collision, livePtr, operation)
  }

  /** CSGShape3D.is_using_collision */
  final def isUsingCollision(): Boolean = {
    if (gdext.classes.CSGShape3D.mb_is_using_collision == null) gdext.classes.CSGShape3D.mb_is_using_collision = MethodBind.get("CSGShape3D", "is_using_collision", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGShape3D.mb_is_using_collision, livePtr)
  }

  /** CSGShape3D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_collision_layer == null) gdext.classes.CSGShape3D.mb_set_collision_layer = MethodBind.get("CSGShape3D", "set_collision_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGShape3D.mb_set_collision_layer, livePtr, layer)
  }

  /** CSGShape3D.get_collision_layer */
  final def getCollisionLayer(): Long = {
    if (gdext.classes.CSGShape3D.mb_get_collision_layer == null) gdext.classes.CSGShape3D.mb_get_collision_layer = MethodBind.get("CSGShape3D", "get_collision_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGShape3D.mb_get_collision_layer, livePtr)
  }

  /** CSGShape3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_collision_mask == null) gdext.classes.CSGShape3D.mb_set_collision_mask = MethodBind.get("CSGShape3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGShape3D.mb_set_collision_mask, livePtr, mask)
  }

  /** CSGShape3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.CSGShape3D.mb_get_collision_mask == null) gdext.classes.CSGShape3D.mb_get_collision_mask = MethodBind.get("CSGShape3D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGShape3D.mb_get_collision_mask, livePtr)
  }

  /** CSGShape3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_collision_mask_value == null) gdext.classes.CSGShape3D.mb_set_collision_mask_value = MethodBind.get("CSGShape3D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CSGShape3D.mb_set_collision_mask_value, livePtr, layer_number, value)
  }

  /** CSGShape3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.CSGShape3D.mb_get_collision_mask_value == null) gdext.classes.CSGShape3D.mb_get_collision_mask_value = MethodBind.get("CSGShape3D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CSGShape3D.mb_get_collision_mask_value, livePtr, layer_number)
  }

  /** CSGShape3D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_collision_layer_value == null) gdext.classes.CSGShape3D.mb_set_collision_layer_value = MethodBind.get("CSGShape3D", "set_collision_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CSGShape3D.mb_set_collision_layer_value, livePtr, layer_number, value)
  }

  /** CSGShape3D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.CSGShape3D.mb_get_collision_layer_value == null) gdext.classes.CSGShape3D.mb_get_collision_layer_value = MethodBind.get("CSGShape3D", "get_collision_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CSGShape3D.mb_get_collision_layer_value, livePtr, layer_number)
  }

  /** CSGShape3D.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_collision_priority == null) gdext.classes.CSGShape3D.mb_set_collision_priority = MethodBind.get("CSGShape3D", "set_collision_priority", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGShape3D.mb_set_collision_priority, livePtr, priority)
  }

  /** CSGShape3D.get_collision_priority */
  final def getCollisionPriority(): Double = {
    if (gdext.classes.CSGShape3D.mb_get_collision_priority == null) gdext.classes.CSGShape3D.mb_get_collision_priority = MethodBind.get("CSGShape3D", "get_collision_priority", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGShape3D.mb_get_collision_priority, livePtr)
  }

  /** CSGShape3D.bake_collision_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def bakeCollisionShape(): ConcavePolygonShape3D = {
    if (gdext.classes.CSGShape3D.mb_bake_collision_shape == null) gdext.classes.CSGShape3D.mb_bake_collision_shape = MethodBind.get("CSGShape3D", "bake_collision_shape", 36102322L)
    Wrappers.owned[ConcavePolygonShape3D](Ptrcall.call0[Long](gdext.classes.CSGShape3D.mb_bake_collision_shape, livePtr))
  }

  /** CSGShape3D.set_calculate_tangents */
  final def setCalculateTangents(enabled: Boolean): Unit = {
    if (gdext.classes.CSGShape3D.mb_set_calculate_tangents == null) gdext.classes.CSGShape3D.mb_set_calculate_tangents = MethodBind.get("CSGShape3D", "set_calculate_tangents", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGShape3D.mb_set_calculate_tangents, livePtr, enabled)
  }

  /** CSGShape3D.is_calculating_tangents */
  final def isCalculatingTangents(): Boolean = {
    if (gdext.classes.CSGShape3D.mb_is_calculating_tangents == null) gdext.classes.CSGShape3D.mb_is_calculating_tangents = MethodBind.get("CSGShape3D", "is_calculating_tangents", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGShape3D.mb_is_calculating_tangents, livePtr)
  }

  /** CSGShape3D.bake_static_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def bakeStaticMesh(): ArrayMesh = {
    if (gdext.classes.CSGShape3D.mb_bake_static_mesh == null) gdext.classes.CSGShape3D.mb_bake_static_mesh = MethodBind.get("CSGShape3D", "bake_static_mesh", 1605880883L)
    Wrappers.owned[ArrayMesh](Ptrcall.call0[Long](gdext.classes.CSGShape3D.mb_bake_static_mesh, livePtr))
  }

}

object CSGShape3D {
  private[classes] var mb_is_root_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_operation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_bake_collision_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_calculate_tangents: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_calculating_tangents: GDExtensionMethodBindPtr = null
  private[classes] var mb_bake_static_mesh: GDExtensionMethodBindPtr = null
}
