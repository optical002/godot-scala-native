package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RibbonTrailMesh`, extends `PrimitiveMesh`. */
abstract class RibbonTrailMesh extends PrimitiveMesh {

  /** RibbonTrailMesh.set_size */
  final def setSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RibbonTrailMesh", "set_size", 373806689L), hostObject.objectPtr, size)

  /** RibbonTrailMesh.get_size */
  final def getSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("RibbonTrailMesh", "get_size", 1740695150L), hostObject.objectPtr)

  /** RibbonTrailMesh.set_sections */
  final def setSections(sections: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RibbonTrailMesh", "set_sections", 1286410249L), hostObject.objectPtr, sections)

  /** RibbonTrailMesh.get_sections */
  final def getSections(): Long =
    Ptrcall.call0[Long](MethodBind.get("RibbonTrailMesh", "get_sections", 3905245786L), hostObject.objectPtr)

  /** RibbonTrailMesh.set_section_length */
  final def setSectionLength(section_length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RibbonTrailMesh", "set_section_length", 373806689L), hostObject.objectPtr, section_length)

  /** RibbonTrailMesh.get_section_length */
  final def getSectionLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("RibbonTrailMesh", "get_section_length", 1740695150L), hostObject.objectPtr)

  /** RibbonTrailMesh.set_section_segments */
  final def setSectionSegments(section_segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RibbonTrailMesh", "set_section_segments", 1286410249L), hostObject.objectPtr, section_segments)

  /** RibbonTrailMesh.get_section_segments */
  final def getSectionSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("RibbonTrailMesh", "get_section_segments", 3905245786L), hostObject.objectPtr)

  /** RibbonTrailMesh.set_curve */
  final def setCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("RibbonTrailMesh", "set_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** RibbonTrailMesh.get_curve */
  final def getCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RibbonTrailMesh", "get_curve", 2460114913L), hostObject.objectPtr)

  /** RibbonTrailMesh.set_shape */
  final def setShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RibbonTrailMesh", "set_shape", 1684440262L), hostObject.objectPtr, shape)

  /** RibbonTrailMesh.get_shape */
  final def getShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("RibbonTrailMesh", "get_shape", 1317484155L), hostObject.objectPtr)

}

object RibbonTrailMesh {
  /** Class metadata for Gd[RibbonTrailMesh] lifetime management and casting. */
  given GodotClass[RibbonTrailMesh] with {
    def className = "RibbonTrailMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): RibbonTrailMesh = new RibbonTrailMesh {}.withHost(o.objectPtr)
    def unwrap(t: RibbonTrailMesh): GodotObject = t.hostObject
  }
}
