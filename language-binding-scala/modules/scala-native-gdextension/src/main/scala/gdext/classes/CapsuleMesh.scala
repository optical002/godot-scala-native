package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CapsuleMesh`, extends `PrimitiveMesh`. */
abstract class CapsuleMesh extends PrimitiveMesh {

  /** CapsuleMesh.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CapsuleMesh", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** CapsuleMesh.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CapsuleMesh", "get_radius", 1740695150L), hostObject.objectPtr)

  /** CapsuleMesh.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CapsuleMesh", "set_height", 373806689L), hostObject.objectPtr, height)

  /** CapsuleMesh.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("CapsuleMesh", "get_height", 1740695150L), hostObject.objectPtr)

  /** CapsuleMesh.set_radial_segments */
  final def setRadialSegments(segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CapsuleMesh", "set_radial_segments", 1286410249L), hostObject.objectPtr, segments)

  /** CapsuleMesh.get_radial_segments */
  final def getRadialSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("CapsuleMesh", "get_radial_segments", 3905245786L), hostObject.objectPtr)

  /** CapsuleMesh.set_rings */
  final def setRings(rings: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CapsuleMesh", "set_rings", 1286410249L), hostObject.objectPtr, rings)

  /** CapsuleMesh.get_rings */
  final def getRings(): Long =
    Ptrcall.call0[Long](MethodBind.get("CapsuleMesh", "get_rings", 3905245786L), hostObject.objectPtr)

}

object CapsuleMesh {
  /** Class metadata for Gd[CapsuleMesh] lifetime management and casting. */
  given GodotClass[CapsuleMesh] with {
    def className = "CapsuleMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): CapsuleMesh = new CapsuleMesh {}.withHost(o.objectPtr)
    def unwrap(t: CapsuleMesh): GodotObject = t.hostObject
  }
}
