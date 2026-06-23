package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MobileVRInterface`, extends `XRInterface`. */
abstract class MobileVRInterface extends XRInterface {

  /** MobileVRInterface.set_eye_height */
  final def setEyeHeight(eye_height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_eye_height", 373806689L), hostObject.objectPtr, eye_height)

  /** MobileVRInterface.get_eye_height */
  final def getEyeHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_eye_height", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_iod */
  final def setIod(iod: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_iod", 373806689L), hostObject.objectPtr, iod)

  /** MobileVRInterface.get_iod */
  final def getIod(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_iod", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_display_width */
  final def setDisplayWidth(display_width: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_display_width", 373806689L), hostObject.objectPtr, display_width)

  /** MobileVRInterface.get_display_width */
  final def getDisplayWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_display_width", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_display_to_lens */
  final def setDisplayToLens(display_to_lens: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_display_to_lens", 373806689L), hostObject.objectPtr, display_to_lens)

  /** MobileVRInterface.get_display_to_lens */
  final def getDisplayToLens(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_display_to_lens", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_offset_rect */
  final def setOffsetRect(offset_rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_offset_rect", 2046264180L), hostObject.objectPtr, offset_rect)

  /** MobileVRInterface.get_offset_rect */
  final def getOffsetRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("MobileVRInterface", "get_offset_rect", 1639390495L), hostObject.objectPtr)

  /** MobileVRInterface.set_oversample */
  final def setOversample(oversample: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_oversample", 373806689L), hostObject.objectPtr, oversample)

  /** MobileVRInterface.get_oversample */
  final def getOversample(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_oversample", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_k1 */
  final def setK1(k: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_k1", 373806689L), hostObject.objectPtr, k)

  /** MobileVRInterface.get_k1 */
  final def getK1(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_k1", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_k2 */
  final def setK2(k: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_k2", 373806689L), hostObject.objectPtr, k)

  /** MobileVRInterface.get_k2 */
  final def getK2(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_k2", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.get_vrs_min_radius */
  final def getVrsMinRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_vrs_min_radius", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_vrs_min_radius */
  final def setVrsMinRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_vrs_min_radius", 373806689L), hostObject.objectPtr, radius)

  /** MobileVRInterface.get_vrs_strength */
  final def getVrsStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("MobileVRInterface", "get_vrs_strength", 1740695150L), hostObject.objectPtr)

  /** MobileVRInterface.set_vrs_strength */
  final def setVrsStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MobileVRInterface", "set_vrs_strength", 373806689L), hostObject.objectPtr, strength)

}

object MobileVRInterface {
  /** Class metadata for Gd[MobileVRInterface] lifetime management and casting. */
  given GodotClass[MobileVRInterface] with {
    def className = "MobileVRInterface"
    def isRefCounted = true
    def wrap(o: GodotObject): MobileVRInterface = new MobileVRInterface {}.withHost(o.objectPtr)
    def unwrap(t: MobileVRInterface): GodotObject = t.hostObject
  }
}
