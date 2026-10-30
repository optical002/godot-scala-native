package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Light2D`, extends `Node2D`. */
abstract class Light2D extends Node2D {
  override def godotClassName: String = "Light2D"

  /** Light2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Light2D.mb_set_enabled == null) gdext.classes.Light2D.mb_set_enabled = MethodBind.get("Light2D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_enabled, livePtr, enabled)
  }

  /** Light2D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.Light2D.mb_is_enabled == null) gdext.classes.Light2D.mb_is_enabled = MethodBind.get("Light2D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light2D.mb_is_enabled, livePtr)
  }

  /** Light2D.set_editor_only */
  final def setEditorOnly(editorOnly: Boolean): Unit = {
    if (gdext.classes.Light2D.mb_set_editor_only == null) gdext.classes.Light2D.mb_set_editor_only = MethodBind.get("Light2D", "set_editor_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_editor_only, livePtr, editorOnly)
  }

  /** Light2D.is_editor_only */
  final def isEditorOnly(): Boolean = {
    if (gdext.classes.Light2D.mb_is_editor_only == null) gdext.classes.Light2D.mb_is_editor_only = MethodBind.get("Light2D", "is_editor_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light2D.mb_is_editor_only, livePtr)
  }

  /** Light2D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Light2D.mb_set_color == null) gdext.classes.Light2D.mb_set_color = MethodBind.get("Light2D", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_color, livePtr, color)
  }

  /** Light2D.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.Light2D.mb_get_color == null) gdext.classes.Light2D.mb_get_color = MethodBind.get("Light2D", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Light2D.mb_get_color, livePtr)
  }

  /** Light2D.set_energy */
  final def setEnergy(energy: Double): Unit = {
    if (gdext.classes.Light2D.mb_set_energy == null) gdext.classes.Light2D.mb_set_energy = MethodBind.get("Light2D", "set_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_energy, livePtr, energy)
  }

  /** Light2D.get_energy */
  final def getEnergy(): Double = {
    if (gdext.classes.Light2D.mb_get_energy == null) gdext.classes.Light2D.mb_get_energy = MethodBind.get("Light2D", "get_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Light2D.mb_get_energy, livePtr)
  }

  /** Light2D.set_z_range_min */
  final def setZRangeMin(z: Long): Unit = {
    if (gdext.classes.Light2D.mb_set_z_range_min == null) gdext.classes.Light2D.mb_set_z_range_min = MethodBind.get("Light2D", "set_z_range_min", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_z_range_min, livePtr, z)
  }

  /** Light2D.get_z_range_min */
  final def getZRangeMin(): Long = {
    if (gdext.classes.Light2D.mb_get_z_range_min == null) gdext.classes.Light2D.mb_get_z_range_min = MethodBind.get("Light2D", "get_z_range_min", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_z_range_min, livePtr)
  }

  /** Light2D.set_z_range_max */
  final def setZRangeMax(z: Long): Unit = {
    if (gdext.classes.Light2D.mb_set_z_range_max == null) gdext.classes.Light2D.mb_set_z_range_max = MethodBind.get("Light2D", "set_z_range_max", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_z_range_max, livePtr, z)
  }

  /** Light2D.get_z_range_max */
  final def getZRangeMax(): Long = {
    if (gdext.classes.Light2D.mb_get_z_range_max == null) gdext.classes.Light2D.mb_get_z_range_max = MethodBind.get("Light2D", "get_z_range_max", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_z_range_max, livePtr)
  }

  /** Light2D.set_layer_range_min */
  final def setLayerRangeMin(layer: Long): Unit = {
    if (gdext.classes.Light2D.mb_set_layer_range_min == null) gdext.classes.Light2D.mb_set_layer_range_min = MethodBind.get("Light2D", "set_layer_range_min", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_layer_range_min, livePtr, layer)
  }

  /** Light2D.get_layer_range_min */
  final def getLayerRangeMin(): Long = {
    if (gdext.classes.Light2D.mb_get_layer_range_min == null) gdext.classes.Light2D.mb_get_layer_range_min = MethodBind.get("Light2D", "get_layer_range_min", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_layer_range_min, livePtr)
  }

  /** Light2D.set_layer_range_max */
  final def setLayerRangeMax(layer: Long): Unit = {
    if (gdext.classes.Light2D.mb_set_layer_range_max == null) gdext.classes.Light2D.mb_set_layer_range_max = MethodBind.get("Light2D", "set_layer_range_max", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_layer_range_max, livePtr, layer)
  }

  /** Light2D.get_layer_range_max */
  final def getLayerRangeMax(): Long = {
    if (gdext.classes.Light2D.mb_get_layer_range_max == null) gdext.classes.Light2D.mb_get_layer_range_max = MethodBind.get("Light2D", "get_layer_range_max", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_layer_range_max, livePtr)
  }

  /** Light2D.set_item_cull_mask */
  final def setItemCullMask(itemCullMask: Long): Unit = {
    if (gdext.classes.Light2D.mb_set_item_cull_mask == null) gdext.classes.Light2D.mb_set_item_cull_mask = MethodBind.get("Light2D", "set_item_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_item_cull_mask, livePtr, itemCullMask)
  }

  /** Light2D.get_item_cull_mask */
  final def getItemCullMask(): Long = {
    if (gdext.classes.Light2D.mb_get_item_cull_mask == null) gdext.classes.Light2D.mb_get_item_cull_mask = MethodBind.get("Light2D", "get_item_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_item_cull_mask, livePtr)
  }

  /** Light2D.set_item_shadow_cull_mask */
  final def setItemShadowCullMask(itemShadowCullMask: Long): Unit = {
    if (gdext.classes.Light2D.mb_set_item_shadow_cull_mask == null) gdext.classes.Light2D.mb_set_item_shadow_cull_mask = MethodBind.get("Light2D", "set_item_shadow_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_item_shadow_cull_mask, livePtr, itemShadowCullMask)
  }

  /** Light2D.get_item_shadow_cull_mask */
  final def getItemShadowCullMask(): Long = {
    if (gdext.classes.Light2D.mb_get_item_shadow_cull_mask == null) gdext.classes.Light2D.mb_get_item_shadow_cull_mask = MethodBind.get("Light2D", "get_item_shadow_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_item_shadow_cull_mask, livePtr)
  }

  /** Light2D.set_shadow_enabled */
  final def setShadowEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Light2D.mb_set_shadow_enabled == null) gdext.classes.Light2D.mb_set_shadow_enabled = MethodBind.get("Light2D", "set_shadow_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_shadow_enabled, livePtr, enabled)
  }

  /** Light2D.is_shadow_enabled */
  final def isShadowEnabled(): Boolean = {
    if (gdext.classes.Light2D.mb_is_shadow_enabled == null) gdext.classes.Light2D.mb_is_shadow_enabled = MethodBind.get("Light2D", "is_shadow_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Light2D.mb_is_shadow_enabled, livePtr)
  }

  /** Light2D.set_shadow_smooth */
  final def setShadowSmooth(smooth: Double): Unit = {
    if (gdext.classes.Light2D.mb_set_shadow_smooth == null) gdext.classes.Light2D.mb_set_shadow_smooth = MethodBind.get("Light2D", "set_shadow_smooth", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_shadow_smooth, livePtr, smooth)
  }

  /** Light2D.get_shadow_smooth */
  final def getShadowSmooth(): Double = {
    if (gdext.classes.Light2D.mb_get_shadow_smooth == null) gdext.classes.Light2D.mb_get_shadow_smooth = MethodBind.get("Light2D", "get_shadow_smooth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Light2D.mb_get_shadow_smooth, livePtr)
  }

  /** Light2D.set_shadow_filter */
  final def setShadowFilter(filter: gdext.classes.Light2D.ShadowFilter): Unit = {
    if (gdext.classes.Light2D.mb_set_shadow_filter == null) gdext.classes.Light2D.mb_set_shadow_filter = MethodBind.get("Light2D", "set_shadow_filter", 3209356555L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_shadow_filter, livePtr, filter)
  }

  /** Light2D.get_shadow_filter */
  final def getShadowFilter(): gdext.classes.Light2D.ShadowFilter = {
    if (gdext.classes.Light2D.mb_get_shadow_filter == null) gdext.classes.Light2D.mb_get_shadow_filter = MethodBind.get("Light2D", "get_shadow_filter", 1973619177L)
    gdext.classes.Light2D.ShadowFilter(Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_shadow_filter, livePtr))
  }

  /** Light2D.set_shadow_color */
  final def setShadowColor(shadowColor: gdext.builtin.Color): Unit = {
    if (gdext.classes.Light2D.mb_set_shadow_color == null) gdext.classes.Light2D.mb_set_shadow_color = MethodBind.get("Light2D", "set_shadow_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_shadow_color, livePtr, shadowColor)
  }

  /** Light2D.get_shadow_color */
  final def getShadowColor(): gdext.builtin.Color = {
    if (gdext.classes.Light2D.mb_get_shadow_color == null) gdext.classes.Light2D.mb_get_shadow_color = MethodBind.get("Light2D", "get_shadow_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Light2D.mb_get_shadow_color, livePtr)
  }

  /** Light2D.set_blend_mode */
  final def setBlendMode(mode: gdext.classes.Light2D.BlendMode): Unit = {
    if (gdext.classes.Light2D.mb_set_blend_mode == null) gdext.classes.Light2D.mb_set_blend_mode = MethodBind.get("Light2D", "set_blend_mode", 2916638796L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_blend_mode, livePtr, mode)
  }

  /** Light2D.get_blend_mode */
  final def getBlendMode(): gdext.classes.Light2D.BlendMode = {
    if (gdext.classes.Light2D.mb_get_blend_mode == null) gdext.classes.Light2D.mb_get_blend_mode = MethodBind.get("Light2D", "get_blend_mode", 936255250L)
    gdext.classes.Light2D.BlendMode(Ptrcall.call0[Long](gdext.classes.Light2D.mb_get_blend_mode, livePtr))
  }

  /** Light2D.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.Light2D.mb_set_height == null) gdext.classes.Light2D.mb_set_height = MethodBind.get("Light2D", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Light2D.mb_set_height, livePtr, height)
  }

  /** Light2D.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.Light2D.mb_get_height == null) gdext.classes.Light2D.mb_get_height = MethodBind.get("Light2D", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Light2D.mb_get_height, livePtr)
  }

}

object Light2D {
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editor_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editor_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_z_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_z_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_z_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_z_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_range_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_range_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_shadow_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_shadow_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shadow_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_smooth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_smooth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null

  /** Godot enum `Light2D.ShadowFilter`. */
  opaque type ShadowFilter <: Long = Long

  object ShadowFilter {
    final val None: ShadowFilter = 0L.asInstanceOf[ShadowFilter]
    final val Pcf5: ShadowFilter = 1L.asInstanceOf[ShadowFilter]
    final val Pcf13: ShadowFilter = 2L.asInstanceOf[ShadowFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadowFilter = value.asInstanceOf[ShadowFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadowFilter] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ShadowFilter]]

    extension (self: ShadowFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Pcf5"
        case 2L => "Pcf13"
        case other => other.toString
      }
  }

  /** Godot enum `Light2D.BlendMode`. */
  opaque type BlendMode <: Long = Long

  object BlendMode {
    final val Add: BlendMode = 0L.asInstanceOf[BlendMode]
    final val Sub: BlendMode = 1L.asInstanceOf[BlendMode]
    final val Mix: BlendMode = 2L.asInstanceOf[BlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendMode = value.asInstanceOf[BlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[BlendMode]]

    extension (self: BlendMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Add"
        case 1L => "Sub"
        case 2L => "Mix"
        case other => other.toString
      }
  }
}
