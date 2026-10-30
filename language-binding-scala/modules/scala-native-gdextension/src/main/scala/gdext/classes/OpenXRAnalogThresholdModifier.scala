package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRAnalogThresholdModifier`, extends `OpenXRActionBindingModifier`. */
abstract class OpenXRAnalogThresholdModifier extends OpenXRActionBindingModifier {
  override def godotClassName: String = "OpenXRAnalogThresholdModifier"

  /** OpenXRAnalogThresholdModifier.set_on_threshold */
  final def setOnThreshold(onThreshold: Double): Unit = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_set_on_threshold == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_set_on_threshold = MethodBind.get("OpenXRAnalogThresholdModifier", "set_on_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAnalogThresholdModifier.mb_set_on_threshold, livePtr, onThreshold)
  }

  /** OpenXRAnalogThresholdModifier.get_on_threshold */
  final def getOnThreshold(): Double = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_get_on_threshold == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_get_on_threshold = MethodBind.get("OpenXRAnalogThresholdModifier", "get_on_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRAnalogThresholdModifier.mb_get_on_threshold, livePtr)
  }

  /** OpenXRAnalogThresholdModifier.set_off_threshold */
  final def setOffThreshold(offThreshold: Double): Unit = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_set_off_threshold == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_set_off_threshold = MethodBind.get("OpenXRAnalogThresholdModifier", "set_off_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAnalogThresholdModifier.mb_set_off_threshold, livePtr, offThreshold)
  }

  /** OpenXRAnalogThresholdModifier.get_off_threshold */
  final def getOffThreshold(): Double = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_get_off_threshold == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_get_off_threshold = MethodBind.get("OpenXRAnalogThresholdModifier", "get_off_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRAnalogThresholdModifier.mb_get_off_threshold, livePtr)
  }

  /** OpenXRAnalogThresholdModifier.set_on_haptic */
  final def setOnHaptic(haptic: OpenXRHapticBase): Unit = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_set_on_haptic == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_set_on_haptic = MethodBind.get("OpenXRAnalogThresholdModifier", "set_on_haptic", 2998020150L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAnalogThresholdModifier.mb_set_on_haptic, livePtr, Wrappers.handle(haptic))
  }

  /** OpenXRAnalogThresholdModifier.get_on_haptic. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOnHaptic(): OpenXRHapticBase = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_get_on_haptic == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_get_on_haptic = MethodBind.get("OpenXRAnalogThresholdModifier", "get_on_haptic", 922310751L)
    Wrappers.owned[OpenXRHapticBase](Ptrcall.call0[Long](gdext.classes.OpenXRAnalogThresholdModifier.mb_get_on_haptic, livePtr))
  }

  /** OpenXRAnalogThresholdModifier.set_off_haptic */
  final def setOffHaptic(haptic: OpenXRHapticBase): Unit = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_set_off_haptic == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_set_off_haptic = MethodBind.get("OpenXRAnalogThresholdModifier", "set_off_haptic", 2998020150L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAnalogThresholdModifier.mb_set_off_haptic, livePtr, Wrappers.handle(haptic))
  }

  /** OpenXRAnalogThresholdModifier.get_off_haptic. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOffHaptic(): OpenXRHapticBase = {
    if (gdext.classes.OpenXRAnalogThresholdModifier.mb_get_off_haptic == null) gdext.classes.OpenXRAnalogThresholdModifier.mb_get_off_haptic = MethodBind.get("OpenXRAnalogThresholdModifier", "get_off_haptic", 922310751L)
    Wrappers.owned[OpenXRHapticBase](Ptrcall.call0[Long](gdext.classes.OpenXRAnalogThresholdModifier.mb_get_off_haptic, livePtr))
  }

}

object OpenXRAnalogThresholdModifier {
  private[classes] var mb_set_on_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_on_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_off_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_off_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_on_haptic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_on_haptic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_off_haptic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_off_haptic: GDExtensionMethodBindPtr = null
}
