package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Light2D`, extends `Node2D`. */
abstract class Light2D extends Node2D {

  /** Light2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Light2D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light2D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** Light2D.set_editor_only */
  final def setEditorOnly(editor_only: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_editor_only", 2586408642L), hostObject.objectPtr, editor_only)

  /** Light2D.is_editor_only */
  final def isEditorOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light2D", "is_editor_only", 36873697L), hostObject.objectPtr)

  /** Light2D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** Light2D.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Light2D", "get_color", 3444240500L), hostObject.objectPtr)

  /** Light2D.set_energy */
  final def setEnergy(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_energy", 373806689L), hostObject.objectPtr, energy)

  /** Light2D.get_energy */
  final def getEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("Light2D", "get_energy", 1740695150L), hostObject.objectPtr)

  /** Light2D.set_z_range_min */
  final def setZRangeMin(z: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_z_range_min", 1286410249L), hostObject.objectPtr, z)

  /** Light2D.get_z_range_min */
  final def getZRangeMin(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_z_range_min", 3905245786L), hostObject.objectPtr)

  /** Light2D.set_z_range_max */
  final def setZRangeMax(z: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_z_range_max", 1286410249L), hostObject.objectPtr, z)

  /** Light2D.get_z_range_max */
  final def getZRangeMax(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_z_range_max", 3905245786L), hostObject.objectPtr)

  /** Light2D.set_layer_range_min */
  final def setLayerRangeMin(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_layer_range_min", 1286410249L), hostObject.objectPtr, layer)

  /** Light2D.get_layer_range_min */
  final def getLayerRangeMin(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_layer_range_min", 3905245786L), hostObject.objectPtr)

  /** Light2D.set_layer_range_max */
  final def setLayerRangeMax(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_layer_range_max", 1286410249L), hostObject.objectPtr, layer)

  /** Light2D.get_layer_range_max */
  final def getLayerRangeMax(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_layer_range_max", 3905245786L), hostObject.objectPtr)

  /** Light2D.set_item_cull_mask */
  final def setItemCullMask(item_cull_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_item_cull_mask", 1286410249L), hostObject.objectPtr, item_cull_mask)

  /** Light2D.get_item_cull_mask */
  final def getItemCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_item_cull_mask", 3905245786L), hostObject.objectPtr)

  /** Light2D.set_item_shadow_cull_mask */
  final def setItemShadowCullMask(item_shadow_cull_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_item_shadow_cull_mask", 1286410249L), hostObject.objectPtr, item_shadow_cull_mask)

  /** Light2D.get_item_shadow_cull_mask */
  final def getItemShadowCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_item_shadow_cull_mask", 3905245786L), hostObject.objectPtr)

  /** Light2D.set_shadow_enabled */
  final def setShadowEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_shadow_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Light2D.is_shadow_enabled */
  final def isShadowEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light2D", "is_shadow_enabled", 36873697L), hostObject.objectPtr)

  /** Light2D.set_shadow_smooth */
  final def setShadowSmooth(smooth: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_shadow_smooth", 373806689L), hostObject.objectPtr, smooth)

  /** Light2D.get_shadow_smooth */
  final def getShadowSmooth(): Double =
    Ptrcall.call0[Double](MethodBind.get("Light2D", "get_shadow_smooth", 1740695150L), hostObject.objectPtr)

  /** Light2D.set_shadow_filter */
  final def setShadowFilter(filter: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_shadow_filter", 3209356555L), hostObject.objectPtr, filter)

  /** Light2D.get_shadow_filter */
  final def getShadowFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_shadow_filter", 1973619177L), hostObject.objectPtr)

  /** Light2D.set_shadow_color */
  final def setShadowColor(shadow_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_shadow_color", 2920490490L), hostObject.objectPtr, shadow_color)

  /** Light2D.get_shadow_color */
  final def getShadowColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Light2D", "get_shadow_color", 3444240500L), hostObject.objectPtr)

  /** Light2D.set_blend_mode */
  final def setBlendMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_blend_mode", 2916638796L), hostObject.objectPtr, mode)

  /** Light2D.get_blend_mode */
  final def getBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light2D", "get_blend_mode", 936255250L), hostObject.objectPtr)

  /** Light2D.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light2D", "set_height", 373806689L), hostObject.objectPtr, height)

  /** Light2D.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("Light2D", "get_height", 1740695150L), hostObject.objectPtr)

}

object Light2D {
  /** Class metadata for Gd[Light2D] lifetime management and casting. */
  given GodotClass[Light2D] with {
    def className = "Light2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Light2D = new Light2D {}.withHost(o.objectPtr)
    def unwrap(t: Light2D): GodotObject = t.hostObject
  }
}
