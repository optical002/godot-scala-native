package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CameraAttributes`, extends `Resource`. */
abstract class CameraAttributes extends Resource {

  /** CameraAttributes.set_exposure_multiplier */
  final def setExposureMultiplier(multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributes", "set_exposure_multiplier", 373806689L), hostObject.objectPtr, multiplier)

  /** CameraAttributes.get_exposure_multiplier */
  final def getExposureMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributes", "get_exposure_multiplier", 1740695150L), hostObject.objectPtr)

  /** CameraAttributes.set_exposure_sensitivity */
  final def setExposureSensitivity(sensitivity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributes", "set_exposure_sensitivity", 373806689L), hostObject.objectPtr, sensitivity)

  /** CameraAttributes.get_exposure_sensitivity */
  final def getExposureSensitivity(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributes", "get_exposure_sensitivity", 1740695150L), hostObject.objectPtr)

  /** CameraAttributes.set_auto_exposure_enabled */
  final def setAutoExposureEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributes", "set_auto_exposure_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CameraAttributes.is_auto_exposure_enabled */
  final def isAutoExposureEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CameraAttributes", "is_auto_exposure_enabled", 36873697L), hostObject.objectPtr)

  /** CameraAttributes.set_auto_exposure_speed */
  final def setAutoExposureSpeed(exposure_speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributes", "set_auto_exposure_speed", 373806689L), hostObject.objectPtr, exposure_speed)

  /** CameraAttributes.get_auto_exposure_speed */
  final def getAutoExposureSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributes", "get_auto_exposure_speed", 1740695150L), hostObject.objectPtr)

  /** CameraAttributes.set_auto_exposure_scale */
  final def setAutoExposureScale(exposure_grey: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributes", "set_auto_exposure_scale", 373806689L), hostObject.objectPtr, exposure_grey)

  /** CameraAttributes.get_auto_exposure_scale */
  final def getAutoExposureScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributes", "get_auto_exposure_scale", 1740695150L), hostObject.objectPtr)

}

object CameraAttributes {
  /** Class metadata for Gd[CameraAttributes] lifetime management and casting. */
  given GodotClass[CameraAttributes] with {
    def className = "CameraAttributes"
    def isRefCounted = true
    def wrap(o: GodotObject): CameraAttributes = new CameraAttributes {}.withHost(o.objectPtr)
    def unwrap(t: CameraAttributes): GodotObject = t.hostObject
  }
}
