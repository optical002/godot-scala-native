package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Marker3D`, extends `Node3D`. */
abstract class Marker3D extends Node3D {
  override def godotClassName: String = "Marker3D"

  /** Marker3D.set_gizmo_extents */
  final def setGizmoExtents(extents: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Marker3D", "set_gizmo_extents", 373806689L), hostObject.objectPtr, extents)

  /** Marker3D.get_gizmo_extents */
  final def getGizmoExtents(): Double =
    Ptrcall.call0[Double](MethodBind.get("Marker3D", "get_gizmo_extents", 1740695150L), hostObject.objectPtr)

}
