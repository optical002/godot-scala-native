package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `BoxOccluder3D`, extends `Occluder3D`. */
abstract class BoxOccluder3D extends Occluder3D {

  /** BoxOccluder3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxOccluder3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** BoxOccluder3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BoxOccluder3D", "get_size", 3360562783L), hostObject.objectPtr)

}

object BoxOccluder3D {
  /** Class metadata for Gd[BoxOccluder3D] lifetime management and casting. */
  given GodotClass[BoxOccluder3D] with {
    def className = "BoxOccluder3D"
    def isRefCounted = true
    def wrap(o: GodotObject): BoxOccluder3D = new BoxOccluder3D {}.withHost(o.objectPtr)
    def unwrap(t: BoxOccluder3D): GodotObject = t.hostObject
  }
}
