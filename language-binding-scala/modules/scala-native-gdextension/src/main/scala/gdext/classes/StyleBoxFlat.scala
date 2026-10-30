package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StyleBoxFlat`, extends `StyleBox`. */
abstract class StyleBoxFlat extends StyleBox {
  override def godotClassName: String = "StyleBoxFlat"

  /** StyleBoxFlat.set_bg_color */
  final def setBgColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_bg_color == null) gdext.classes.StyleBoxFlat.mb_set_bg_color = MethodBind.get("StyleBoxFlat", "set_bg_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_bg_color, livePtr, color)
  }

  /** StyleBoxFlat.get_bg_color */
  final def getBgColor(): gdext.builtin.Color = {
    if (gdext.classes.StyleBoxFlat.mb_get_bg_color == null) gdext.classes.StyleBoxFlat.mb_get_bg_color = MethodBind.get("StyleBoxFlat", "get_bg_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.StyleBoxFlat.mb_get_bg_color, livePtr)
  }

  /** StyleBoxFlat.set_border_color */
  final def setBorderColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_border_color == null) gdext.classes.StyleBoxFlat.mb_set_border_color = MethodBind.get("StyleBoxFlat", "set_border_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_border_color, livePtr, color)
  }

  /** StyleBoxFlat.get_border_color */
  final def getBorderColor(): gdext.builtin.Color = {
    if (gdext.classes.StyleBoxFlat.mb_get_border_color == null) gdext.classes.StyleBoxFlat.mb_get_border_color = MethodBind.get("StyleBoxFlat", "get_border_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.StyleBoxFlat.mb_get_border_color, livePtr)
  }

  /** StyleBoxFlat.set_border_width_all */
  final def setBorderWidthAll(width: Long): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_border_width_all == null) gdext.classes.StyleBoxFlat.mb_set_border_width_all = MethodBind.get("StyleBoxFlat", "set_border_width_all", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_border_width_all, livePtr, width)
  }

  /** StyleBoxFlat.get_border_width_min */
  final def getBorderWidthMin(): Long = {
    if (gdext.classes.StyleBoxFlat.mb_get_border_width_min == null) gdext.classes.StyleBoxFlat.mb_get_border_width_min = MethodBind.get("StyleBoxFlat", "get_border_width_min", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StyleBoxFlat.mb_get_border_width_min, livePtr)
  }

  /** StyleBoxFlat.set_border_width */
  final def setBorderWidth(margin: gdext.classes.Side, width: Long): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_border_width == null) gdext.classes.StyleBoxFlat.mb_set_border_width = MethodBind.get("StyleBoxFlat", "set_border_width", 437707142L)
    Ptrcall.callVoid2(gdext.classes.StyleBoxFlat.mb_set_border_width, livePtr, margin, width)
  }

  /** StyleBoxFlat.get_border_width */
  final def getBorderWidth(margin: gdext.classes.Side): Long = {
    if (gdext.classes.StyleBoxFlat.mb_get_border_width == null) gdext.classes.StyleBoxFlat.mb_get_border_width = MethodBind.get("StyleBoxFlat", "get_border_width", 1983885014L)
    Ptrcall.call1[Long, Long](gdext.classes.StyleBoxFlat.mb_get_border_width, livePtr, margin)
  }

  /** StyleBoxFlat.set_border_blend */
  final def setBorderBlend(blend: Boolean): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_border_blend == null) gdext.classes.StyleBoxFlat.mb_set_border_blend = MethodBind.get("StyleBoxFlat", "set_border_blend", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_border_blend, livePtr, blend)
  }

  /** StyleBoxFlat.get_border_blend */
  final def getBorderBlend(): Boolean = {
    if (gdext.classes.StyleBoxFlat.mb_get_border_blend == null) gdext.classes.StyleBoxFlat.mb_get_border_blend = MethodBind.get("StyleBoxFlat", "get_border_blend", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.StyleBoxFlat.mb_get_border_blend, livePtr)
  }

  /** StyleBoxFlat.set_corner_radius_all */
  final def setCornerRadiusAll(radius: Long): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_corner_radius_all == null) gdext.classes.StyleBoxFlat.mb_set_corner_radius_all = MethodBind.get("StyleBoxFlat", "set_corner_radius_all", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_corner_radius_all, livePtr, radius)
  }

  /** StyleBoxFlat.set_corner_radius */
  final def setCornerRadius(corner: gdext.classes.Corner, radius: Long): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_corner_radius == null) gdext.classes.StyleBoxFlat.mb_set_corner_radius = MethodBind.get("StyleBoxFlat", "set_corner_radius", 2696158768L)
    Ptrcall.callVoid2(gdext.classes.StyleBoxFlat.mb_set_corner_radius, livePtr, corner, radius)
  }

  /** StyleBoxFlat.get_corner_radius */
  final def getCornerRadius(corner: gdext.classes.Corner): Long = {
    if (gdext.classes.StyleBoxFlat.mb_get_corner_radius == null) gdext.classes.StyleBoxFlat.mb_get_corner_radius = MethodBind.get("StyleBoxFlat", "get_corner_radius", 3982397690L)
    Ptrcall.call1[Long, Long](gdext.classes.StyleBoxFlat.mb_get_corner_radius, livePtr, corner)
  }

  /** StyleBoxFlat.set_expand_margin */
  final def setExpandMargin(margin: gdext.classes.Side, size: Double): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_expand_margin == null) gdext.classes.StyleBoxFlat.mb_set_expand_margin = MethodBind.get("StyleBoxFlat", "set_expand_margin", 4290182280L)
    Ptrcall.callVoid2(gdext.classes.StyleBoxFlat.mb_set_expand_margin, livePtr, margin, size)
  }

  /** StyleBoxFlat.set_expand_margin_all */
  final def setExpandMarginAll(size: Double): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_expand_margin_all == null) gdext.classes.StyleBoxFlat.mb_set_expand_margin_all = MethodBind.get("StyleBoxFlat", "set_expand_margin_all", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_expand_margin_all, livePtr, size)
  }

  /** StyleBoxFlat.get_expand_margin */
  final def getExpandMargin(margin: gdext.classes.Side): Double = {
    if (gdext.classes.StyleBoxFlat.mb_get_expand_margin == null) gdext.classes.StyleBoxFlat.mb_get_expand_margin = MethodBind.get("StyleBoxFlat", "get_expand_margin", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.StyleBoxFlat.mb_get_expand_margin, livePtr, margin)
  }

  /** StyleBoxFlat.set_draw_center */
  final def setDrawCenter(drawCenter: Boolean): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_draw_center == null) gdext.classes.StyleBoxFlat.mb_set_draw_center = MethodBind.get("StyleBoxFlat", "set_draw_center", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_draw_center, livePtr, drawCenter)
  }

  /** StyleBoxFlat.is_draw_center_enabled */
  final def isDrawCenterEnabled(): Boolean = {
    if (gdext.classes.StyleBoxFlat.mb_is_draw_center_enabled == null) gdext.classes.StyleBoxFlat.mb_is_draw_center_enabled = MethodBind.get("StyleBoxFlat", "is_draw_center_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.StyleBoxFlat.mb_is_draw_center_enabled, livePtr)
  }

  /** StyleBoxFlat.set_skew */
  final def setSkew(skew: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_skew == null) gdext.classes.StyleBoxFlat.mb_set_skew = MethodBind.get("StyleBoxFlat", "set_skew", 743155724L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_skew, livePtr, skew)
  }

  /** StyleBoxFlat.get_skew */
  final def getSkew(): gdext.builtin.Vector2 = {
    if (gdext.classes.StyleBoxFlat.mb_get_skew == null) gdext.classes.StyleBoxFlat.mb_get_skew = MethodBind.get("StyleBoxFlat", "get_skew", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.StyleBoxFlat.mb_get_skew, livePtr)
  }

  /** StyleBoxFlat.set_shadow_color */
  final def setShadowColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_shadow_color == null) gdext.classes.StyleBoxFlat.mb_set_shadow_color = MethodBind.get("StyleBoxFlat", "set_shadow_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_shadow_color, livePtr, color)
  }

  /** StyleBoxFlat.get_shadow_color */
  final def getShadowColor(): gdext.builtin.Color = {
    if (gdext.classes.StyleBoxFlat.mb_get_shadow_color == null) gdext.classes.StyleBoxFlat.mb_get_shadow_color = MethodBind.get("StyleBoxFlat", "get_shadow_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.StyleBoxFlat.mb_get_shadow_color, livePtr)
  }

  /** StyleBoxFlat.set_shadow_size */
  final def setShadowSize(size: Long): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_shadow_size == null) gdext.classes.StyleBoxFlat.mb_set_shadow_size = MethodBind.get("StyleBoxFlat", "set_shadow_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_shadow_size, livePtr, size)
  }

  /** StyleBoxFlat.get_shadow_size */
  final def getShadowSize(): Long = {
    if (gdext.classes.StyleBoxFlat.mb_get_shadow_size == null) gdext.classes.StyleBoxFlat.mb_get_shadow_size = MethodBind.get("StyleBoxFlat", "get_shadow_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StyleBoxFlat.mb_get_shadow_size, livePtr)
  }

  /** StyleBoxFlat.set_shadow_offset */
  final def setShadowOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_shadow_offset == null) gdext.classes.StyleBoxFlat.mb_set_shadow_offset = MethodBind.get("StyleBoxFlat", "set_shadow_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_shadow_offset, livePtr, offset)
  }

  /** StyleBoxFlat.get_shadow_offset */
  final def getShadowOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.StyleBoxFlat.mb_get_shadow_offset == null) gdext.classes.StyleBoxFlat.mb_get_shadow_offset = MethodBind.get("StyleBoxFlat", "get_shadow_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.StyleBoxFlat.mb_get_shadow_offset, livePtr)
  }

  /** StyleBoxFlat.set_anti_aliased */
  final def setAntiAliased(antiAliased: Boolean): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_anti_aliased == null) gdext.classes.StyleBoxFlat.mb_set_anti_aliased = MethodBind.get("StyleBoxFlat", "set_anti_aliased", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_anti_aliased, livePtr, antiAliased)
  }

  /** StyleBoxFlat.is_anti_aliased */
  final def isAntiAliased(): Boolean = {
    if (gdext.classes.StyleBoxFlat.mb_is_anti_aliased == null) gdext.classes.StyleBoxFlat.mb_is_anti_aliased = MethodBind.get("StyleBoxFlat", "is_anti_aliased", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.StyleBoxFlat.mb_is_anti_aliased, livePtr)
  }

  /** StyleBoxFlat.set_aa_size */
  final def setAaSize(size: Double): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_aa_size == null) gdext.classes.StyleBoxFlat.mb_set_aa_size = MethodBind.get("StyleBoxFlat", "set_aa_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_aa_size, livePtr, size)
  }

  /** StyleBoxFlat.get_aa_size */
  final def getAaSize(): Double = {
    if (gdext.classes.StyleBoxFlat.mb_get_aa_size == null) gdext.classes.StyleBoxFlat.mb_get_aa_size = MethodBind.get("StyleBoxFlat", "get_aa_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.StyleBoxFlat.mb_get_aa_size, livePtr)
  }

  /** StyleBoxFlat.set_corner_detail */
  final def setCornerDetail(detail: Long): Unit = {
    if (gdext.classes.StyleBoxFlat.mb_set_corner_detail == null) gdext.classes.StyleBoxFlat.mb_set_corner_detail = MethodBind.get("StyleBoxFlat", "set_corner_detail", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxFlat.mb_set_corner_detail, livePtr, detail)
  }

  /** StyleBoxFlat.get_corner_detail */
  final def getCornerDetail(): Long = {
    if (gdext.classes.StyleBoxFlat.mb_get_corner_detail == null) gdext.classes.StyleBoxFlat.mb_get_corner_detail = MethodBind.get("StyleBoxFlat", "get_corner_detail", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StyleBoxFlat.mb_get_corner_detail, livePtr)
  }

}

object StyleBoxFlat {
  private[classes] var mb_set_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_width_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_width_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_corner_radius_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_corner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_corner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_margin_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_expand_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_center_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skew: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skew: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anti_aliased: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_anti_aliased: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_aa_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aa_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_corner_detail: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_corner_detail: GDExtensionMethodBindPtr = null
}
