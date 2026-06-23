package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NinePatchRect`, extends `Control`. */
abstract class NinePatchRect extends Control {

  /** NinePatchRect.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("NinePatchRect", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** NinePatchRect.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NinePatchRect", "get_texture", 3635182373L), hostObject.objectPtr)

  /** NinePatchRect.set_patch_margin */
  final def setPatchMargin(margin: Long, value: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("NinePatchRect", "set_patch_margin", 437707142L), hostObject.objectPtr, margin, value)

  /** NinePatchRect.get_patch_margin */
  final def getPatchMargin(margin: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("NinePatchRect", "get_patch_margin", 1983885014L), hostObject.objectPtr, margin)

  /** NinePatchRect.set_region_rect */
  final def setRegionRect(rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NinePatchRect", "set_region_rect", 2046264180L), hostObject.objectPtr, rect)

  /** NinePatchRect.get_region_rect */
  final def getRegionRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("NinePatchRect", "get_region_rect", 1639390495L), hostObject.objectPtr)

  /** NinePatchRect.set_draw_center */
  final def setDrawCenter(draw_center: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NinePatchRect", "set_draw_center", 2586408642L), hostObject.objectPtr, draw_center)

  /** NinePatchRect.is_draw_center_enabled */
  final def isDrawCenterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NinePatchRect", "is_draw_center_enabled", 36873697L), hostObject.objectPtr)

  /** NinePatchRect.set_h_axis_stretch_mode */
  final def setHAxisStretchMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NinePatchRect", "set_h_axis_stretch_mode", 3219608417L), hostObject.objectPtr, mode)

  /** NinePatchRect.get_h_axis_stretch_mode */
  final def getHAxisStretchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("NinePatchRect", "get_h_axis_stretch_mode", 3317113799L), hostObject.objectPtr)

  /** NinePatchRect.set_v_axis_stretch_mode */
  final def setVAxisStretchMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NinePatchRect", "set_v_axis_stretch_mode", 3219608417L), hostObject.objectPtr, mode)

  /** NinePatchRect.get_v_axis_stretch_mode */
  final def getVAxisStretchMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("NinePatchRect", "get_v_axis_stretch_mode", 3317113799L), hostObject.objectPtr)

}

object NinePatchRect {
  /** Class metadata for Gd[NinePatchRect] lifetime management and casting. */
  given GodotClass[NinePatchRect] with {
    def className = "NinePatchRect"
    def isRefCounted = false
    def wrap(o: GodotObject): NinePatchRect = new NinePatchRect {}.withHost(o.objectPtr)
    def unwrap(t: NinePatchRect): GodotObject = t.hostObject
  }
}
