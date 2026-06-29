package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `BoxShape3D`, extends `Shape3D`. */
abstract class BoxShape3D extends Shape3D {
  override def godotClassName: String = "BoxShape3D"

  /** BoxShape3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxShape3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** BoxShape3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BoxShape3D", "get_size", 3360562783L), hostObject.objectPtr)

}
