package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Marker3D`, extends `Node3D`. */
abstract class Marker3D extends Node3D {

  /** Marker3D.set_gizmo_extents */
  final def setGizmoExtents(extents: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Marker3D", "set_gizmo_extents", 373806689L), hostObject.objectPtr, extents)

  /** Marker3D.get_gizmo_extents */
  final def getGizmoExtents(): Double =
    Ptrcall.call0[Double](MethodBind.get("Marker3D", "get_gizmo_extents", 1740695150L), hostObject.objectPtr)

}

object Marker3D {
  /** Class metadata for Gd[Marker3D] lifetime management and casting. */
  given GodotClass[Marker3D] with {
    def className = "Marker3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Marker3D = new Marker3D {}.withHost(o.objectPtr)
    def unwrap(t: Marker3D): GodotObject = t.hostObject
  }
}
