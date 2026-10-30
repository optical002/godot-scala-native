package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CapsuleMesh`, extends `PrimitiveMesh`. */
abstract class CapsuleMesh extends PrimitiveMesh {
  override def godotClassName: String = "CapsuleMesh"

  /** CapsuleMesh.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.CapsuleMesh.mb_set_radius == null) gdext.classes.CapsuleMesh.mb_set_radius = MethodBind.get("CapsuleMesh", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleMesh.mb_set_radius, livePtr, radius)
  }

  /** CapsuleMesh.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.CapsuleMesh.mb_get_radius == null) gdext.classes.CapsuleMesh.mb_get_radius = MethodBind.get("CapsuleMesh", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleMesh.mb_get_radius, livePtr)
  }

  /** CapsuleMesh.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.CapsuleMesh.mb_set_height == null) gdext.classes.CapsuleMesh.mb_set_height = MethodBind.get("CapsuleMesh", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleMesh.mb_set_height, livePtr, height)
  }

  /** CapsuleMesh.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.CapsuleMesh.mb_get_height == null) gdext.classes.CapsuleMesh.mb_get_height = MethodBind.get("CapsuleMesh", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleMesh.mb_get_height, livePtr)
  }

  /** CapsuleMesh.set_radial_segments */
  final def setRadialSegments(segments: Long): Unit = {
    if (gdext.classes.CapsuleMesh.mb_set_radial_segments == null) gdext.classes.CapsuleMesh.mb_set_radial_segments = MethodBind.get("CapsuleMesh", "set_radial_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CapsuleMesh.mb_set_radial_segments, livePtr, segments)
  }

  /** CapsuleMesh.get_radial_segments */
  final def getRadialSegments(): Long = {
    if (gdext.classes.CapsuleMesh.mb_get_radial_segments == null) gdext.classes.CapsuleMesh.mb_get_radial_segments = MethodBind.get("CapsuleMesh", "get_radial_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CapsuleMesh.mb_get_radial_segments, livePtr)
  }

  /** CapsuleMesh.set_rings */
  final def setRings(rings: Long): Unit = {
    if (gdext.classes.CapsuleMesh.mb_set_rings == null) gdext.classes.CapsuleMesh.mb_set_rings = MethodBind.get("CapsuleMesh", "set_rings", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CapsuleMesh.mb_set_rings, livePtr, rings)
  }

  /** CapsuleMesh.get_rings */
  final def getRings(): Long = {
    if (gdext.classes.CapsuleMesh.mb_get_rings == null) gdext.classes.CapsuleMesh.mb_get_rings = MethodBind.get("CapsuleMesh", "get_rings", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CapsuleMesh.mb_get_rings, livePtr)
  }

}

object CapsuleMesh {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rings: GDExtensionMethodBindPtr = null
}
