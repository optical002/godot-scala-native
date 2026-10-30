package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRCompositionLayerEquirect`, extends `OpenXRCompositionLayer`. */
abstract class OpenXRCompositionLayerEquirect extends OpenXRCompositionLayer {
  override def godotClassName: String = "OpenXRCompositionLayerEquirect"

  /** OpenXRCompositionLayerEquirect.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_set_radius == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_set_radius = MethodBind.get("OpenXRCompositionLayerEquirect", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerEquirect.mb_set_radius, livePtr, radius)
  }

  /** OpenXRCompositionLayerEquirect.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_get_radius == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_get_radius = MethodBind.get("OpenXRCompositionLayerEquirect", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayerEquirect.mb_get_radius, livePtr)
  }

  /** OpenXRCompositionLayerEquirect.set_central_horizontal_angle */
  final def setCentralHorizontalAngle(angle: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_set_central_horizontal_angle == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_set_central_horizontal_angle = MethodBind.get("OpenXRCompositionLayerEquirect", "set_central_horizontal_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerEquirect.mb_set_central_horizontal_angle, livePtr, angle)
  }

  /** OpenXRCompositionLayerEquirect.get_central_horizontal_angle */
  final def getCentralHorizontalAngle(): Double = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_get_central_horizontal_angle == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_get_central_horizontal_angle = MethodBind.get("OpenXRCompositionLayerEquirect", "get_central_horizontal_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayerEquirect.mb_get_central_horizontal_angle, livePtr)
  }

  /** OpenXRCompositionLayerEquirect.set_upper_vertical_angle */
  final def setUpperVerticalAngle(angle: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_set_upper_vertical_angle == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_set_upper_vertical_angle = MethodBind.get("OpenXRCompositionLayerEquirect", "set_upper_vertical_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerEquirect.mb_set_upper_vertical_angle, livePtr, angle)
  }

  /** OpenXRCompositionLayerEquirect.get_upper_vertical_angle */
  final def getUpperVerticalAngle(): Double = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_get_upper_vertical_angle == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_get_upper_vertical_angle = MethodBind.get("OpenXRCompositionLayerEquirect", "get_upper_vertical_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayerEquirect.mb_get_upper_vertical_angle, livePtr)
  }

  /** OpenXRCompositionLayerEquirect.set_lower_vertical_angle */
  final def setLowerVerticalAngle(angle: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_set_lower_vertical_angle == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_set_lower_vertical_angle = MethodBind.get("OpenXRCompositionLayerEquirect", "set_lower_vertical_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerEquirect.mb_set_lower_vertical_angle, livePtr, angle)
  }

  /** OpenXRCompositionLayerEquirect.get_lower_vertical_angle */
  final def getLowerVerticalAngle(): Double = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_get_lower_vertical_angle == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_get_lower_vertical_angle = MethodBind.get("OpenXRCompositionLayerEquirect", "get_lower_vertical_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayerEquirect.mb_get_lower_vertical_angle, livePtr)
  }

  /** OpenXRCompositionLayerEquirect.set_fallback_segments */
  final def setFallbackSegments(segments: Long): Unit = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_set_fallback_segments == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_set_fallback_segments = MethodBind.get("OpenXRCompositionLayerEquirect", "set_fallback_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerEquirect.mb_set_fallback_segments, livePtr, segments)
  }

  /** OpenXRCompositionLayerEquirect.get_fallback_segments */
  final def getFallbackSegments(): Long = {
    if (gdext.classes.OpenXRCompositionLayerEquirect.mb_get_fallback_segments == null) gdext.classes.OpenXRCompositionLayerEquirect.mb_get_fallback_segments = MethodBind.get("OpenXRCompositionLayerEquirect", "get_fallback_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayerEquirect.mb_get_fallback_segments, livePtr)
  }

}

object OpenXRCompositionLayerEquirect {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_central_horizontal_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_central_horizontal_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_upper_vertical_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_upper_vertical_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lower_vertical_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lower_vertical_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_segments: GDExtensionMethodBindPtr = null
}
