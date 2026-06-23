package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRAnalogThresholdModifier`, extends `OpenXRActionBindingModifier`. */
abstract class OpenXRAnalogThresholdModifier extends OpenXRActionBindingModifier {

  /** OpenXRAnalogThresholdModifier.set_on_threshold */
  final def setOnThreshold(on_threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAnalogThresholdModifier", "set_on_threshold", 373806689L), hostObject.objectPtr, on_threshold)

  /** OpenXRAnalogThresholdModifier.get_on_threshold */
  final def getOnThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRAnalogThresholdModifier", "get_on_threshold", 1740695150L), hostObject.objectPtr)

  /** OpenXRAnalogThresholdModifier.set_off_threshold */
  final def setOffThreshold(off_threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAnalogThresholdModifier", "set_off_threshold", 373806689L), hostObject.objectPtr, off_threshold)

  /** OpenXRAnalogThresholdModifier.get_off_threshold */
  final def getOffThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRAnalogThresholdModifier", "get_off_threshold", 1740695150L), hostObject.objectPtr)

  /** OpenXRAnalogThresholdModifier.set_on_haptic */
  final def setOnHaptic(haptic: OpenXRHapticBase): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAnalogThresholdModifier", "set_on_haptic", 2998020150L), hostObject.objectPtr, haptic.hostObject)

  /** OpenXRAnalogThresholdModifier.get_on_haptic */
  final def getOnHaptic(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRAnalogThresholdModifier", "get_on_haptic", 922310751L), hostObject.objectPtr)

  /** OpenXRAnalogThresholdModifier.set_off_haptic */
  final def setOffHaptic(haptic: OpenXRHapticBase): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAnalogThresholdModifier", "set_off_haptic", 2998020150L), hostObject.objectPtr, haptic.hostObject)

  /** OpenXRAnalogThresholdModifier.get_off_haptic */
  final def getOffHaptic(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRAnalogThresholdModifier", "get_off_haptic", 922310751L), hostObject.objectPtr)

}

object OpenXRAnalogThresholdModifier {
  /** Class metadata for Gd[OpenXRAnalogThresholdModifier] lifetime management and casting. */
  given GodotClass[OpenXRAnalogThresholdModifier] with {
    def className = "OpenXRAnalogThresholdModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRAnalogThresholdModifier = new OpenXRAnalogThresholdModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRAnalogThresholdModifier): GodotObject = t.hostObject
  }
}
