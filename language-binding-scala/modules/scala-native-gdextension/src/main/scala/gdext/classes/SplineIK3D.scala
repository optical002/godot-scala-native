package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SplineIK3D`, extends `ChainIK3D`. */
abstract class SplineIK3D extends ChainIK3D {
  override def godotClassName: String = "SplineIK3D"

  /** SplineIK3D.set_tilt_enabled */
  final def setTiltEnabled(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.SplineIK3D.mb_set_tilt_enabled == null) gdext.classes.SplineIK3D.mb_set_tilt_enabled = MethodBind.get("SplineIK3D", "set_tilt_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SplineIK3D.mb_set_tilt_enabled, livePtr, index, enabled)
  }

  /** SplineIK3D.is_tilt_enabled */
  final def isTiltEnabled(index: Long): Boolean = {
    if (gdext.classes.SplineIK3D.mb_is_tilt_enabled == null) gdext.classes.SplineIK3D.mb_is_tilt_enabled = MethodBind.get("SplineIK3D", "is_tilt_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SplineIK3D.mb_is_tilt_enabled, livePtr, index)
  }

  /** SplineIK3D.set_tilt_fade_in */
  final def setTiltFadeIn(index: Long, size: Long): Unit = {
    if (gdext.classes.SplineIK3D.mb_set_tilt_fade_in == null) gdext.classes.SplineIK3D.mb_set_tilt_fade_in = MethodBind.get("SplineIK3D", "set_tilt_fade_in", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SplineIK3D.mb_set_tilt_fade_in, livePtr, index, size)
  }

  /** SplineIK3D.get_tilt_fade_in */
  final def getTiltFadeIn(index: Long): Long = {
    if (gdext.classes.SplineIK3D.mb_get_tilt_fade_in == null) gdext.classes.SplineIK3D.mb_get_tilt_fade_in = MethodBind.get("SplineIK3D", "get_tilt_fade_in", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SplineIK3D.mb_get_tilt_fade_in, livePtr, index)
  }

  /** SplineIK3D.set_tilt_fade_out */
  final def setTiltFadeOut(index: Long, size: Long): Unit = {
    if (gdext.classes.SplineIK3D.mb_set_tilt_fade_out == null) gdext.classes.SplineIK3D.mb_set_tilt_fade_out = MethodBind.get("SplineIK3D", "set_tilt_fade_out", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SplineIK3D.mb_set_tilt_fade_out, livePtr, index, size)
  }

  /** SplineIK3D.get_tilt_fade_out */
  final def getTiltFadeOut(index: Long): Long = {
    if (gdext.classes.SplineIK3D.mb_get_tilt_fade_out == null) gdext.classes.SplineIK3D.mb_get_tilt_fade_out = MethodBind.get("SplineIK3D", "get_tilt_fade_out", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SplineIK3D.mb_get_tilt_fade_out, livePtr, index)
  }

}

object SplineIK3D {
  private[classes] var mb_set_tilt_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tilt_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tilt_fade_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tilt_fade_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tilt_fade_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tilt_fade_out: GDExtensionMethodBindPtr = null
}
