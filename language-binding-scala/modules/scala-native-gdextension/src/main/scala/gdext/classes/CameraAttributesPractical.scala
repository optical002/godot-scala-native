package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CameraAttributesPractical`, extends `CameraAttributes`. */
abstract class CameraAttributesPractical extends CameraAttributes {
  override def godotClassName: String = "CameraAttributesPractical"

  /** CameraAttributesPractical.set_dof_blur_far_enabled */
  final def setDofBlurFarEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_dof_blur_far_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CameraAttributesPractical.is_dof_blur_far_enabled */
  final def isDofBlurFarEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CameraAttributesPractical", "is_dof_blur_far_enabled", 36873697L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_dof_blur_far_distance */
  final def setDofBlurFarDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_dof_blur_far_distance", 373806689L), hostObject.objectPtr, distance)

  /** CameraAttributesPractical.get_dof_blur_far_distance */
  final def getDofBlurFarDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPractical", "get_dof_blur_far_distance", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_dof_blur_far_transition */
  final def setDofBlurFarTransition(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_dof_blur_far_transition", 373806689L), hostObject.objectPtr, distance)

  /** CameraAttributesPractical.get_dof_blur_far_transition */
  final def getDofBlurFarTransition(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPractical", "get_dof_blur_far_transition", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_dof_blur_near_enabled */
  final def setDofBlurNearEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_dof_blur_near_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CameraAttributesPractical.is_dof_blur_near_enabled */
  final def isDofBlurNearEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CameraAttributesPractical", "is_dof_blur_near_enabled", 36873697L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_dof_blur_near_distance */
  final def setDofBlurNearDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_dof_blur_near_distance", 373806689L), hostObject.objectPtr, distance)

  /** CameraAttributesPractical.get_dof_blur_near_distance */
  final def getDofBlurNearDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPractical", "get_dof_blur_near_distance", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_dof_blur_near_transition */
  final def setDofBlurNearTransition(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_dof_blur_near_transition", 373806689L), hostObject.objectPtr, distance)

  /** CameraAttributesPractical.get_dof_blur_near_transition */
  final def getDofBlurNearTransition(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPractical", "get_dof_blur_near_transition", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_dof_blur_amount */
  final def setDofBlurAmount(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_dof_blur_amount", 373806689L), hostObject.objectPtr, amount)

  /** CameraAttributesPractical.get_dof_blur_amount */
  final def getDofBlurAmount(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPractical", "get_dof_blur_amount", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_auto_exposure_max_sensitivity */
  final def setAutoExposureMaxSensitivity(max_sensitivity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_auto_exposure_max_sensitivity", 373806689L), hostObject.objectPtr, max_sensitivity)

  /** CameraAttributesPractical.get_auto_exposure_max_sensitivity */
  final def getAutoExposureMaxSensitivity(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPractical", "get_auto_exposure_max_sensitivity", 1740695150L), hostObject.objectPtr)

  /** CameraAttributesPractical.set_auto_exposure_min_sensitivity */
  final def setAutoExposureMinSensitivity(min_sensitivity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraAttributesPractical", "set_auto_exposure_min_sensitivity", 373806689L), hostObject.objectPtr, min_sensitivity)

  /** CameraAttributesPractical.get_auto_exposure_min_sensitivity */
  final def getAutoExposureMinSensitivity(): Double =
    Ptrcall.call0[Double](MethodBind.get("CameraAttributesPractical", "get_auto_exposure_min_sensitivity", 1740695150L), hostObject.objectPtr)

}
