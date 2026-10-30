package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Marker3D`, extends `Node3D`. */
abstract class Marker3D extends Node3D {
  override def godotClassName: String = "Marker3D"

  /** Marker3D.set_gizmo_extents */
  final def setGizmoExtents(extents: Double): Unit = {
    if (gdext.classes.Marker3D.mb_set_gizmo_extents == null) gdext.classes.Marker3D.mb_set_gizmo_extents = MethodBind.get("Marker3D", "set_gizmo_extents", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Marker3D.mb_set_gizmo_extents, livePtr, extents)
  }

  /** Marker3D.get_gizmo_extents */
  final def getGizmoExtents(): Double = {
    if (gdext.classes.Marker3D.mb_get_gizmo_extents == null) gdext.classes.Marker3D.mb_get_gizmo_extents = MethodBind.get("Marker3D", "get_gizmo_extents", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Marker3D.mb_get_gizmo_extents, livePtr)
  }

}

object Marker3D {
  private[classes] var mb_set_gizmo_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gizmo_extents: GDExtensionMethodBindPtr = null
}
