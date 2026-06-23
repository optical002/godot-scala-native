package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGTorus3D`, extends `CSGPrimitive3D`. */
abstract class CSGTorus3D extends CSGPrimitive3D {

  /** CSGTorus3D.set_inner_radius */
  final def setInnerRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGTorus3D", "set_inner_radius", 373806689L), hostObject.objectPtr, radius)

  /** CSGTorus3D.get_inner_radius */
  final def getInnerRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGTorus3D", "get_inner_radius", 1740695150L), hostObject.objectPtr)

  /** CSGTorus3D.set_outer_radius */
  final def setOuterRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGTorus3D", "set_outer_radius", 373806689L), hostObject.objectPtr, radius)

  /** CSGTorus3D.get_outer_radius */
  final def getOuterRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGTorus3D", "get_outer_radius", 1740695150L), hostObject.objectPtr)

  /** CSGTorus3D.set_sides */
  final def setSides(sides: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGTorus3D", "set_sides", 1286410249L), hostObject.objectPtr, sides)

  /** CSGTorus3D.get_sides */
  final def getSides(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGTorus3D", "get_sides", 3905245786L), hostObject.objectPtr)

  /** CSGTorus3D.set_ring_sides */
  final def setRingSides(sides: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGTorus3D", "set_ring_sides", 1286410249L), hostObject.objectPtr, sides)

  /** CSGTorus3D.get_ring_sides */
  final def getRingSides(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGTorus3D", "get_ring_sides", 3905245786L), hostObject.objectPtr)

  /** CSGTorus3D.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGTorus3D", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CSGTorus3D.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGTorus3D", "get_material", 5934680L), hostObject.objectPtr)

  /** CSGTorus3D.set_smooth_faces */
  final def setSmoothFaces(smooth_faces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGTorus3D", "set_smooth_faces", 2586408642L), hostObject.objectPtr, smooth_faces)

  /** CSGTorus3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGTorus3D", "get_smooth_faces", 36873697L), hostObject.objectPtr)

}

object CSGTorus3D {
  /** Class metadata for Gd[CSGTorus3D] lifetime management and casting. */
  given GodotClass[CSGTorus3D] with {
    def className = "CSGTorus3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGTorus3D = new CSGTorus3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGTorus3D): GodotObject = t.hostObject
  }
}
