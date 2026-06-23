package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRDpadBindingModifier`, extends `OpenXRIPBindingModifier`. */
abstract class OpenXRDpadBindingModifier extends OpenXRIPBindingModifier {

  /** OpenXRDpadBindingModifier.set_action_set */
  final def setActionSet(action_set: OpenXRActionSet): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_action_set", 2093310581L), hostObject.objectPtr, action_set.hostObject)

  /** OpenXRDpadBindingModifier.get_action_set */
  final def getActionSet(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRDpadBindingModifier", "get_action_set", 619941079L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_input_path */
  final def setInputPath(input_path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_input_path", 83702148L), hostObject.objectPtr, input_path)

  /** OpenXRDpadBindingModifier.get_input_path */
  final def getInputPath(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRDpadBindingModifier", "get_input_path", 201670096L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_threshold */
  final def setThreshold(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_threshold", 373806689L), hostObject.objectPtr, threshold)

  /** OpenXRDpadBindingModifier.get_threshold */
  final def getThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRDpadBindingModifier", "get_threshold", 1740695150L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_threshold_released */
  final def setThresholdReleased(threshold_released: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_threshold_released", 373806689L), hostObject.objectPtr, threshold_released)

  /** OpenXRDpadBindingModifier.get_threshold_released */
  final def getThresholdReleased(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRDpadBindingModifier", "get_threshold_released", 1740695150L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_center_region */
  final def setCenterRegion(center_region: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_center_region", 373806689L), hostObject.objectPtr, center_region)

  /** OpenXRDpadBindingModifier.get_center_region */
  final def getCenterRegion(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRDpadBindingModifier", "get_center_region", 1740695150L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_wedge_angle */
  final def setWedgeAngle(wedge_angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_wedge_angle", 373806689L), hostObject.objectPtr, wedge_angle)

  /** OpenXRDpadBindingModifier.get_wedge_angle */
  final def getWedgeAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRDpadBindingModifier", "get_wedge_angle", 1740695150L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_is_sticky */
  final def setIsSticky(is_sticky: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_is_sticky", 2586408642L), hostObject.objectPtr, is_sticky)

  /** OpenXRDpadBindingModifier.get_is_sticky */
  final def getIsSticky(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRDpadBindingModifier", "get_is_sticky", 36873697L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_on_haptic */
  final def setOnHaptic(haptic: OpenXRHapticBase): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_on_haptic", 2998020150L), hostObject.objectPtr, haptic.hostObject)

  /** OpenXRDpadBindingModifier.get_on_haptic */
  final def getOnHaptic(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRDpadBindingModifier", "get_on_haptic", 922310751L), hostObject.objectPtr)

  /** OpenXRDpadBindingModifier.set_off_haptic */
  final def setOffHaptic(haptic: OpenXRHapticBase): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRDpadBindingModifier", "set_off_haptic", 2998020150L), hostObject.objectPtr, haptic.hostObject)

  /** OpenXRDpadBindingModifier.get_off_haptic */
  final def getOffHaptic(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRDpadBindingModifier", "get_off_haptic", 922310751L), hostObject.objectPtr)

}

object OpenXRDpadBindingModifier {
  /** Class metadata for Gd[OpenXRDpadBindingModifier] lifetime management and casting. */
  given GodotClass[OpenXRDpadBindingModifier] with {
    def className = "OpenXRDpadBindingModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRDpadBindingModifier = new OpenXRDpadBindingModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRDpadBindingModifier): GodotObject = t.hostObject
  }
}
