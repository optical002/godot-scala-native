package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `XRAnchor3D`, extends `XRNode3D`. */
abstract class XRAnchor3D extends XRNode3D {

  /** XRAnchor3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("XRAnchor3D", "get_size", 3360562783L), hostObject.objectPtr)

  /** XRAnchor3D.get_plane */
  final def getPlane(): gdext.builtin.Plane =
    Ptrcall.call0[gdext.builtin.Plane](MethodBind.get("XRAnchor3D", "get_plane", 2753500971L), hostObject.objectPtr)

}

object XRAnchor3D {
  /** Class metadata for Gd[XRAnchor3D] lifetime management and casting. */
  given GodotClass[XRAnchor3D] with {
    def className = "XRAnchor3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRAnchor3D = new XRAnchor3D {}.withHost(o.objectPtr)
    def unwrap(t: XRAnchor3D): GodotObject = t.hostObject
  }
}
