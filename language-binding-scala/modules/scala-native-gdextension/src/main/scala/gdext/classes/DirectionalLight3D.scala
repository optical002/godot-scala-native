package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DirectionalLight3D`, extends `Light3D`. */
abstract class DirectionalLight3D extends Light3D {
  override def godotClassName: String = "DirectionalLight3D"

  /** DirectionalLight3D.set_shadow_mode */
  final def setShadowMode(mode: Long): Unit = {
    if (gdext.classes.DirectionalLight3D.mb_set_shadow_mode == null) gdext.classes.DirectionalLight3D.mb_set_shadow_mode = MethodBind.get("DirectionalLight3D", "set_shadow_mode", 1261211726L)
    Ptrcall.callVoid1(gdext.classes.DirectionalLight3D.mb_set_shadow_mode, livePtr, mode)
  }

  /** DirectionalLight3D.get_shadow_mode */
  final def getShadowMode(): Long = {
    if (gdext.classes.DirectionalLight3D.mb_get_shadow_mode == null) gdext.classes.DirectionalLight3D.mb_get_shadow_mode = MethodBind.get("DirectionalLight3D", "get_shadow_mode", 2765228544L)
    Ptrcall.call0[Long](gdext.classes.DirectionalLight3D.mb_get_shadow_mode, livePtr)
  }

  /** DirectionalLight3D.set_blend_splits */
  final def setBlendSplits(enabled: Boolean): Unit = {
    if (gdext.classes.DirectionalLight3D.mb_set_blend_splits == null) gdext.classes.DirectionalLight3D.mb_set_blend_splits = MethodBind.get("DirectionalLight3D", "set_blend_splits", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.DirectionalLight3D.mb_set_blend_splits, livePtr, enabled)
  }

  /** DirectionalLight3D.is_blend_splits_enabled */
  final def isBlendSplitsEnabled(): Boolean = {
    if (gdext.classes.DirectionalLight3D.mb_is_blend_splits_enabled == null) gdext.classes.DirectionalLight3D.mb_is_blend_splits_enabled = MethodBind.get("DirectionalLight3D", "is_blend_splits_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DirectionalLight3D.mb_is_blend_splits_enabled, livePtr)
  }

  /** DirectionalLight3D.set_sky_mode */
  final def setSkyMode(mode: Long): Unit = {
    if (gdext.classes.DirectionalLight3D.mb_set_sky_mode == null) gdext.classes.DirectionalLight3D.mb_set_sky_mode = MethodBind.get("DirectionalLight3D", "set_sky_mode", 2691194817L)
    Ptrcall.callVoid1(gdext.classes.DirectionalLight3D.mb_set_sky_mode, livePtr, mode)
  }

  /** DirectionalLight3D.get_sky_mode */
  final def getSkyMode(): Long = {
    if (gdext.classes.DirectionalLight3D.mb_get_sky_mode == null) gdext.classes.DirectionalLight3D.mb_get_sky_mode = MethodBind.get("DirectionalLight3D", "get_sky_mode", 3819982774L)
    Ptrcall.call0[Long](gdext.classes.DirectionalLight3D.mb_get_sky_mode, livePtr)
  }

}

object DirectionalLight3D {
  private[classes] var mb_set_shadow_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_splits: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_blend_splits_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_mode: GDExtensionMethodBindPtr = null
}
