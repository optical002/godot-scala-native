package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `StyleBoxTexture`, extends `StyleBox`. */
abstract class StyleBoxTexture extends StyleBox {

  /** StyleBoxTexture.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** StyleBoxTexture.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StyleBoxTexture", "get_texture", 3635182373L), hostObject.objectPtr)

  /** StyleBoxTexture.set_texture_margin */
  final def setTextureMargin(margin: Long, size: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("StyleBoxTexture", "set_texture_margin", 4290182280L), hostObject.objectPtr, margin, size)

  /** StyleBoxTexture.set_texture_margin_all */
  final def setTextureMarginAll(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_texture_margin_all", 373806689L), hostObject.objectPtr, size)

  /** StyleBoxTexture.get_texture_margin */
  final def getTextureMargin(margin: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("StyleBoxTexture", "get_texture_margin", 2869120046L), hostObject.objectPtr, margin)

  /** StyleBoxTexture.set_expand_margin */
  final def setExpandMargin(margin: Long, size: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("StyleBoxTexture", "set_expand_margin", 4290182280L), hostObject.objectPtr, margin, size)

  /** StyleBoxTexture.set_expand_margin_all */
  final def setExpandMarginAll(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_expand_margin_all", 373806689L), hostObject.objectPtr, size)

  /** StyleBoxTexture.get_expand_margin */
  final def getExpandMargin(margin: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("StyleBoxTexture", "get_expand_margin", 2869120046L), hostObject.objectPtr, margin)

  /** StyleBoxTexture.set_region_rect */
  final def setRegionRect(region: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_region_rect", 2046264180L), hostObject.objectPtr, region)

  /** StyleBoxTexture.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("StyleBoxTexture", "get_region_rect", 1639390495L), hostObject.objectPtr)

  /** StyleBoxTexture.set_draw_center */
  final def setDrawCenter(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_draw_center", 2586408642L), hostObject.objectPtr, enable)

  /** StyleBoxTexture.is_draw_center_enabled */
  final def isDrawCenterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("StyleBoxTexture", "is_draw_center_enabled", 36873697L), hostObject.objectPtr)

  /** StyleBoxTexture.set_modulate */
  final def setModulate(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_modulate", 2920490490L), hostObject.objectPtr, color)

  /** StyleBoxTexture.get_modulate */
  final def getModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("StyleBoxTexture", "get_modulate", 3444240500L), hostObject.objectPtr)

  /** StyleBoxTexture.set_h_axis_stretch_mode */
  final def setHAxisStretchMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_h_axis_stretch_mode", 2965538783L), hostObject.objectPtr, mode)

  /** StyleBoxTexture.get_h_axis_stretch_mode */
  final def getHAxisStretchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("StyleBoxTexture", "get_h_axis_stretch_mode", 3807744063L), hostObject.objectPtr)

  /** StyleBoxTexture.set_v_axis_stretch_mode */
  final def setVAxisStretchMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxTexture", "set_v_axis_stretch_mode", 2965538783L), hostObject.objectPtr, mode)

  /** StyleBoxTexture.get_v_axis_stretch_mode */
  final def getVAxisStretchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("StyleBoxTexture", "get_v_axis_stretch_mode", 3807744063L), hostObject.objectPtr)

}

object StyleBoxTexture {
  /** Class metadata for Gd[StyleBoxTexture] lifetime management and casting. */
  given GodotClass[StyleBoxTexture] with {
    def className = "StyleBoxTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): StyleBoxTexture = new StyleBoxTexture {}.withHost(o.objectPtr)
    def unwrap(t: StyleBoxTexture): GodotObject = t.hostObject
  }
}
