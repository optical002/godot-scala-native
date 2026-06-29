package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderMesh`, extends `Mesh`. */
abstract class PlaceholderMesh extends Mesh {
  override def godotClassName: String = "PlaceholderMesh"

  /** PlaceholderMesh.set_aabb */
  final def setAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderMesh", "set_aabb", 259215842L), hostObject.objectPtr, aabb)

}
