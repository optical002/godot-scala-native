package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGCylinder3D`, extends `CSGPrimitive3D`. */
abstract class CSGCylinder3D extends CSGPrimitive3D {

  /** CSGCylinder3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGCylinder3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** CSGCylinder3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGCylinder3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** CSGCylinder3D.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGCylinder3D", "set_height", 373806689L), hostObject.objectPtr, height)

  /** CSGCylinder3D.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("CSGCylinder3D", "get_height", 1740695150L), hostObject.objectPtr)

  /** CSGCylinder3D.set_sides */
  final def setSides(sides: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGCylinder3D", "set_sides", 1286410249L), hostObject.objectPtr, sides)

  /** CSGCylinder3D.get_sides */
  final def getSides(): Long =
    Ptrcall.call0[Long](MethodBind.get("CSGCylinder3D", "get_sides", 3905245786L), hostObject.objectPtr)

  /** CSGCylinder3D.set_cone */
  final def setCone(cone: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGCylinder3D", "set_cone", 2586408642L), hostObject.objectPtr, cone)

  /** CSGCylinder3D.is_cone */
  final def isCone(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGCylinder3D", "is_cone", 36873697L), hostObject.objectPtr)

  /** CSGCylinder3D.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGCylinder3D", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CSGCylinder3D.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGCylinder3D", "get_material", 5934680L), hostObject.objectPtr)

  /** CSGCylinder3D.set_smooth_faces */
  final def setSmoothFaces(smooth_faces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGCylinder3D", "set_smooth_faces", 2586408642L), hostObject.objectPtr, smooth_faces)

  /** CSGCylinder3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGCylinder3D", "get_smooth_faces", 36873697L), hostObject.objectPtr)

}

object CSGCylinder3D {
  /** Class metadata for Gd[CSGCylinder3D] lifetime management and casting. */
  given GodotClass[CSGCylinder3D] with {
    def className = "CSGCylinder3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGCylinder3D = new CSGCylinder3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGCylinder3D): GodotObject = t.hostObject
  }
}
