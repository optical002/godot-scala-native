package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRAnchor3D`, extends `XRNode3D`. */
abstract class XRAnchor3D extends XRNode3D {
  override def godotClassName: String = "XRAnchor3D"

  /** XRAnchor3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("XRAnchor3D", "get_size", 3360562783L), hostObject.objectPtr)

  /** XRAnchor3D.get_plane */
  final def getPlane(): gdext.builtin.Plane =
    Ptrcall.call0[gdext.builtin.Plane](MethodBind.get("XRAnchor3D", "get_plane", 2753500971L), hostObject.objectPtr)

}
