package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualInstance3D`, extends `Node3D`. */
abstract class VisualInstance3D extends Node3D {

  /** VisualInstance3D.set_layer_mask */
  final def setLayerMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualInstance3D", "set_layer_mask", 1286410249L), hostObject.objectPtr, mask)

  /** VisualInstance3D.get_layer_mask */
  final def getLayerMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualInstance3D", "get_layer_mask", 3905245786L), hostObject.objectPtr)

  /** VisualInstance3D.set_layer_mask_value */
  final def setLayerMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("VisualInstance3D", "set_layer_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** VisualInstance3D.get_layer_mask_value */
  final def getLayerMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("VisualInstance3D", "get_layer_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** VisualInstance3D.set_sorting_offset */
  final def setSortingOffset(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualInstance3D", "set_sorting_offset", 373806689L), hostObject.objectPtr, offset)

  /** VisualInstance3D.get_sorting_offset */
  final def getSortingOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("VisualInstance3D", "get_sorting_offset", 1740695150L), hostObject.objectPtr)

  /** VisualInstance3D.set_sorting_use_aabb_center */
  final def setSortingUseAabbCenter(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualInstance3D", "set_sorting_use_aabb_center", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualInstance3D.is_sorting_use_aabb_center */
  final def isSortingUseAabbCenter(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualInstance3D", "is_sorting_use_aabb_center", 36873697L), hostObject.objectPtr)

  /** VisualInstance3D.get_aabb */
  final def getAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("VisualInstance3D", "get_aabb", 1068685055L), hostObject.objectPtr)

}

object VisualInstance3D {
  /** Class metadata for Gd[VisualInstance3D] lifetime management and casting. */
  given GodotClass[VisualInstance3D] with {
    def className = "VisualInstance3D"
    def isRefCounted = false
    def wrap(o: GodotObject): VisualInstance3D = new VisualInstance3D {}.withHost(o.objectPtr)
    def unwrap(t: VisualInstance3D): GodotObject = t.hostObject
  }
}
