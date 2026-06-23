package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Marker2D`, extends `Node2D`. */
abstract class Marker2D extends Node2D {

  /** Marker2D.set_gizmo_extents */
  final def setGizmoExtents(extents: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Marker2D", "set_gizmo_extents", 373806689L), hostObject.objectPtr, extents)

  /** Marker2D.get_gizmo_extents */
  final def getGizmoExtents(): Double =
    Ptrcall.call0[Double](MethodBind.get("Marker2D", "get_gizmo_extents", 1740695150L), hostObject.objectPtr)

}

object Marker2D {
  /** Class metadata for Gd[Marker2D] lifetime management and casting. */
  given GodotClass[Marker2D] with {
    def className = "Marker2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Marker2D = new Marker2D {}.withHost(o.objectPtr)
    def unwrap(t: Marker2D): GodotObject = t.hostObject
  }
}
