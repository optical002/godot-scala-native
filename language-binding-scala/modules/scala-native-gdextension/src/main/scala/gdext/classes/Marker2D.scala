package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Marker2D`, extends `Node2D`. */
abstract class Marker2D extends Node2D {
  override def godotClassName: String = "Marker2D"

  /** Marker2D.set_gizmo_extents */
  final def setGizmoExtents(extents: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Marker2D", "set_gizmo_extents", 373806689L), hostObject.objectPtr, extents)

  /** Marker2D.get_gizmo_extents */
  final def getGizmoExtents(): Double =
    Ptrcall.call0[Double](MethodBind.get("Marker2D", "get_gizmo_extents", 1740695150L), hostObject.objectPtr)

}
