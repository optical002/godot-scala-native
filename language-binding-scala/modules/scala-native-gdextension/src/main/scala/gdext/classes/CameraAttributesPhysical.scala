package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CameraAttributesPhysical`, extends `CameraAttributes`. */
abstract class CameraAttributesPhysical extends CameraAttributes {
  override def godotClassName: String = "CameraAttributesPhysical"

  /** CameraAttributesPhysical.set_aperture */
  final def setAperture(aperture: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_aperture == null) gdext.classes.CameraAttributesPhysical.mb_set_aperture = MethodBind.get("CameraAttributesPhysical", "set_aperture", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_aperture, livePtr, aperture)
  }

  /** CameraAttributesPhysical.get_aperture */
  final def getAperture(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_aperture == null) gdext.classes.CameraAttributesPhysical.mb_get_aperture = MethodBind.get("CameraAttributesPhysical", "get_aperture", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_aperture, livePtr)
  }

  /** CameraAttributesPhysical.set_shutter_speed */
  final def setShutterSpeed(shutterSpeed: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_shutter_speed == null) gdext.classes.CameraAttributesPhysical.mb_set_shutter_speed = MethodBind.get("CameraAttributesPhysical", "set_shutter_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_shutter_speed, livePtr, shutterSpeed)
  }

  /** CameraAttributesPhysical.get_shutter_speed */
  final def getShutterSpeed(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_shutter_speed == null) gdext.classes.CameraAttributesPhysical.mb_get_shutter_speed = MethodBind.get("CameraAttributesPhysical", "get_shutter_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_shutter_speed, livePtr)
  }

  /** CameraAttributesPhysical.set_focal_length */
  final def setFocalLength(focalLength: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_focal_length == null) gdext.classes.CameraAttributesPhysical.mb_set_focal_length = MethodBind.get("CameraAttributesPhysical", "set_focal_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_focal_length, livePtr, focalLength)
  }

  /** CameraAttributesPhysical.get_focal_length */
  final def getFocalLength(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_focal_length == null) gdext.classes.CameraAttributesPhysical.mb_get_focal_length = MethodBind.get("CameraAttributesPhysical", "get_focal_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_focal_length, livePtr)
  }

  /** CameraAttributesPhysical.set_focus_distance */
  final def setFocusDistance(focusDistance: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_focus_distance == null) gdext.classes.CameraAttributesPhysical.mb_set_focus_distance = MethodBind.get("CameraAttributesPhysical", "set_focus_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_focus_distance, livePtr, focusDistance)
  }

  /** CameraAttributesPhysical.get_focus_distance */
  final def getFocusDistance(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_focus_distance == null) gdext.classes.CameraAttributesPhysical.mb_get_focus_distance = MethodBind.get("CameraAttributesPhysical", "get_focus_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_focus_distance, livePtr)
  }

  /** CameraAttributesPhysical.set_near */
  final def setNear(near: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_near == null) gdext.classes.CameraAttributesPhysical.mb_set_near = MethodBind.get("CameraAttributesPhysical", "set_near", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_near, livePtr, near)
  }

  /** CameraAttributesPhysical.get_near */
  final def getNear(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_near == null) gdext.classes.CameraAttributesPhysical.mb_get_near = MethodBind.get("CameraAttributesPhysical", "get_near", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_near, livePtr)
  }

  /** CameraAttributesPhysical.set_far */
  final def setFar(far: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_far == null) gdext.classes.CameraAttributesPhysical.mb_set_far = MethodBind.get("CameraAttributesPhysical", "set_far", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_far, livePtr, far)
  }

  /** CameraAttributesPhysical.get_far */
  final def getFar(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_far == null) gdext.classes.CameraAttributesPhysical.mb_get_far = MethodBind.get("CameraAttributesPhysical", "get_far", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_far, livePtr)
  }

  /** CameraAttributesPhysical.get_fov */
  final def getFov(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_fov == null) gdext.classes.CameraAttributesPhysical.mb_get_fov = MethodBind.get("CameraAttributesPhysical", "get_fov", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_fov, livePtr)
  }

  /** CameraAttributesPhysical.set_auto_exposure_max_exposure_value */
  final def setAutoExposureMaxExposureValue(exposureValueMax: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_auto_exposure_max_exposure_value == null) gdext.classes.CameraAttributesPhysical.mb_set_auto_exposure_max_exposure_value = MethodBind.get("CameraAttributesPhysical", "set_auto_exposure_max_exposure_value", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_auto_exposure_max_exposure_value, livePtr, exposureValueMax)
  }

  /** CameraAttributesPhysical.get_auto_exposure_max_exposure_value */
  final def getAutoExposureMaxExposureValue(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_auto_exposure_max_exposure_value == null) gdext.classes.CameraAttributesPhysical.mb_get_auto_exposure_max_exposure_value = MethodBind.get("CameraAttributesPhysical", "get_auto_exposure_max_exposure_value", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_auto_exposure_max_exposure_value, livePtr)
  }

  /** CameraAttributesPhysical.set_auto_exposure_min_exposure_value */
  final def setAutoExposureMinExposureValue(exposureValueMin: Double): Unit = {
    if (gdext.classes.CameraAttributesPhysical.mb_set_auto_exposure_min_exposure_value == null) gdext.classes.CameraAttributesPhysical.mb_set_auto_exposure_min_exposure_value = MethodBind.get("CameraAttributesPhysical", "set_auto_exposure_min_exposure_value", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPhysical.mb_set_auto_exposure_min_exposure_value, livePtr, exposureValueMin)
  }

  /** CameraAttributesPhysical.get_auto_exposure_min_exposure_value */
  final def getAutoExposureMinExposureValue(): Double = {
    if (gdext.classes.CameraAttributesPhysical.mb_get_auto_exposure_min_exposure_value == null) gdext.classes.CameraAttributesPhysical.mb_get_auto_exposure_min_exposure_value = MethodBind.get("CameraAttributesPhysical", "get_auto_exposure_min_exposure_value", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPhysical.mb_get_auto_exposure_min_exposure_value, livePtr)
  }

}

object CameraAttributesPhysical {
  private[classes] var mb_set_aperture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aperture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shutter_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shutter_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_focal_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_focal_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_focus_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_focus_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_near: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_near: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_far: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_far: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fov: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_exposure_max_exposure_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_exposure_max_exposure_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_exposure_min_exposure_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_exposure_min_exposure_value: GDExtensionMethodBindPtr = null
}
