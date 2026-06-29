package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TorusMesh`, extends `PrimitiveMesh`. */
abstract class TorusMesh extends PrimitiveMesh {
  override def godotClassName: String = "TorusMesh"

  /** TorusMesh.set_inner_radius */
  final def setInnerRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TorusMesh", "set_inner_radius", 373806689L), hostObject.objectPtr, radius)

  /** TorusMesh.get_inner_radius */
  final def getInnerRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("TorusMesh", "get_inner_radius", 1740695150L), hostObject.objectPtr)

  /** TorusMesh.set_outer_radius */
  final def setOuterRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TorusMesh", "set_outer_radius", 373806689L), hostObject.objectPtr, radius)

  /** TorusMesh.get_outer_radius */
  final def getOuterRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("TorusMesh", "get_outer_radius", 1740695150L), hostObject.objectPtr)

  /** TorusMesh.set_rings */
  final def setRings(rings: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TorusMesh", "set_rings", 1286410249L), hostObject.objectPtr, rings)

  /** TorusMesh.get_rings */
  final def getRings(): Long =
    Ptrcall.call0[Long](MethodBind.get("TorusMesh", "get_rings", 3905245786L), hostObject.objectPtr)

  /** TorusMesh.set_ring_segments */
  final def setRingSegments(rings: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TorusMesh", "set_ring_segments", 1286410249L), hostObject.objectPtr, rings)

  /** TorusMesh.get_ring_segments */
  final def getRingSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("TorusMesh", "get_ring_segments", 3905245786L), hostObject.objectPtr)

}
