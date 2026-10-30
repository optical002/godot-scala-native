package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CameraAttributes`, extends `Resource`. */
abstract class CameraAttributes extends Resource {
  override def godotClassName: String = "CameraAttributes"

  /** CameraAttributes.set_exposure_multiplier */
  final def setExposureMultiplier(multiplier: Double): Unit = {
    if (gdext.classes.CameraAttributes.mb_set_exposure_multiplier == null) gdext.classes.CameraAttributes.mb_set_exposure_multiplier = MethodBind.get("CameraAttributes", "set_exposure_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributes.mb_set_exposure_multiplier, livePtr, multiplier)
  }

  /** CameraAttributes.get_exposure_multiplier */
  final def getExposureMultiplier(): Double = {
    if (gdext.classes.CameraAttributes.mb_get_exposure_multiplier == null) gdext.classes.CameraAttributes.mb_get_exposure_multiplier = MethodBind.get("CameraAttributes", "get_exposure_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributes.mb_get_exposure_multiplier, livePtr)
  }

  /** CameraAttributes.set_exposure_sensitivity */
  final def setExposureSensitivity(sensitivity: Double): Unit = {
    if (gdext.classes.CameraAttributes.mb_set_exposure_sensitivity == null) gdext.classes.CameraAttributes.mb_set_exposure_sensitivity = MethodBind.get("CameraAttributes", "set_exposure_sensitivity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributes.mb_set_exposure_sensitivity, livePtr, sensitivity)
  }

  /** CameraAttributes.get_exposure_sensitivity */
  final def getExposureSensitivity(): Double = {
    if (gdext.classes.CameraAttributes.mb_get_exposure_sensitivity == null) gdext.classes.CameraAttributes.mb_get_exposure_sensitivity = MethodBind.get("CameraAttributes", "get_exposure_sensitivity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributes.mb_get_exposure_sensitivity, livePtr)
  }

  /** CameraAttributes.set_auto_exposure_enabled */
  final def setAutoExposureEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CameraAttributes.mb_set_auto_exposure_enabled == null) gdext.classes.CameraAttributes.mb_set_auto_exposure_enabled = MethodBind.get("CameraAttributes", "set_auto_exposure_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributes.mb_set_auto_exposure_enabled, livePtr, enabled)
  }

  /** CameraAttributes.is_auto_exposure_enabled */
  final def isAutoExposureEnabled(): Boolean = {
    if (gdext.classes.CameraAttributes.mb_is_auto_exposure_enabled == null) gdext.classes.CameraAttributes.mb_is_auto_exposure_enabled = MethodBind.get("CameraAttributes", "is_auto_exposure_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CameraAttributes.mb_is_auto_exposure_enabled, livePtr)
  }

  /** CameraAttributes.set_auto_exposure_speed */
  final def setAutoExposureSpeed(exposureSpeed: Double): Unit = {
    if (gdext.classes.CameraAttributes.mb_set_auto_exposure_speed == null) gdext.classes.CameraAttributes.mb_set_auto_exposure_speed = MethodBind.get("CameraAttributes", "set_auto_exposure_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributes.mb_set_auto_exposure_speed, livePtr, exposureSpeed)
  }

  /** CameraAttributes.get_auto_exposure_speed */
  final def getAutoExposureSpeed(): Double = {
    if (gdext.classes.CameraAttributes.mb_get_auto_exposure_speed == null) gdext.classes.CameraAttributes.mb_get_auto_exposure_speed = MethodBind.get("CameraAttributes", "get_auto_exposure_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributes.mb_get_auto_exposure_speed, livePtr)
  }

  /** CameraAttributes.set_auto_exposure_scale */
  final def setAutoExposureScale(exposureGrey: Double): Unit = {
    if (gdext.classes.CameraAttributes.mb_set_auto_exposure_scale == null) gdext.classes.CameraAttributes.mb_set_auto_exposure_scale = MethodBind.get("CameraAttributes", "set_auto_exposure_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributes.mb_set_auto_exposure_scale, livePtr, exposureGrey)
  }

  /** CameraAttributes.get_auto_exposure_scale */
  final def getAutoExposureScale(): Double = {
    if (gdext.classes.CameraAttributes.mb_get_auto_exposure_scale == null) gdext.classes.CameraAttributes.mb_get_auto_exposure_scale = MethodBind.get("CameraAttributes", "get_auto_exposure_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributes.mb_get_auto_exposure_scale, livePtr)
  }

}

object CameraAttributes {
  private[classes] var mb_set_exposure_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exposure_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exposure_sensitivity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exposure_sensitivity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_exposure_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_exposure_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_exposure_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_exposure_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_exposure_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_exposure_scale: GDExtensionMethodBindPtr = null
}
