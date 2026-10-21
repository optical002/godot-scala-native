package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRCompositionLayerCylinder`, extends `OpenXRCompositionLayer`. */
abstract class OpenXRCompositionLayerCylinder extends OpenXRCompositionLayer {
  override def godotClassName: String = "OpenXRCompositionLayerCylinder"

  /** OpenXRCompositionLayerCylinder.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_set_radius == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_set_radius = MethodBind.get("OpenXRCompositionLayerCylinder", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerCylinder.mb_set_radius, livePtr, radius)
  }

  /** OpenXRCompositionLayerCylinder.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_get_radius == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_get_radius = MethodBind.get("OpenXRCompositionLayerCylinder", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayerCylinder.mb_get_radius, livePtr)
  }

  /** OpenXRCompositionLayerCylinder.set_aspect_ratio */
  final def setAspectRatio(aspect_ratio: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_set_aspect_ratio == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_set_aspect_ratio = MethodBind.get("OpenXRCompositionLayerCylinder", "set_aspect_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerCylinder.mb_set_aspect_ratio, livePtr, aspect_ratio)
  }

  /** OpenXRCompositionLayerCylinder.get_aspect_ratio */
  final def getAspectRatio(): Double = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_get_aspect_ratio == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_get_aspect_ratio = MethodBind.get("OpenXRCompositionLayerCylinder", "get_aspect_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayerCylinder.mb_get_aspect_ratio, livePtr)
  }

  /** OpenXRCompositionLayerCylinder.set_central_angle */
  final def setCentralAngle(angle: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_set_central_angle == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_set_central_angle = MethodBind.get("OpenXRCompositionLayerCylinder", "set_central_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerCylinder.mb_set_central_angle, livePtr, angle)
  }

  /** OpenXRCompositionLayerCylinder.get_central_angle */
  final def getCentralAngle(): Double = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_get_central_angle == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_get_central_angle = MethodBind.get("OpenXRCompositionLayerCylinder", "get_central_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayerCylinder.mb_get_central_angle, livePtr)
  }

  /** OpenXRCompositionLayerCylinder.set_fallback_segments */
  final def setFallbackSegments(segments: Long): Unit = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_set_fallback_segments == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_set_fallback_segments = MethodBind.get("OpenXRCompositionLayerCylinder", "set_fallback_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerCylinder.mb_set_fallback_segments, livePtr, segments)
  }

  /** OpenXRCompositionLayerCylinder.get_fallback_segments */
  final def getFallbackSegments(): Long = {
    if (gdext.classes.OpenXRCompositionLayerCylinder.mb_get_fallback_segments == null) gdext.classes.OpenXRCompositionLayerCylinder.mb_get_fallback_segments = MethodBind.get("OpenXRCompositionLayerCylinder", "get_fallback_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayerCylinder.mb_get_fallback_segments, livePtr)
  }

}

object OpenXRCompositionLayerCylinder {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_aspect_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aspect_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_central_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_central_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_segments: GDExtensionMethodBindPtr = null
}
