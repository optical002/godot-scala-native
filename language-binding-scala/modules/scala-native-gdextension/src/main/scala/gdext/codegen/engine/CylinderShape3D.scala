package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CylinderShape3D`, extends `Shape3D`. */
abstract class CylinderShape3D extends Shape3D {

  /** CylinderShape3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderShape3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** CylinderShape3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CylinderShape3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** CylinderShape3D.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CylinderShape3D", "set_height", 373806689L), hostObject.objectPtr, height)

  /** CylinderShape3D.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("CylinderShape3D", "get_height", 1740695150L), hostObject.objectPtr)

}

object CylinderShape3D {
  /** Class metadata for Gd[CylinderShape3D] lifetime management and casting. */
  given GodotClass[CylinderShape3D] with {
    def className = "CylinderShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): CylinderShape3D = new CylinderShape3D {}.withHost(o.objectPtr)
    def unwrap(t: CylinderShape3D): GodotObject = t.hostObject
  }
}
