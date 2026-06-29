package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `QuadOccluder3D`, extends `Occluder3D`. */
abstract class QuadOccluder3D extends Occluder3D {
  override def godotClassName: String = "QuadOccluder3D"

  /** QuadOccluder3D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("QuadOccluder3D", "set_size", 743155724L), hostObject.objectPtr, size)

  /** QuadOccluder3D.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("QuadOccluder3D", "get_size", 3341600327L), hostObject.objectPtr)

}
