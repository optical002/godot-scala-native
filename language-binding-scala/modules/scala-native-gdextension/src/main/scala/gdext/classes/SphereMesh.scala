package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SphereMesh`, extends `PrimitiveMesh`. */
abstract class SphereMesh extends PrimitiveMesh {
  override def godotClassName: String = "SphereMesh"

  /** SphereMesh.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.SphereMesh.mb_set_radius == null) gdext.classes.SphereMesh.mb_set_radius = MethodBind.get("SphereMesh", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SphereMesh.mb_set_radius, livePtr, radius)
  }

  /** SphereMesh.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.SphereMesh.mb_get_radius == null) gdext.classes.SphereMesh.mb_get_radius = MethodBind.get("SphereMesh", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SphereMesh.mb_get_radius, livePtr)
  }

  /** SphereMesh.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.SphereMesh.mb_set_height == null) gdext.classes.SphereMesh.mb_set_height = MethodBind.get("SphereMesh", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SphereMesh.mb_set_height, livePtr, height)
  }

  /** SphereMesh.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.SphereMesh.mb_get_height == null) gdext.classes.SphereMesh.mb_get_height = MethodBind.get("SphereMesh", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SphereMesh.mb_get_height, livePtr)
  }

  /** SphereMesh.set_radial_segments */
  final def setRadialSegments(radialSegments: Long): Unit = {
    if (gdext.classes.SphereMesh.mb_set_radial_segments == null) gdext.classes.SphereMesh.mb_set_radial_segments = MethodBind.get("SphereMesh", "set_radial_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SphereMesh.mb_set_radial_segments, livePtr, radialSegments)
  }

  /** SphereMesh.get_radial_segments */
  final def getRadialSegments(): Long = {
    if (gdext.classes.SphereMesh.mb_get_radial_segments == null) gdext.classes.SphereMesh.mb_get_radial_segments = MethodBind.get("SphereMesh", "get_radial_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SphereMesh.mb_get_radial_segments, livePtr)
  }

  /** SphereMesh.set_rings */
  final def setRings(rings: Long): Unit = {
    if (gdext.classes.SphereMesh.mb_set_rings == null) gdext.classes.SphereMesh.mb_set_rings = MethodBind.get("SphereMesh", "set_rings", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SphereMesh.mb_set_rings, livePtr, rings)
  }

  /** SphereMesh.get_rings */
  final def getRings(): Long = {
    if (gdext.classes.SphereMesh.mb_get_rings == null) gdext.classes.SphereMesh.mb_get_rings = MethodBind.get("SphereMesh", "get_rings", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SphereMesh.mb_get_rings, livePtr)
  }

  /** SphereMesh.set_is_hemisphere */
  final def setIsHemisphere(isHemisphere: Boolean): Unit = {
    if (gdext.classes.SphereMesh.mb_set_is_hemisphere == null) gdext.classes.SphereMesh.mb_set_is_hemisphere = MethodBind.get("SphereMesh", "set_is_hemisphere", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SphereMesh.mb_set_is_hemisphere, livePtr, isHemisphere)
  }

  /** SphereMesh.get_is_hemisphere */
  final def getIsHemisphere(): Boolean = {
    if (gdext.classes.SphereMesh.mb_get_is_hemisphere == null) gdext.classes.SphereMesh.mb_get_is_hemisphere = MethodBind.get("SphereMesh", "get_is_hemisphere", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SphereMesh.mb_get_is_hemisphere, livePtr)
  }

}

object SphereMesh {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_is_hemisphere: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_hemisphere: GDExtensionMethodBindPtr = null
}
