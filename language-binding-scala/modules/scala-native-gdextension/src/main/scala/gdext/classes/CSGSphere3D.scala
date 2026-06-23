package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGSphere3D`, extends `CSGPrimitive3D`. */
abstract class CSGSphere3D extends CSGPrimitive3D {

  /** CSGSphere3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGSphere3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** CSGSphere3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGSphere3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** CSGSphere3D.set_radial_segments */
  final def setRadialSegments(radial_segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGSphere3D", "set_radial_segments", 1286410249L), hostObject.objectPtr, radial_segments)

  /** CSGSphere3D.get_radial_segments */
  final def getRadialSegments(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGSphere3D", "get_radial_segments", 3905245786L), hostObject.objectPtr)

  /** CSGSphere3D.set_rings */
  final def setRings(rings: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGSphere3D", "set_rings", 1286410249L), hostObject.objectPtr, rings)

  /** CSGSphere3D.get_rings */
  final def getRings(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGSphere3D", "get_rings", 3905245786L), hostObject.objectPtr)

  /** CSGSphere3D.set_smooth_faces */
  final def setSmoothFaces(smooth_faces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGSphere3D", "set_smooth_faces", 2586408642L), hostObject.objectPtr, smooth_faces)

  /** CSGSphere3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGSphere3D", "get_smooth_faces", 36873697L), hostObject.objectPtr)

  /** CSGSphere3D.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGSphere3D", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CSGSphere3D.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGSphere3D", "get_material", 5934680L), hostObject.objectPtr)

}

object CSGSphere3D {
  /** Class metadata for Gd[CSGSphere3D] lifetime management and casting. */
  given GodotClass[CSGSphere3D] with {
    def className = "CSGSphere3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGSphere3D = new CSGSphere3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGSphere3D): GodotObject = t.hostObject
  }
}
