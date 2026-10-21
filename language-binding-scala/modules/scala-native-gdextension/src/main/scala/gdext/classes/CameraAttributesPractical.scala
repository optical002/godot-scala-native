package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CameraAttributesPractical`, extends `CameraAttributes`. */
abstract class CameraAttributesPractical extends CameraAttributes {
  override def godotClassName: String = "CameraAttributesPractical"

  /** CameraAttributesPractical.set_dof_blur_far_enabled */
  final def setDofBlurFarEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_enabled == null) gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_enabled = MethodBind.get("CameraAttributesPractical", "set_dof_blur_far_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_enabled, livePtr, enabled)
  }

  /** CameraAttributesPractical.is_dof_blur_far_enabled */
  final def isDofBlurFarEnabled(): Boolean = {
    if (gdext.classes.CameraAttributesPractical.mb_is_dof_blur_far_enabled == null) gdext.classes.CameraAttributesPractical.mb_is_dof_blur_far_enabled = MethodBind.get("CameraAttributesPractical", "is_dof_blur_far_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CameraAttributesPractical.mb_is_dof_blur_far_enabled, livePtr)
  }

  /** CameraAttributesPractical.set_dof_blur_far_distance */
  final def setDofBlurFarDistance(distance: Double): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_distance == null) gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_distance = MethodBind.get("CameraAttributesPractical", "set_dof_blur_far_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_distance, livePtr, distance)
  }

  /** CameraAttributesPractical.get_dof_blur_far_distance */
  final def getDofBlurFarDistance(): Double = {
    if (gdext.classes.CameraAttributesPractical.mb_get_dof_blur_far_distance == null) gdext.classes.CameraAttributesPractical.mb_get_dof_blur_far_distance = MethodBind.get("CameraAttributesPractical", "get_dof_blur_far_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPractical.mb_get_dof_blur_far_distance, livePtr)
  }

  /** CameraAttributesPractical.set_dof_blur_far_transition */
  final def setDofBlurFarTransition(distance: Double): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_transition == null) gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_transition = MethodBind.get("CameraAttributesPractical", "set_dof_blur_far_transition", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_dof_blur_far_transition, livePtr, distance)
  }

  /** CameraAttributesPractical.get_dof_blur_far_transition */
  final def getDofBlurFarTransition(): Double = {
    if (gdext.classes.CameraAttributesPractical.mb_get_dof_blur_far_transition == null) gdext.classes.CameraAttributesPractical.mb_get_dof_blur_far_transition = MethodBind.get("CameraAttributesPractical", "get_dof_blur_far_transition", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPractical.mb_get_dof_blur_far_transition, livePtr)
  }

  /** CameraAttributesPractical.set_dof_blur_near_enabled */
  final def setDofBlurNearEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_enabled == null) gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_enabled = MethodBind.get("CameraAttributesPractical", "set_dof_blur_near_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_enabled, livePtr, enabled)
  }

  /** CameraAttributesPractical.is_dof_blur_near_enabled */
  final def isDofBlurNearEnabled(): Boolean = {
    if (gdext.classes.CameraAttributesPractical.mb_is_dof_blur_near_enabled == null) gdext.classes.CameraAttributesPractical.mb_is_dof_blur_near_enabled = MethodBind.get("CameraAttributesPractical", "is_dof_blur_near_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CameraAttributesPractical.mb_is_dof_blur_near_enabled, livePtr)
  }

  /** CameraAttributesPractical.set_dof_blur_near_distance */
  final def setDofBlurNearDistance(distance: Double): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_distance == null) gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_distance = MethodBind.get("CameraAttributesPractical", "set_dof_blur_near_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_distance, livePtr, distance)
  }

  /** CameraAttributesPractical.get_dof_blur_near_distance */
  final def getDofBlurNearDistance(): Double = {
    if (gdext.classes.CameraAttributesPractical.mb_get_dof_blur_near_distance == null) gdext.classes.CameraAttributesPractical.mb_get_dof_blur_near_distance = MethodBind.get("CameraAttributesPractical", "get_dof_blur_near_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPractical.mb_get_dof_blur_near_distance, livePtr)
  }

  /** CameraAttributesPractical.set_dof_blur_near_transition */
  final def setDofBlurNearTransition(distance: Double): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_transition == null) gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_transition = MethodBind.get("CameraAttributesPractical", "set_dof_blur_near_transition", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_dof_blur_near_transition, livePtr, distance)
  }

  /** CameraAttributesPractical.get_dof_blur_near_transition */
  final def getDofBlurNearTransition(): Double = {
    if (gdext.classes.CameraAttributesPractical.mb_get_dof_blur_near_transition == null) gdext.classes.CameraAttributesPractical.mb_get_dof_blur_near_transition = MethodBind.get("CameraAttributesPractical", "get_dof_blur_near_transition", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPractical.mb_get_dof_blur_near_transition, livePtr)
  }

  /** CameraAttributesPractical.set_dof_blur_amount */
  final def setDofBlurAmount(amount: Double): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_dof_blur_amount == null) gdext.classes.CameraAttributesPractical.mb_set_dof_blur_amount = MethodBind.get("CameraAttributesPractical", "set_dof_blur_amount", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_dof_blur_amount, livePtr, amount)
  }

  /** CameraAttributesPractical.get_dof_blur_amount */
  final def getDofBlurAmount(): Double = {
    if (gdext.classes.CameraAttributesPractical.mb_get_dof_blur_amount == null) gdext.classes.CameraAttributesPractical.mb_get_dof_blur_amount = MethodBind.get("CameraAttributesPractical", "get_dof_blur_amount", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPractical.mb_get_dof_blur_amount, livePtr)
  }

  /** CameraAttributesPractical.set_auto_exposure_max_sensitivity */
  final def setAutoExposureMaxSensitivity(max_sensitivity: Double): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_auto_exposure_max_sensitivity == null) gdext.classes.CameraAttributesPractical.mb_set_auto_exposure_max_sensitivity = MethodBind.get("CameraAttributesPractical", "set_auto_exposure_max_sensitivity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_auto_exposure_max_sensitivity, livePtr, max_sensitivity)
  }

  /** CameraAttributesPractical.get_auto_exposure_max_sensitivity */
  final def getAutoExposureMaxSensitivity(): Double = {
    if (gdext.classes.CameraAttributesPractical.mb_get_auto_exposure_max_sensitivity == null) gdext.classes.CameraAttributesPractical.mb_get_auto_exposure_max_sensitivity = MethodBind.get("CameraAttributesPractical", "get_auto_exposure_max_sensitivity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPractical.mb_get_auto_exposure_max_sensitivity, livePtr)
  }

  /** CameraAttributesPractical.set_auto_exposure_min_sensitivity */
  final def setAutoExposureMinSensitivity(min_sensitivity: Double): Unit = {
    if (gdext.classes.CameraAttributesPractical.mb_set_auto_exposure_min_sensitivity == null) gdext.classes.CameraAttributesPractical.mb_set_auto_exposure_min_sensitivity = MethodBind.get("CameraAttributesPractical", "set_auto_exposure_min_sensitivity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CameraAttributesPractical.mb_set_auto_exposure_min_sensitivity, livePtr, min_sensitivity)
  }

  /** CameraAttributesPractical.get_auto_exposure_min_sensitivity */
  final def getAutoExposureMinSensitivity(): Double = {
    if (gdext.classes.CameraAttributesPractical.mb_get_auto_exposure_min_sensitivity == null) gdext.classes.CameraAttributesPractical.mb_get_auto_exposure_min_sensitivity = MethodBind.get("CameraAttributesPractical", "get_auto_exposure_min_sensitivity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CameraAttributesPractical.mb_get_auto_exposure_min_sensitivity, livePtr)
  }

}

object CameraAttributesPractical {
  private[classes] var mb_set_dof_blur_far_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dof_blur_far_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dof_blur_far_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dof_blur_far_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dof_blur_far_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dof_blur_far_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dof_blur_near_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dof_blur_near_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dof_blur_near_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dof_blur_near_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dof_blur_near_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dof_blur_near_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dof_blur_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dof_blur_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_exposure_max_sensitivity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_exposure_max_sensitivity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_exposure_min_sensitivity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_exposure_min_sensitivity: GDExtensionMethodBindPtr = null
}
