package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `BoxOccluder3D`, extends `Occluder3D`. */
abstract class BoxOccluder3D extends Occluder3D {
  override def godotClassName: String = "BoxOccluder3D"

  /** BoxOccluder3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxOccluder3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** BoxOccluder3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BoxOccluder3D", "get_size", 3360562783L), hostObject.objectPtr)

}
