package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TorusMesh`, extends `PrimitiveMesh`. */
abstract class TorusMesh extends PrimitiveMesh {
  override def godotClassName: String = "TorusMesh"

  /** TorusMesh.set_inner_radius */
  final def setInnerRadius(radius: Double): Unit = {
    if (gdext.classes.TorusMesh.mb_set_inner_radius == null) gdext.classes.TorusMesh.mb_set_inner_radius = MethodBind.get("TorusMesh", "set_inner_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TorusMesh.mb_set_inner_radius, livePtr, radius)
  }

  /** TorusMesh.get_inner_radius */
  final def getInnerRadius(): Double = {
    if (gdext.classes.TorusMesh.mb_get_inner_radius == null) gdext.classes.TorusMesh.mb_get_inner_radius = MethodBind.get("TorusMesh", "get_inner_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TorusMesh.mb_get_inner_radius, livePtr)
  }

  /** TorusMesh.set_outer_radius */
  final def setOuterRadius(radius: Double): Unit = {
    if (gdext.classes.TorusMesh.mb_set_outer_radius == null) gdext.classes.TorusMesh.mb_set_outer_radius = MethodBind.get("TorusMesh", "set_outer_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TorusMesh.mb_set_outer_radius, livePtr, radius)
  }

  /** TorusMesh.get_outer_radius */
  final def getOuterRadius(): Double = {
    if (gdext.classes.TorusMesh.mb_get_outer_radius == null) gdext.classes.TorusMesh.mb_get_outer_radius = MethodBind.get("TorusMesh", "get_outer_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TorusMesh.mb_get_outer_radius, livePtr)
  }

  /** TorusMesh.set_rings */
  final def setRings(rings: Long): Unit = {
    if (gdext.classes.TorusMesh.mb_set_rings == null) gdext.classes.TorusMesh.mb_set_rings = MethodBind.get("TorusMesh", "set_rings", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TorusMesh.mb_set_rings, livePtr, rings)
  }

  /** TorusMesh.get_rings */
  final def getRings(): Long = {
    if (gdext.classes.TorusMesh.mb_get_rings == null) gdext.classes.TorusMesh.mb_get_rings = MethodBind.get("TorusMesh", "get_rings", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TorusMesh.mb_get_rings, livePtr)
  }

  /** TorusMesh.set_ring_segments */
  final def setRingSegments(rings: Long): Unit = {
    if (gdext.classes.TorusMesh.mb_set_ring_segments == null) gdext.classes.TorusMesh.mb_set_ring_segments = MethodBind.get("TorusMesh", "set_ring_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TorusMesh.mb_set_ring_segments, livePtr, rings)
  }

  /** TorusMesh.get_ring_segments */
  final def getRingSegments(): Long = {
    if (gdext.classes.TorusMesh.mb_get_ring_segments == null) gdext.classes.TorusMesh.mb_get_ring_segments = MethodBind.get("TorusMesh", "get_ring_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TorusMesh.mb_get_ring_segments, livePtr)
  }

}

object TorusMesh {
  private[classes] var mb_set_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outer_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outer_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ring_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ring_segments: GDExtensionMethodBindPtr = null
}
