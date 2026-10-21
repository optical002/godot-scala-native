package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StyleBoxTexture`, extends `StyleBox`. */
abstract class StyleBoxTexture extends StyleBox {
  override def godotClassName: String = "StyleBoxTexture"

  /** StyleBoxTexture.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_texture == null) gdext.classes.StyleBoxTexture.mb_set_texture = MethodBind.get("StyleBoxTexture", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** StyleBoxTexture.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.StyleBoxTexture.mb_get_texture == null) gdext.classes.StyleBoxTexture.mb_get_texture = MethodBind.get("StyleBoxTexture", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.StyleBoxTexture.mb_get_texture, livePtr))
  }

  /** StyleBoxTexture.set_texture_margin */
  final def setTextureMargin(margin: Long, size: Double): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_texture_margin == null) gdext.classes.StyleBoxTexture.mb_set_texture_margin = MethodBind.get("StyleBoxTexture", "set_texture_margin", 4290182280L)
    Ptrcall.callVoid2(gdext.classes.StyleBoxTexture.mb_set_texture_margin, livePtr, margin, size)
  }

  /** StyleBoxTexture.set_texture_margin_all */
  final def setTextureMarginAll(size: Double): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_texture_margin_all == null) gdext.classes.StyleBoxTexture.mb_set_texture_margin_all = MethodBind.get("StyleBoxTexture", "set_texture_margin_all", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_texture_margin_all, livePtr, size)
  }

  /** StyleBoxTexture.get_texture_margin */
  final def getTextureMargin(margin: Long): Double = {
    if (gdext.classes.StyleBoxTexture.mb_get_texture_margin == null) gdext.classes.StyleBoxTexture.mb_get_texture_margin = MethodBind.get("StyleBoxTexture", "get_texture_margin", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.StyleBoxTexture.mb_get_texture_margin, livePtr, margin)
  }

  /** StyleBoxTexture.set_expand_margin */
  final def setExpandMargin(margin: Long, size: Double): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_expand_margin == null) gdext.classes.StyleBoxTexture.mb_set_expand_margin = MethodBind.get("StyleBoxTexture", "set_expand_margin", 4290182280L)
    Ptrcall.callVoid2(gdext.classes.StyleBoxTexture.mb_set_expand_margin, livePtr, margin, size)
  }

  /** StyleBoxTexture.set_expand_margin_all */
  final def setExpandMarginAll(size: Double): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_expand_margin_all == null) gdext.classes.StyleBoxTexture.mb_set_expand_margin_all = MethodBind.get("StyleBoxTexture", "set_expand_margin_all", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_expand_margin_all, livePtr, size)
  }

  /** StyleBoxTexture.get_expand_margin */
  final def getExpandMargin(margin: Long): Double = {
    if (gdext.classes.StyleBoxTexture.mb_get_expand_margin == null) gdext.classes.StyleBoxTexture.mb_get_expand_margin = MethodBind.get("StyleBoxTexture", "get_expand_margin", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.StyleBoxTexture.mb_get_expand_margin, livePtr, margin)
  }

  /** StyleBoxTexture.set_region_rect */
  final def setRegionRect(region: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_region_rect == null) gdext.classes.StyleBoxTexture.mb_set_region_rect = MethodBind.get("StyleBoxTexture", "set_region_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_region_rect, livePtr, region)
  }

  /** StyleBoxTexture.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.StyleBoxTexture.mb_get_region_rect == null) gdext.classes.StyleBoxTexture.mb_get_region_rect = MethodBind.get("StyleBoxTexture", "get_region_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.StyleBoxTexture.mb_get_region_rect, livePtr)
  }

  /** StyleBoxTexture.set_draw_center */
  final def setDrawCenter(enable: Boolean): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_draw_center == null) gdext.classes.StyleBoxTexture.mb_set_draw_center = MethodBind.get("StyleBoxTexture", "set_draw_center", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_draw_center, livePtr, enable)
  }

  /** StyleBoxTexture.is_draw_center_enabled */
  final def isDrawCenterEnabled(): Boolean = {
    if (gdext.classes.StyleBoxTexture.mb_is_draw_center_enabled == null) gdext.classes.StyleBoxTexture.mb_is_draw_center_enabled = MethodBind.get("StyleBoxTexture", "is_draw_center_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.StyleBoxTexture.mb_is_draw_center_enabled, livePtr)
  }

  /** StyleBoxTexture.set_modulate */
  final def setModulate(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_modulate == null) gdext.classes.StyleBoxTexture.mb_set_modulate = MethodBind.get("StyleBoxTexture", "set_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_modulate, livePtr, color)
  }

  /** StyleBoxTexture.get_modulate */
  final def getModulate(): gdext.builtin.Color = {
    if (gdext.classes.StyleBoxTexture.mb_get_modulate == null) gdext.classes.StyleBoxTexture.mb_get_modulate = MethodBind.get("StyleBoxTexture", "get_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.StyleBoxTexture.mb_get_modulate, livePtr)
  }

  /** StyleBoxTexture.set_h_axis_stretch_mode */
  final def setHAxisStretchMode(mode: Long): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_h_axis_stretch_mode == null) gdext.classes.StyleBoxTexture.mb_set_h_axis_stretch_mode = MethodBind.get("StyleBoxTexture", "set_h_axis_stretch_mode", 2965538783L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_h_axis_stretch_mode, livePtr, mode)
  }

  /** StyleBoxTexture.get_h_axis_stretch_mode */
  final def getHAxisStretchMode(): Long = {
    if (gdext.classes.StyleBoxTexture.mb_get_h_axis_stretch_mode == null) gdext.classes.StyleBoxTexture.mb_get_h_axis_stretch_mode = MethodBind.get("StyleBoxTexture", "get_h_axis_stretch_mode", 3807744063L)
    Ptrcall.call0[Long](gdext.classes.StyleBoxTexture.mb_get_h_axis_stretch_mode, livePtr)
  }

  /** StyleBoxTexture.set_v_axis_stretch_mode */
  final def setVAxisStretchMode(mode: Long): Unit = {
    if (gdext.classes.StyleBoxTexture.mb_set_v_axis_stretch_mode == null) gdext.classes.StyleBoxTexture.mb_set_v_axis_stretch_mode = MethodBind.get("StyleBoxTexture", "set_v_axis_stretch_mode", 2965538783L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxTexture.mb_set_v_axis_stretch_mode, livePtr, mode)
  }

  /** StyleBoxTexture.get_v_axis_stretch_mode */
  final def getVAxisStretchMode(): Long = {
    if (gdext.classes.StyleBoxTexture.mb_get_v_axis_stretch_mode == null) gdext.classes.StyleBoxTexture.mb_get_v_axis_stretch_mode = MethodBind.get("StyleBoxTexture", "get_v_axis_stretch_mode", 3807744063L)
    Ptrcall.call0[Long](gdext.classes.StyleBoxTexture.mb_get_v_axis_stretch_mode, livePtr)
  }

}

object StyleBoxTexture {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_margin_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_margin_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_expand_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_center_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_axis_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_axis_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_axis_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_axis_stretch_mode: GDExtensionMethodBindPtr = null
}
