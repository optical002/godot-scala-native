package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NinePatchRect`, extends `Control`. */
abstract class NinePatchRect extends Control {
  override def godotClassName: String = "NinePatchRect"

  /** NinePatchRect.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.NinePatchRect.mb_set_texture == null) gdext.classes.NinePatchRect.mb_set_texture = MethodBind.get("NinePatchRect", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.NinePatchRect.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** NinePatchRect.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.NinePatchRect.mb_get_texture == null) gdext.classes.NinePatchRect.mb_get_texture = MethodBind.get("NinePatchRect", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.NinePatchRect.mb_get_texture, livePtr))
  }

  /** NinePatchRect.set_patch_margin */
  final def setPatchMargin(margin: Long, value: Long): Unit = {
    if (gdext.classes.NinePatchRect.mb_set_patch_margin == null) gdext.classes.NinePatchRect.mb_set_patch_margin = MethodBind.get("NinePatchRect", "set_patch_margin", 437707142L)
    Ptrcall.callVoid2(gdext.classes.NinePatchRect.mb_set_patch_margin, livePtr, margin, value)
  }

  /** NinePatchRect.get_patch_margin */
  final def getPatchMargin(margin: Long): Long = {
    if (gdext.classes.NinePatchRect.mb_get_patch_margin == null) gdext.classes.NinePatchRect.mb_get_patch_margin = MethodBind.get("NinePatchRect", "get_patch_margin", 1983885014L)
    Ptrcall.call1[Long, Long](gdext.classes.NinePatchRect.mb_get_patch_margin, livePtr, margin)
  }

  /** NinePatchRect.set_region_rect */
  final def setRegionRect(rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.NinePatchRect.mb_set_region_rect == null) gdext.classes.NinePatchRect.mb_set_region_rect = MethodBind.get("NinePatchRect", "set_region_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.NinePatchRect.mb_set_region_rect, livePtr, rect)
  }

  /** NinePatchRect.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.NinePatchRect.mb_get_region_rect == null) gdext.classes.NinePatchRect.mb_get_region_rect = MethodBind.get("NinePatchRect", "get_region_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.NinePatchRect.mb_get_region_rect, livePtr)
  }

  /** NinePatchRect.set_draw_center */
  final def setDrawCenter(draw_center: Boolean): Unit = {
    if (gdext.classes.NinePatchRect.mb_set_draw_center == null) gdext.classes.NinePatchRect.mb_set_draw_center = MethodBind.get("NinePatchRect", "set_draw_center", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NinePatchRect.mb_set_draw_center, livePtr, draw_center)
  }

  /** NinePatchRect.is_draw_center_enabled */
  final def isDrawCenterEnabled(): Boolean = {
    if (gdext.classes.NinePatchRect.mb_is_draw_center_enabled == null) gdext.classes.NinePatchRect.mb_is_draw_center_enabled = MethodBind.get("NinePatchRect", "is_draw_center_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NinePatchRect.mb_is_draw_center_enabled, livePtr)
  }

  /** NinePatchRect.set_h_axis_stretch_mode */
  final def setHAxisStretchMode(mode: Long): Unit = {
    if (gdext.classes.NinePatchRect.mb_set_h_axis_stretch_mode == null) gdext.classes.NinePatchRect.mb_set_h_axis_stretch_mode = MethodBind.get("NinePatchRect", "set_h_axis_stretch_mode", 3219608417L)
    Ptrcall.callVoid1(gdext.classes.NinePatchRect.mb_set_h_axis_stretch_mode, livePtr, mode)
  }

  /** NinePatchRect.get_h_axis_stretch_mode */
  final def getHAxisStretchMode(): Long = {
    if (gdext.classes.NinePatchRect.mb_get_h_axis_stretch_mode == null) gdext.classes.NinePatchRect.mb_get_h_axis_stretch_mode = MethodBind.get("NinePatchRect", "get_h_axis_stretch_mode", 3317113799L)
    Ptrcall.call0[Long](gdext.classes.NinePatchRect.mb_get_h_axis_stretch_mode, livePtr)
  }

  /** NinePatchRect.set_v_axis_stretch_mode */
  final def setVAxisStretchMode(mode: Long): Unit = {
    if (gdext.classes.NinePatchRect.mb_set_v_axis_stretch_mode == null) gdext.classes.NinePatchRect.mb_set_v_axis_stretch_mode = MethodBind.get("NinePatchRect", "set_v_axis_stretch_mode", 3219608417L)
    Ptrcall.callVoid1(gdext.classes.NinePatchRect.mb_set_v_axis_stretch_mode, livePtr, mode)
  }

  /** NinePatchRect.get_v_axis_stretch_mode */
  final def getVAxisStretchMode(): Long = {
    if (gdext.classes.NinePatchRect.mb_get_v_axis_stretch_mode == null) gdext.classes.NinePatchRect.mb_get_v_axis_stretch_mode = MethodBind.get("NinePatchRect", "get_v_axis_stretch_mode", 3317113799L)
    Ptrcall.call0[Long](gdext.classes.NinePatchRect.mb_get_v_axis_stretch_mode, livePtr)
  }

}

object NinePatchRect {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_patch_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_patch_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_center_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_axis_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_axis_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_axis_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_axis_stretch_mode: GDExtensionMethodBindPtr = null
}
