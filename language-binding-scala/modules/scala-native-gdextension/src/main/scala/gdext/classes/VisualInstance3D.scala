package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualInstance3D`, extends `Node3D`. */
abstract class VisualInstance3D extends Node3D {
  override def godotClassName: String = "VisualInstance3D"

  /** VisualInstance3D.set_layer_mask */
  final def setLayerMask(mask: Long): Unit = {
    if (gdext.classes.VisualInstance3D.mb_set_layer_mask == null) gdext.classes.VisualInstance3D.mb_set_layer_mask = MethodBind.get("VisualInstance3D", "set_layer_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualInstance3D.mb_set_layer_mask, livePtr, mask)
  }

  /** VisualInstance3D.get_layer_mask */
  final def getLayerMask(): Long = {
    if (gdext.classes.VisualInstance3D.mb_get_layer_mask == null) gdext.classes.VisualInstance3D.mb_get_layer_mask = MethodBind.get("VisualInstance3D", "get_layer_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualInstance3D.mb_get_layer_mask, livePtr)
  }

  /** VisualInstance3D.set_layer_mask_value */
  final def setLayerMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.VisualInstance3D.mb_set_layer_mask_value == null) gdext.classes.VisualInstance3D.mb_set_layer_mask_value = MethodBind.get("VisualInstance3D", "set_layer_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.VisualInstance3D.mb_set_layer_mask_value, livePtr, layer_number, value)
  }

  /** VisualInstance3D.get_layer_mask_value */
  final def getLayerMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.VisualInstance3D.mb_get_layer_mask_value == null) gdext.classes.VisualInstance3D.mb_get_layer_mask_value = MethodBind.get("VisualInstance3D", "get_layer_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.VisualInstance3D.mb_get_layer_mask_value, livePtr, layer_number)
  }

  /** VisualInstance3D.set_sorting_offset */
  final def setSortingOffset(offset: Double): Unit = {
    if (gdext.classes.VisualInstance3D.mb_set_sorting_offset == null) gdext.classes.VisualInstance3D.mb_set_sorting_offset = MethodBind.get("VisualInstance3D", "set_sorting_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VisualInstance3D.mb_set_sorting_offset, livePtr, offset)
  }

  /** VisualInstance3D.get_sorting_offset */
  final def getSortingOffset(): Double = {
    if (gdext.classes.VisualInstance3D.mb_get_sorting_offset == null) gdext.classes.VisualInstance3D.mb_get_sorting_offset = MethodBind.get("VisualInstance3D", "get_sorting_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VisualInstance3D.mb_get_sorting_offset, livePtr)
  }

  /** VisualInstance3D.set_sorting_use_aabb_center */
  final def setSortingUseAabbCenter(enabled: Boolean): Unit = {
    if (gdext.classes.VisualInstance3D.mb_set_sorting_use_aabb_center == null) gdext.classes.VisualInstance3D.mb_set_sorting_use_aabb_center = MethodBind.get("VisualInstance3D", "set_sorting_use_aabb_center", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualInstance3D.mb_set_sorting_use_aabb_center, livePtr, enabled)
  }

  /** VisualInstance3D.is_sorting_use_aabb_center */
  final def isSortingUseAabbCenter(): Boolean = {
    if (gdext.classes.VisualInstance3D.mb_is_sorting_use_aabb_center == null) gdext.classes.VisualInstance3D.mb_is_sorting_use_aabb_center = MethodBind.get("VisualInstance3D", "is_sorting_use_aabb_center", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualInstance3D.mb_is_sorting_use_aabb_center, livePtr)
  }

  /** VisualInstance3D.get_aabb */
  final def getAabb(): gdext.builtin.AABB = {
    if (gdext.classes.VisualInstance3D.mb_get_aabb == null) gdext.classes.VisualInstance3D.mb_get_aabb = MethodBind.get("VisualInstance3D", "get_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.VisualInstance3D.mb_get_aabb, livePtr)
  }

}

object VisualInstance3D {
  private[classes] var mb_set_layer_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sorting_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sorting_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sorting_use_aabb_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sorting_use_aabb_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aabb: GDExtensionMethodBindPtr = null
}
