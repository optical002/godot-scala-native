package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `WorldBoundaryShape3D`, extends `Shape3D`. */
abstract class WorldBoundaryShape3D extends Shape3D {
  override def godotClassName: String = "WorldBoundaryShape3D"

  /** WorldBoundaryShape3D.set_plane */
  final def setPlane(plane: gdext.builtin.Plane): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorldBoundaryShape3D", "set_plane", 3505987427L), hostObject.objectPtr, plane)

  /** WorldBoundaryShape3D.get_plane */
  final def getPlane(): gdext.builtin.Plane =
    Ptrcall.call0[gdext.builtin.Plane](MethodBind.get("WorldBoundaryShape3D", "get_plane", 2753500971L), hostObject.objectPtr)

}
