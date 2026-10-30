package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CylinderMesh`, extends `PrimitiveMesh`. */
abstract class CylinderMesh extends PrimitiveMesh {
  override def godotClassName: String = "CylinderMesh"

  /** CylinderMesh.set_top_radius */
  final def setTopRadius(radius: Double): Unit = {
    if (gdext.classes.CylinderMesh.mb_set_top_radius == null) gdext.classes.CylinderMesh.mb_set_top_radius = MethodBind.get("CylinderMesh", "set_top_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CylinderMesh.mb_set_top_radius, livePtr, radius)
  }

  /** CylinderMesh.get_top_radius */
  final def getTopRadius(): Double = {
    if (gdext.classes.CylinderMesh.mb_get_top_radius == null) gdext.classes.CylinderMesh.mb_get_top_radius = MethodBind.get("CylinderMesh", "get_top_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CylinderMesh.mb_get_top_radius, livePtr)
  }

  /** CylinderMesh.set_bottom_radius */
  final def setBottomRadius(radius: Double): Unit = {
    if (gdext.classes.CylinderMesh.mb_set_bottom_radius == null) gdext.classes.CylinderMesh.mb_set_bottom_radius = MethodBind.get("CylinderMesh", "set_bottom_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CylinderMesh.mb_set_bottom_radius, livePtr, radius)
  }

  /** CylinderMesh.get_bottom_radius */
  final def getBottomRadius(): Double = {
    if (gdext.classes.CylinderMesh.mb_get_bottom_radius == null) gdext.classes.CylinderMesh.mb_get_bottom_radius = MethodBind.get("CylinderMesh", "get_bottom_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CylinderMesh.mb_get_bottom_radius, livePtr)
  }

  /** CylinderMesh.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.CylinderMesh.mb_set_height == null) gdext.classes.CylinderMesh.mb_set_height = MethodBind.get("CylinderMesh", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CylinderMesh.mb_set_height, livePtr, height)
  }

  /** CylinderMesh.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.CylinderMesh.mb_get_height == null) gdext.classes.CylinderMesh.mb_get_height = MethodBind.get("CylinderMesh", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CylinderMesh.mb_get_height, livePtr)
  }

  /** CylinderMesh.set_radial_segments */
  final def setRadialSegments(segments: Long): Unit = {
    if (gdext.classes.CylinderMesh.mb_set_radial_segments == null) gdext.classes.CylinderMesh.mb_set_radial_segments = MethodBind.get("CylinderMesh", "set_radial_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CylinderMesh.mb_set_radial_segments, livePtr, segments)
  }

  /** CylinderMesh.get_radial_segments */
  final def getRadialSegments(): Long = {
    if (gdext.classes.CylinderMesh.mb_get_radial_segments == null) gdext.classes.CylinderMesh.mb_get_radial_segments = MethodBind.get("CylinderMesh", "get_radial_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CylinderMesh.mb_get_radial_segments, livePtr)
  }

  /** CylinderMesh.set_rings */
  final def setRings(rings: Long): Unit = {
    if (gdext.classes.CylinderMesh.mb_set_rings == null) gdext.classes.CylinderMesh.mb_set_rings = MethodBind.get("CylinderMesh", "set_rings", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CylinderMesh.mb_set_rings, livePtr, rings)
  }

  /** CylinderMesh.get_rings */
  final def getRings(): Long = {
    if (gdext.classes.CylinderMesh.mb_get_rings == null) gdext.classes.CylinderMesh.mb_get_rings = MethodBind.get("CylinderMesh", "get_rings", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CylinderMesh.mb_get_rings, livePtr)
  }

  /** CylinderMesh.set_cap_top */
  final def setCapTop(capTop: Boolean): Unit = {
    if (gdext.classes.CylinderMesh.mb_set_cap_top == null) gdext.classes.CylinderMesh.mb_set_cap_top = MethodBind.get("CylinderMesh", "set_cap_top", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CylinderMesh.mb_set_cap_top, livePtr, capTop)
  }

  /** CylinderMesh.is_cap_top */
  final def isCapTop(): Boolean = {
    if (gdext.classes.CylinderMesh.mb_is_cap_top == null) gdext.classes.CylinderMesh.mb_is_cap_top = MethodBind.get("CylinderMesh", "is_cap_top", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CylinderMesh.mb_is_cap_top, livePtr)
  }

  /** CylinderMesh.set_cap_bottom */
  final def setCapBottom(capBottom: Boolean): Unit = {
    if (gdext.classes.CylinderMesh.mb_set_cap_bottom == null) gdext.classes.CylinderMesh.mb_set_cap_bottom = MethodBind.get("CylinderMesh", "set_cap_bottom", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CylinderMesh.mb_set_cap_bottom, livePtr, capBottom)
  }

  /** CylinderMesh.is_cap_bottom */
  final def isCapBottom(): Boolean = {
    if (gdext.classes.CylinderMesh.mb_is_cap_bottom == null) gdext.classes.CylinderMesh.mb_is_cap_bottom = MethodBind.get("CylinderMesh", "is_cap_bottom", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CylinderMesh.mb_is_cap_bottom, livePtr)
  }

}

object CylinderMesh {
  private[classes] var mb_set_top_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_top_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bottom_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bottom_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cap_top: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cap_top: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cap_bottom: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cap_bottom: GDExtensionMethodBindPtr = null
}
