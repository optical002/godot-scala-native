package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CylinderMesh`, extends `PrimitiveMesh`. */
abstract class CylinderMesh extends PrimitiveMesh {

  /** CylinderMesh.set_top_radius */
  final def setTopRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderMesh", "set_top_radius", 373806689L), hostObject.objectPtr, radius)

  /** CylinderMesh.get_top_radius */
  final def getTopRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CylinderMesh", "get_top_radius", 1740695150L), hostObject.objectPtr)

  /** CylinderMesh.set_bottom_radius */
  final def setBottomRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderMesh", "set_bottom_radius", 373806689L), hostObject.objectPtr, radius)

  /** CylinderMesh.get_bottom_radius */
  final def getBottomRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CylinderMesh", "get_bottom_radius", 1740695150L), hostObject.objectPtr)

  /** CylinderMesh.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderMesh", "set_height", 373806689L), hostObject.objectPtr, height)

  /** CylinderMesh.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("CylinderMesh", "get_height", 1740695150L), hostObject.objectPtr)

  /** CylinderMesh.set_radial_segments */
  final def setRadialSegments(segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderMesh", "set_radial_segments", 1286410249L), hostObject.objectPtr, segments)

  /** CylinderMesh.get_radial_segments */
  final def getRadialSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("CylinderMesh", "get_radial_segments", 3905245786L), hostObject.objectPtr)

  /** CylinderMesh.set_rings */
  final def setRings(rings: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderMesh", "set_rings", 1286410249L), hostObject.objectPtr, rings)

  /** CylinderMesh.get_rings */
  final def getRings(): Long =
    Ptrcall.call0[Long](MethodBind.get("CylinderMesh", "get_rings", 3905245786L), hostObject.objectPtr)

  /** CylinderMesh.set_cap_top */
  final def setCapTop(cap_top: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderMesh", "set_cap_top", 2586408642L), hostObject.objectPtr, cap_top)

  /** CylinderMesh.is_cap_top */
  final def isCapTop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CylinderMesh", "is_cap_top", 36873697L), hostObject.objectPtr)

  /** CylinderMesh.set_cap_bottom */
  final def setCapBottom(cap_bottom: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderMesh", "set_cap_bottom", 2586408642L), hostObject.objectPtr, cap_bottom)

  /** CylinderMesh.is_cap_bottom */
  final def isCapBottom(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CylinderMesh", "is_cap_bottom", 36873697L), hostObject.objectPtr)

}

object CylinderMesh {
  /** Class metadata for Gd[CylinderMesh] lifetime management and casting. */
  given GodotClass[CylinderMesh] with {
    def className = "CylinderMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): CylinderMesh = new CylinderMesh {}.withHost(o.objectPtr)
    def unwrap(t: CylinderMesh): GodotObject = t.hostObject
  }
}
