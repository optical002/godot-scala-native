package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRVRS`, extends `Object`. */
abstract class XRVRS extends Object {
  override def godotClassName: String = "XRVRS"

  /** XRVRS.get_vrs_min_radius */
  final def getVrsMinRadius(): Double = {
    if (gdext.classes.XRVRS.mb_get_vrs_min_radius == null) gdext.classes.XRVRS.mb_get_vrs_min_radius = MethodBind.get("XRVRS", "get_vrs_min_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.XRVRS.mb_get_vrs_min_radius, livePtr)
  }

  /** XRVRS.set_vrs_min_radius */
  final def setVrsMinRadius(radius: Double): Unit = {
    if (gdext.classes.XRVRS.mb_set_vrs_min_radius == null) gdext.classes.XRVRS.mb_set_vrs_min_radius = MethodBind.get("XRVRS", "set_vrs_min_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.XRVRS.mb_set_vrs_min_radius, livePtr, radius)
  }

  /** XRVRS.get_vrs_strength */
  final def getVrsStrength(): Double = {
    if (gdext.classes.XRVRS.mb_get_vrs_strength == null) gdext.classes.XRVRS.mb_get_vrs_strength = MethodBind.get("XRVRS", "get_vrs_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.XRVRS.mb_get_vrs_strength, livePtr)
  }

  /** XRVRS.set_vrs_strength */
  final def setVrsStrength(strength: Double): Unit = {
    if (gdext.classes.XRVRS.mb_set_vrs_strength == null) gdext.classes.XRVRS.mb_set_vrs_strength = MethodBind.get("XRVRS", "set_vrs_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.XRVRS.mb_set_vrs_strength, livePtr, strength)
  }

  /** XRVRS.get_vrs_render_region */
  final def getVrsRenderRegion(): gdext.builtin.Rect2i = {
    if (gdext.classes.XRVRS.mb_get_vrs_render_region == null) gdext.classes.XRVRS.mb_get_vrs_render_region = MethodBind.get("XRVRS", "get_vrs_render_region", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.XRVRS.mb_get_vrs_render_region, livePtr)
  }

  /** XRVRS.set_vrs_render_region */
  final def setVrsRenderRegion(render_region: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.XRVRS.mb_set_vrs_render_region == null) gdext.classes.XRVRS.mb_set_vrs_render_region = MethodBind.get("XRVRS", "set_vrs_render_region", 1763793166L)
    Ptrcall.callVoid1(gdext.classes.XRVRS.mb_set_vrs_render_region, livePtr, render_region)
  }

}

object XRVRS {
  private[classes] var mb_get_vrs_min_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_min_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_render_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_render_region: GDExtensionMethodBindPtr = null
}
