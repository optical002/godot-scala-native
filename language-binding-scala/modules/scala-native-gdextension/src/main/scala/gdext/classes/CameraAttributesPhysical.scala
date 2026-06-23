package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CameraAttributesPhysical`, extends `CameraAttributes`. */
abstract class CameraAttributesPhysical extends CameraAttributes {

  /** CameraAttributesPhysical.set_aperture */
  final def setAperture(aperture: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_aperture", 373806689L), hostObject.objectPtr, aperture)

  /** CameraAttributesPhysical.get_aperture */
  final def getAperture(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_aperture", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.set_shutter_speed */
  final def setShutterSpeed(shutter_speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_shutter_speed", 373806689L), hostObject.objectPtr, shutter_speed)

  /** CameraAttributesPhysical.get_shutter_speed */
  final def getShutterSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_shutter_speed", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.set_focal_length */
  final def setFocalLength(focal_length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_focal_length", 373806689L), hostObject.objectPtr, focal_length)

  /** CameraAttributesPhysical.get_focal_length */
  final def getFocalLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_focal_length", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.set_focus_distance */
  final def setFocusDistance(focus_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_focus_distance", 373806689L), hostObject.objectPtr, focus_distance)

  /** CameraAttributesPhysical.get_focus_distance */
  final def getFocusDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_focus_distance", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.set_near */
  final def setNear(near: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_near", 373806689L), hostObject.objectPtr, near)

  /** CameraAttributesPhysical.get_near */
  final def getNear(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_near", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.set_far */
  final def setFar(far: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_far", 373806689L), hostObject.objectPtr, far)

  /** CameraAttributesPhysical.get_far */
  final def getFar(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_far", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.get_fov */
  final def getFov(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_fov", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.set_auto_exposure_max_exposure_value */
  final def setAutoExposureMaxExposureValue(exposure_value_max: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_auto_exposure_max_exposure_value", 373806689L), hostObject.objectPtr, exposure_value_max)

  /** CameraAttributesPhysical.get_auto_exposure_max_exposure_value */
  final def getAutoExposureMaxExposureValue(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_auto_exposure_max_exposure_value", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPhysical.set_auto_exposure_min_exposure_value */
  final def setAutoExposureMinExposureValue(exposure_value_min: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPhysical", "set_auto_exposure_min_exposure_value", 373806689L), hostObject.objectPtr, exposure_value_min)

  /** CameraAttributesPhysical.get_auto_exposure_min_exposure_value */
  final def getAutoExposureMinExposureValue(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPhysical", "get_auto_exposure_min_exposure_value", 1740695150L), hostObject.objectPtr)

}

object CameraAttributesPhysical {
  /** Class metadata for Gd[CameraAttributesPhysical] lifetime management and casting. */
  given GodotClass[CameraAttributesPhysical] with {
    def className = "CameraAttributesPhysical"
    def isRefCounted = true
    def wrap(o: GodotObject): CameraAttributesPhysical = new CameraAttributesPhysical {}.withHost(o.objectPtr)
    def unwrap(t: CameraAttributesPhysical): GodotObject = t.hostObject
  }
}
