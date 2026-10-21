package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRDpadBindingModifier`, extends `OpenXRIPBindingModifier`. */
abstract class OpenXRDpadBindingModifier extends OpenXRIPBindingModifier {
  override def godotClassName: String = "OpenXRDpadBindingModifier"

  /** OpenXRDpadBindingModifier.set_action_set */
  final def setActionSet(action_set: OpenXRActionSet): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_action_set == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_action_set = MethodBind.get("OpenXRDpadBindingModifier", "set_action_set", 2093310581L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_action_set, livePtr, Wrappers.handle(action_set))
  }

  /** OpenXRDpadBindingModifier.get_action_set. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getActionSet(): OpenXRActionSet = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_action_set == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_action_set = MethodBind.get("OpenXRDpadBindingModifier", "get_action_set", 619941079L)
    Wrappers.owned[OpenXRActionSet](Ptrcall.call0[Long](gdext.classes.OpenXRDpadBindingModifier.mb_get_action_set, livePtr))
  }

  /** OpenXRDpadBindingModifier.set_input_path */
  final def setInputPath(input_path: String): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_input_path == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_input_path = MethodBind.get("OpenXRDpadBindingModifier", "set_input_path", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_input_path, livePtr, input_path)
  }

  /** OpenXRDpadBindingModifier.get_input_path */
  final def getInputPath(): String = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_input_path == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_input_path = MethodBind.get("OpenXRDpadBindingModifier", "get_input_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRDpadBindingModifier.mb_get_input_path, livePtr)
  }

  /** OpenXRDpadBindingModifier.set_threshold */
  final def setThreshold(threshold: Double): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_threshold == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_threshold = MethodBind.get("OpenXRDpadBindingModifier", "set_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_threshold, livePtr, threshold)
  }

  /** OpenXRDpadBindingModifier.get_threshold */
  final def getThreshold(): Double = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_threshold == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_threshold = MethodBind.get("OpenXRDpadBindingModifier", "get_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRDpadBindingModifier.mb_get_threshold, livePtr)
  }

  /** OpenXRDpadBindingModifier.set_threshold_released */
  final def setThresholdReleased(threshold_released: Double): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_threshold_released == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_threshold_released = MethodBind.get("OpenXRDpadBindingModifier", "set_threshold_released", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_threshold_released, livePtr, threshold_released)
  }

  /** OpenXRDpadBindingModifier.get_threshold_released */
  final def getThresholdReleased(): Double = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_threshold_released == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_threshold_released = MethodBind.get("OpenXRDpadBindingModifier", "get_threshold_released", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRDpadBindingModifier.mb_get_threshold_released, livePtr)
  }

  /** OpenXRDpadBindingModifier.set_center_region */
  final def setCenterRegion(center_region: Double): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_center_region == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_center_region = MethodBind.get("OpenXRDpadBindingModifier", "set_center_region", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_center_region, livePtr, center_region)
  }

  /** OpenXRDpadBindingModifier.get_center_region */
  final def getCenterRegion(): Double = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_center_region == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_center_region = MethodBind.get("OpenXRDpadBindingModifier", "get_center_region", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRDpadBindingModifier.mb_get_center_region, livePtr)
  }

  /** OpenXRDpadBindingModifier.set_wedge_angle */
  final def setWedgeAngle(wedge_angle: Double): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_wedge_angle == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_wedge_angle = MethodBind.get("OpenXRDpadBindingModifier", "set_wedge_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_wedge_angle, livePtr, wedge_angle)
  }

  /** OpenXRDpadBindingModifier.get_wedge_angle */
  final def getWedgeAngle(): Double = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_wedge_angle == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_wedge_angle = MethodBind.get("OpenXRDpadBindingModifier", "get_wedge_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRDpadBindingModifier.mb_get_wedge_angle, livePtr)
  }

  /** OpenXRDpadBindingModifier.set_is_sticky */
  final def setIsSticky(is_sticky: Boolean): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_is_sticky == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_is_sticky = MethodBind.get("OpenXRDpadBindingModifier", "set_is_sticky", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_is_sticky, livePtr, is_sticky)
  }

  /** OpenXRDpadBindingModifier.get_is_sticky */
  final def getIsSticky(): Boolean = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_is_sticky == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_is_sticky = MethodBind.get("OpenXRDpadBindingModifier", "get_is_sticky", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRDpadBindingModifier.mb_get_is_sticky, livePtr)
  }

  /** OpenXRDpadBindingModifier.set_on_haptic */
  final def setOnHaptic(haptic: OpenXRHapticBase): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_on_haptic == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_on_haptic = MethodBind.get("OpenXRDpadBindingModifier", "set_on_haptic", 2998020150L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_on_haptic, livePtr, Wrappers.handle(haptic))
  }

  /** OpenXRDpadBindingModifier.get_on_haptic. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOnHaptic(): OpenXRHapticBase = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_on_haptic == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_on_haptic = MethodBind.get("OpenXRDpadBindingModifier", "get_on_haptic", 922310751L)
    Wrappers.owned[OpenXRHapticBase](Ptrcall.call0[Long](gdext.classes.OpenXRDpadBindingModifier.mb_get_on_haptic, livePtr))
  }

  /** OpenXRDpadBindingModifier.set_off_haptic */
  final def setOffHaptic(haptic: OpenXRHapticBase): Unit = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_set_off_haptic == null) gdext.classes.OpenXRDpadBindingModifier.mb_set_off_haptic = MethodBind.get("OpenXRDpadBindingModifier", "set_off_haptic", 2998020150L)
    Ptrcall.callVoid1(gdext.classes.OpenXRDpadBindingModifier.mb_set_off_haptic, livePtr, Wrappers.handle(haptic))
  }

  /** OpenXRDpadBindingModifier.get_off_haptic. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOffHaptic(): OpenXRHapticBase = {
    if (gdext.classes.OpenXRDpadBindingModifier.mb_get_off_haptic == null) gdext.classes.OpenXRDpadBindingModifier.mb_get_off_haptic = MethodBind.get("OpenXRDpadBindingModifier", "get_off_haptic", 922310751L)
    Wrappers.owned[OpenXRHapticBase](Ptrcall.call0[Long](gdext.classes.OpenXRDpadBindingModifier.mb_get_off_haptic, livePtr))
  }

}

object OpenXRDpadBindingModifier {
  private[classes] var mb_set_action_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_threshold_released: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_threshold_released: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wedge_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wedge_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_is_sticky: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_sticky: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_on_haptic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_on_haptic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_off_haptic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_off_haptic: GDExtensionMethodBindPtr = null
}
