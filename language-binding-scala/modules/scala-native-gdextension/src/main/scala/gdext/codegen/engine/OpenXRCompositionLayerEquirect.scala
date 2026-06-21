package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRCompositionLayerEquirect`, extends `OpenXRCompositionLayer`. */
abstract class OpenXRCompositionLayerEquirect extends OpenXRCompositionLayer {

  /** OpenXRCompositionLayerEquirect.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerEquirect", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** OpenXRCompositionLayerEquirect.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayerEquirect", "get_radius", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayerEquirect.set_central_horizontal_angle */
  final def setCentralHorizontalAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerEquirect", "set_central_horizontal_angle", 373806689L), hostObject.objectPtr, angle)

  /** OpenXRCompositionLayerEquirect.get_central_horizontal_angle */
  final def getCentralHorizontalAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayerEquirect", "get_central_horizontal_angle", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayerEquirect.set_upper_vertical_angle */
  final def setUpperVerticalAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerEquirect", "set_upper_vertical_angle", 373806689L), hostObject.objectPtr, angle)

  /** OpenXRCompositionLayerEquirect.get_upper_vertical_angle */
  final def getUpperVerticalAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayerEquirect", "get_upper_vertical_angle", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayerEquirect.set_lower_vertical_angle */
  final def setLowerVerticalAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerEquirect", "set_lower_vertical_angle", 373806689L), hostObject.objectPtr, angle)

  /** OpenXRCompositionLayerEquirect.get_lower_vertical_angle */
  final def getLowerVerticalAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayerEquirect", "get_lower_vertical_angle", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayerEquirect.set_fallback_segments */
  final def setFallbackSegments(segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerEquirect", "set_fallback_segments", 1286410249L), hostObject.objectPtr, segments)

  /** OpenXRCompositionLayerEquirect.get_fallback_segments */
  final def getFallbackSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayerEquirect", "get_fallback_segments", 3905245786L), hostObject.objectPtr)

}

object OpenXRCompositionLayerEquirect {
  /** Class metadata for Gd[OpenXRCompositionLayerEquirect] lifetime management and casting. */
  given GodotClass[OpenXRCompositionLayerEquirect] with {
    def className = "OpenXRCompositionLayerEquirect"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRCompositionLayerEquirect = new OpenXRCompositionLayerEquirect {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRCompositionLayerEquirect): GodotObject = t.hostObject
  }
}
