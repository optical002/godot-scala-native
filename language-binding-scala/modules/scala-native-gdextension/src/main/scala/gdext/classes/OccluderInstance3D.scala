package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OccluderInstance3D`, extends `VisualInstance3D`. */
abstract class OccluderInstance3D extends VisualInstance3D {
  override def godotClassName: String = "OccluderInstance3D"

  /** OccluderInstance3D.set_bake_mask */
  final def setBakeMask(mask: Long): Unit = {
    if (gdext.classes.OccluderInstance3D.mb_set_bake_mask == null) gdext.classes.OccluderInstance3D.mb_set_bake_mask = MethodBind.get("OccluderInstance3D", "set_bake_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OccluderInstance3D.mb_set_bake_mask, livePtr, mask)
  }

  /** OccluderInstance3D.get_bake_mask */
  final def getBakeMask(): Long = {
    if (gdext.classes.OccluderInstance3D.mb_get_bake_mask == null) gdext.classes.OccluderInstance3D.mb_get_bake_mask = MethodBind.get("OccluderInstance3D", "get_bake_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OccluderInstance3D.mb_get_bake_mask, livePtr)
  }

  /** OccluderInstance3D.set_bake_mask_value */
  final def setBakeMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.OccluderInstance3D.mb_set_bake_mask_value == null) gdext.classes.OccluderInstance3D.mb_set_bake_mask_value = MethodBind.get("OccluderInstance3D", "set_bake_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.OccluderInstance3D.mb_set_bake_mask_value, livePtr, layer_number, value)
  }

  /** OccluderInstance3D.get_bake_mask_value */
  final def getBakeMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.OccluderInstance3D.mb_get_bake_mask_value == null) gdext.classes.OccluderInstance3D.mb_get_bake_mask_value = MethodBind.get("OccluderInstance3D", "get_bake_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OccluderInstance3D.mb_get_bake_mask_value, livePtr, layer_number)
  }

  /** OccluderInstance3D.set_bake_simplification_distance */
  final def setBakeSimplificationDistance(simplification_distance: Double): Unit = {
    if (gdext.classes.OccluderInstance3D.mb_set_bake_simplification_distance == null) gdext.classes.OccluderInstance3D.mb_set_bake_simplification_distance = MethodBind.get("OccluderInstance3D", "set_bake_simplification_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OccluderInstance3D.mb_set_bake_simplification_distance, livePtr, simplification_distance)
  }

  /** OccluderInstance3D.get_bake_simplification_distance */
  final def getBakeSimplificationDistance(): Double = {
    if (gdext.classes.OccluderInstance3D.mb_get_bake_simplification_distance == null) gdext.classes.OccluderInstance3D.mb_get_bake_simplification_distance = MethodBind.get("OccluderInstance3D", "get_bake_simplification_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OccluderInstance3D.mb_get_bake_simplification_distance, livePtr)
  }

  /** OccluderInstance3D.set_occluder */
  final def setOccluder(occluder: Occluder3D): Unit = {
    if (gdext.classes.OccluderInstance3D.mb_set_occluder == null) gdext.classes.OccluderInstance3D.mb_set_occluder = MethodBind.get("OccluderInstance3D", "set_occluder", 1664878165L)
    Ptrcall.callVoid1(gdext.classes.OccluderInstance3D.mb_set_occluder, livePtr, Wrappers.handle(occluder))
  }

  /** OccluderInstance3D.get_occluder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOccluder(): Occluder3D = {
    if (gdext.classes.OccluderInstance3D.mb_get_occluder == null) gdext.classes.OccluderInstance3D.mb_get_occluder = MethodBind.get("OccluderInstance3D", "get_occluder", 1696836198L)
    Wrappers.owned[Occluder3D](Ptrcall.call0[Long](gdext.classes.OccluderInstance3D.mb_get_occluder, livePtr))
  }

}

object OccluderInstance3D {
  private[classes] var mb_set_bake_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_simplification_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_simplification_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occluder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occluder: GDExtensionMethodBindPtr = null
}
