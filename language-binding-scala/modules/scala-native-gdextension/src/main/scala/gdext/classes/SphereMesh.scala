package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SphereMesh`, extends `PrimitiveMesh`. */
abstract class SphereMesh extends PrimitiveMesh {

  /** SphereMesh.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereMesh", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** SphereMesh.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("SphereMesh", "get_radius", 1740695150L), hostObject.objectPtr)

  /** SphereMesh.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereMesh", "set_height", 373806689L), hostObject.objectPtr, height)

  /** SphereMesh.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("SphereMesh", "get_height", 1740695150L), hostObject.objectPtr)

  /** SphereMesh.set_radial_segments */
  final def setRadialSegments(radial_segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereMesh", "set_radial_segments", 1286410249L), hostObject.objectPtr, radial_segments)

  /** SphereMesh.get_radial_segments */
  final def getRadialSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("SphereMesh", "get_radial_segments", 3905245786L), hostObject.objectPtr)

  /** SphereMesh.set_rings */
  final def setRings(rings: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereMesh", "set_rings", 1286410249L), hostObject.objectPtr, rings)

  /** SphereMesh.get_rings */
  final def getRings(): Long =
    Ptrcall.call0[Long](MethodBind.get("SphereMesh", "get_rings", 3905245786L), hostObject.objectPtr)

  /** SphereMesh.set_is_hemisphere */
  final def setIsHemisphere(is_hemisphere: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereMesh", "set_is_hemisphere", 2586408642L), hostObject.objectPtr, is_hemisphere)

  /** SphereMesh.get_is_hemisphere */
  final def getIsHemisphere(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SphereMesh", "get_is_hemisphere", 36873697L), hostObject.objectPtr)

}

object SphereMesh {
  /** Class metadata for Gd[SphereMesh] lifetime management and casting. */
  given GodotClass[SphereMesh] with {
    def className = "SphereMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): SphereMesh = new SphereMesh {}.withHost(o.objectPtr)
    def unwrap(t: SphereMesh): GodotObject = t.hostObject
  }
}
