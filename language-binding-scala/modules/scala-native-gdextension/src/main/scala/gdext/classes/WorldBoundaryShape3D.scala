package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WorldBoundaryShape3D`, extends `Shape3D`. */
abstract class WorldBoundaryShape3D extends Shape3D {
  override def godotClassName: String = "WorldBoundaryShape3D"

  /** WorldBoundaryShape3D.set_plane */
  final def setPlane(plane: gdext.builtin.Plane): Unit = {
    if (gdext.classes.WorldBoundaryShape3D.mb_set_plane == null) gdext.classes.WorldBoundaryShape3D.mb_set_plane = MethodBind.get("WorldBoundaryShape3D", "set_plane", 3505987427L)
    Ptrcall.callVoid1(gdext.classes.WorldBoundaryShape3D.mb_set_plane, livePtr, plane)
  }

  /** WorldBoundaryShape3D.get_plane */
  final def getPlane(): gdext.builtin.Plane = {
    if (gdext.classes.WorldBoundaryShape3D.mb_get_plane == null) gdext.classes.WorldBoundaryShape3D.mb_get_plane = MethodBind.get("WorldBoundaryShape3D", "get_plane", 2753500971L)
    Ptrcall.call0[gdext.builtin.Plane](gdext.classes.WorldBoundaryShape3D.mb_get_plane, livePtr)
  }

}

object WorldBoundaryShape3D {
  private[classes] var mb_set_plane: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plane: GDExtensionMethodBindPtr = null
}
