package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TubeTrailMesh`, extends `PrimitiveMesh`. */
abstract class TubeTrailMesh extends PrimitiveMesh {

  /** TubeTrailMesh.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** TubeTrailMesh.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("TubeTrailMesh", "get_radius", 1740695150L), hostObject.objectPtr)

  /** TubeTrailMesh.set_radial_steps */
  final def setRadialSteps(radial_steps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_radial_steps", 1286410249L), hostObject.objectPtr, radial_steps)

  /** TubeTrailMesh.get_radial_steps */
  final def getRadialSteps(): Long =
    Ptrcall.call0[Long](MethodBind.get("TubeTrailMesh", "get_radial_steps", 3905245786L), hostObject.objectPtr)

  /** TubeTrailMesh.set_sections */
  final def setSections(sections: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_sections", 1286410249L), hostObject.objectPtr, sections)

  /** TubeTrailMesh.get_sections */
  final def getSections(): Long =
    Ptrcall.call0[Long](MethodBind.get("TubeTrailMesh", "get_sections", 3905245786L), hostObject.objectPtr)

  /** TubeTrailMesh.set_section_length */
  final def setSectionLength(section_length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_section_length", 373806689L), hostObject.objectPtr, section_length)

  /** TubeTrailMesh.get_section_length */
  final def getSectionLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("TubeTrailMesh", "get_section_length", 1740695150L), hostObject.objectPtr)

  /** TubeTrailMesh.set_section_rings */
  final def setSectionRings(section_rings: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_section_rings", 1286410249L), hostObject.objectPtr, section_rings)

  /** TubeTrailMesh.get_section_rings */
  final def getSectionRings(): Long =
    Ptrcall.call0[Long](MethodBind.get("TubeTrailMesh", "get_section_rings", 3905245786L), hostObject.objectPtr)

  /** TubeTrailMesh.set_cap_top */
  final def setCapTop(cap_top: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_cap_top", 2586408642L), hostObject.objectPtr, cap_top)

  /** TubeTrailMesh.is_cap_top */
  final def isCapTop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TubeTrailMesh", "is_cap_top", 36873697L), hostObject.objectPtr)

  /** TubeTrailMesh.set_cap_bottom */
  final def setCapBottom(cap_bottom: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_cap_bottom", 2586408642L), hostObject.objectPtr, cap_bottom)

  /** TubeTrailMesh.is_cap_bottom */
  final def isCapBottom(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TubeTrailMesh", "is_cap_bottom", 36873697L), hostObject.objectPtr)

  /** TubeTrailMesh.set_curve */
  final def setCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("TubeTrailMesh", "set_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** TubeTrailMesh.get_curve */
  final def getCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TubeTrailMesh", "get_curve", 2460114913L), hostObject.objectPtr)

}

object TubeTrailMesh {
  /** Class metadata for Gd[TubeTrailMesh] lifetime management and casting. */
  given GodotClass[TubeTrailMesh] with {
    def className = "TubeTrailMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): TubeTrailMesh = new TubeTrailMesh {}.withHost(o.objectPtr)
    def unwrap(t: TubeTrailMesh): GodotObject = t.hostObject
  }
}
