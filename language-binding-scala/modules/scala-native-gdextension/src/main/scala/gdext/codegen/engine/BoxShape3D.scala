package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `BoxShape3D`, extends `Shape3D`. */
abstract class BoxShape3D extends Shape3D {

  /** BoxShape3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxShape3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** BoxShape3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BoxShape3D", "get_size", 3360562783L), hostObject.objectPtr)

}

object BoxShape3D {
  /** Class metadata for Gd[BoxShape3D] lifetime management and casting. */
  given GodotClass[BoxShape3D] with {
    def className = "BoxShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): BoxShape3D = new BoxShape3D {}.withHost(o.objectPtr)
    def unwrap(t: BoxShape3D): GodotObject = t.hostObject
  }
}
