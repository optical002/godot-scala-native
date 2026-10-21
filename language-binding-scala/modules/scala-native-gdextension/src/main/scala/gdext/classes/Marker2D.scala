package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Marker2D`, extends `Node2D`. */
abstract class Marker2D extends Node2D {
  override def godotClassName: String = "Marker2D"

  /** Marker2D.set_gizmo_extents */
  final def setGizmoExtents(extents: Double): Unit = {
    if (gdext.classes.Marker2D.mb_set_gizmo_extents == null) gdext.classes.Marker2D.mb_set_gizmo_extents = MethodBind.get("Marker2D", "set_gizmo_extents", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Marker2D.mb_set_gizmo_extents, livePtr, extents)
  }

  /** Marker2D.get_gizmo_extents */
  final def getGizmoExtents(): Double = {
    if (gdext.classes.Marker2D.mb_get_gizmo_extents == null) gdext.classes.Marker2D.mb_get_gizmo_extents = MethodBind.get("Marker2D", "get_gizmo_extents", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Marker2D.mb_get_gizmo_extents, livePtr)
  }

}

object Marker2D {
  private[classes] var mb_set_gizmo_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gizmo_extents: GDExtensionMethodBindPtr = null
}
