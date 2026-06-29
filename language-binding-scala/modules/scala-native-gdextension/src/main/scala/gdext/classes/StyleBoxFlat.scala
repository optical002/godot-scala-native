package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StyleBoxFlat`, extends `StyleBox`. */
abstract class StyleBoxFlat extends StyleBox {
  override def godotClassName: String = "StyleBoxFlat"

  /** StyleBoxFlat.set_bg_color */
  final def setBgColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_bg_color", 2920490490L), hostObject.objectPtr, color)

  /** StyleBoxFlat.get_bg_color */
  final def getBgColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("StyleBoxFlat", "get_bg_color", 3444240500L), hostObject.objectPtr)

  /** StyleBoxFlat.set_border_color */
  final def setBorderColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_border_color", 2920490490L), hostObject.objectPtr, color)

  /** StyleBoxFlat.get_border_color */
  final def getBorderColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("StyleBoxFlat", "get_border_color", 3444240500L), hostObject.objectPtr)

  /** StyleBoxFlat.set_border_width_all */
  final def setBorderWidthAll(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_border_width_all", 1286410249L), hostObject.objectPtr, width)

  /** StyleBoxFlat.get_border_width_min */
  final def getBorderWidthMin(): Long =
    Ptrcall.call0[Long](MethodBind.get("StyleBoxFlat", "get_border_width_min", 3905245786L), hostObject.objectPtr)

  /** StyleBoxFlat.set_border_width */
  final def setBorderWidth(margin: Long, width: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("StyleBoxFlat", "set_border_width", 437707142L), hostObject.objectPtr, margin, width)

  /** StyleBoxFlat.get_border_width */
  final def getBorderWidth(margin: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("StyleBoxFlat", "get_border_width", 1983885014L), hostObject.objectPtr, margin)

  /** StyleBoxFlat.set_border_blend */
  final def setBorderBlend(blend: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_border_blend", 2586408642L), hostObject.objectPtr, blend)

  /** StyleBoxFlat.get_border_blend */
  final def getBorderBlend(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("StyleBoxFlat", "get_border_blend", 36873697L), hostObject.objectPtr)

  /** StyleBoxFlat.set_corner_radius_all */
  final def setCornerRadiusAll(radius: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_corner_radius_all", 1286410249L), hostObject.objectPtr, radius)

  /** StyleBoxFlat.set_corner_radius */
  final def setCornerRadius(corner: Long, radius: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("StyleBoxFlat", "set_corner_radius", 2696158768L), hostObject.objectPtr, corner, radius)

  /** StyleBoxFlat.get_corner_radius */
  final def getCornerRadius(corner: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("StyleBoxFlat", "get_corner_radius", 3982397690L), hostObject.objectPtr, corner)

  /** StyleBoxFlat.set_expand_margin */
  final def setExpandMargin(margin: Long, size: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("StyleBoxFlat", "set_expand_margin", 4290182280L), hostObject.objectPtr, margin, size)

  /** StyleBoxFlat.set_expand_margin_all */
  final def setExpandMarginAll(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_expand_margin_all", 373806689L), hostObject.objectPtr, size)

  /** StyleBoxFlat.get_expand_margin */
  final def getExpandMargin(margin: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("StyleBoxFlat", "get_expand_margin", 2869120046L), hostObject.objectPtr, margin)

  /** StyleBoxFlat.set_draw_center */
  final def setDrawCenter(draw_center: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_draw_center", 2586408642L), hostObject.objectPtr, draw_center)

  /** StyleBoxFlat.is_draw_center_enabled */
  final def isDrawCenterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("StyleBoxFlat", "is_draw_center_enabled", 36873697L), hostObject.objectPtr)

  /** StyleBoxFlat.set_skew */
  final def setSkew(skew: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_skew", 743155724L), hostObject.objectPtr, skew)

  /** StyleBoxFlat.get_skew */
  final def getSkew(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("StyleBoxFlat", "get_skew", 3341600327L), hostObject.objectPtr)

  /** StyleBoxFlat.set_shadow_color */
  final def setShadowColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_shadow_color", 2920490490L), hostObject.objectPtr, color)

  /** StyleBoxFlat.get_shadow_color */
  final def getShadowColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("StyleBoxFlat", "get_shadow_color", 3444240500L), hostObject.objectPtr)

  /** StyleBoxFlat.set_shadow_size */
  final def setShadowSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_shadow_size", 1286410249L), hostObject.objectPtr, size)

  /** StyleBoxFlat.get_shadow_size */
  final def getShadowSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("StyleBoxFlat", "get_shadow_size", 3905245786L), hostObject.objectPtr)

  /** StyleBoxFlat.set_shadow_offset */
  final def setShadowOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_shadow_offset", 743155724L), hostObject.objectPtr, offset)

  /** StyleBoxFlat.get_shadow_offset */
  final def getShadowOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("StyleBoxFlat", "get_shadow_offset", 3341600327L), hostObject.objectPtr)

  /** StyleBoxFlat.set_anti_aliased */
  final def setAntiAliased(anti_aliased: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_anti_aliased", 2586408642L), hostObject.objectPtr, anti_aliased)

  /** StyleBoxFlat.is_anti_aliased */
  final def isAntiAliased(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("StyleBoxFlat", "is_anti_aliased", 36873697L), hostObject.objectPtr)

  /** StyleBoxFlat.set_aa_size */
  final def setAaSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_aa_size", 373806689L), hostObject.objectPtr, size)

  /** StyleBoxFlat.get_aa_size */
  final def getAaSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("StyleBoxFlat", "get_aa_size", 1740695150L), hostObject.objectPtr)

  /** StyleBoxFlat.set_corner_detail */
  final def setCornerDetail(detail: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxFlat", "set_corner_detail", 1286410249L), hostObject.objectPtr, detail)

  /** StyleBoxFlat.get_corner_detail */
  final def getCornerDetail(): Long =
    Ptrcall.call0[Long](MethodBind.get("StyleBoxFlat", "get_corner_detail", 3905245786L), hostObject.objectPtr)

}
