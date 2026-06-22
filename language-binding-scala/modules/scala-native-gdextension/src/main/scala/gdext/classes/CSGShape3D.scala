package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGShape3D`, extends `GeometryInstance3D`. */
abstract class CSGShape3D extends GeometryInstance3D {

  /** CSGShape3D.is_root_shape */
  final def isRootShape(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGShape3D", "is_root_shape", 36873697L), hostObject.objectPtr)

  /** CSGShape3D.set_operation */
  final def setOperation(operation: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGShape3D", "set_operation", 811425055L), hostObject.objectPtr, operation)

  /** CSGShape3D.get_operation */
  final def getOperation(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGShape3D", "get_operation", 2662425879L), hostObject.objectPtr)

  /** CSGShape3D.set_snap */
  final def setSnap(snap: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGShape3D", "set_snap", 373806689L), hostObject.objectPtr, snap)

  /** CSGShape3D.get_snap */
  final def getSnap(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGShape3D", "get_snap", 1740695150L), hostObject.objectPtr)

  /** CSGShape3D.set_use_collision */
  final def setUseCollision(operation: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGShape3D", "set_use_collision", 2586408642L), hostObject.objectPtr, operation)

  /** CSGShape3D.is_using_collision */
  final def isUsingCollision(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGShape3D", "is_using_collision", 36873697L), hostObject.objectPtr)

  /** CSGShape3D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGShape3D", "set_collision_layer", 1286410249L), hostObject.objectPtr, layer)

  /** CSGShape3D.get_collision_layer */
  final def getCollisionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGShape3D", "get_collision_layer", 3905245786L), hostObject.objectPtr)

  /** CSGShape3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGShape3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** CSGShape3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGShape3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** CSGShape3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CSGShape3D", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** CSGShape3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CSGShape3D", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** CSGShape3D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CSGShape3D", "set_collision_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** CSGShape3D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CSGShape3D", "get_collision_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** CSGShape3D.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGShape3D", "set_collision_priority", 373806689L), hostObject.objectPtr, priority)

  /** CSGShape3D.get_collision_priority */
  final def getCollisionPriority(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGShape3D", "get_collision_priority", 1740695150L), hostObject.objectPtr)

  /** CSGShape3D.bake_collision_shape */
  final def bakeCollisionShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGShape3D", "bake_collision_shape", 36102322L), hostObject.objectPtr)

  /** CSGShape3D.set_calculate_tangents */
  final def setCalculateTangents(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGShape3D", "set_calculate_tangents", 2586408642L), hostObject.objectPtr, enabled)

  /** CSGShape3D.is_calculating_tangents */
  final def isCalculatingTangents(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGShape3D", "is_calculating_tangents", 36873697L), hostObject.objectPtr)

  /** CSGShape3D.bake_static_mesh */
  final def bakeStaticMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGShape3D", "bake_static_mesh", 1605880883L), hostObject.objectPtr)

}

object CSGShape3D {
  /** Class metadata for Gd[CSGShape3D] lifetime management and casting. */
  given GodotClass[CSGShape3D] with {
    def className = "CSGShape3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGShape3D = new CSGShape3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGShape3D): GodotObject = t.hostObject
  }
}
