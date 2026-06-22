package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRCompositionLayerCylinder`, extends `OpenXRCompositionLayer`. */
abstract class OpenXRCompositionLayerCylinder extends OpenXRCompositionLayer {

  /** OpenXRCompositionLayerCylinder.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerCylinder", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** OpenXRCompositionLayerCylinder.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayerCylinder", "get_radius", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayerCylinder.set_aspect_ratio */
  final def setAspectRatio(aspect_ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerCylinder", "set_aspect_ratio", 373806689L), hostObject.objectPtr, aspect_ratio)

  /** OpenXRCompositionLayerCylinder.get_aspect_ratio */
  final def getAspectRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayerCylinder", "get_aspect_ratio", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayerCylinder.set_central_angle */
  final def setCentralAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerCylinder", "set_central_angle", 373806689L), hostObject.objectPtr, angle)

  /** OpenXRCompositionLayerCylinder.get_central_angle */
  final def getCentralAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayerCylinder", "get_central_angle", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayerCylinder.set_fallback_segments */
  final def setFallbackSegments(segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerCylinder", "set_fallback_segments", 1286410249L), hostObject.objectPtr, segments)

  /** OpenXRCompositionLayerCylinder.get_fallback_segments */
  final def getFallbackSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayerCylinder", "get_fallback_segments", 3905245786L), hostObject.objectPtr)

}

object OpenXRCompositionLayerCylinder {
  /** Class metadata for Gd[OpenXRCompositionLayerCylinder] lifetime management and casting. */
  given GodotClass[OpenXRCompositionLayerCylinder] with {
    def className = "OpenXRCompositionLayerCylinder"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRCompositionLayerCylinder = new OpenXRCompositionLayerCylinder {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRCompositionLayerCylinder): GodotObject = t.hostObject
  }
}
