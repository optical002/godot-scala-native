package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PlaceholderMesh`, extends `Mesh`. */
abstract class PlaceholderMesh extends Mesh {
  override def godotClassName: String = "PlaceholderMesh"

  /** PlaceholderMesh.set_aabb */
  final def setAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.PlaceholderMesh.mb_set_aabb == null) gdext.classes.PlaceholderMesh.mb_set_aabb = MethodBind.get("PlaceholderMesh", "set_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.PlaceholderMesh.mb_set_aabb, livePtr, aabb)
  }

}

object PlaceholderMesh {
  private[classes] var mb_set_aabb: GDExtensionMethodBindPtr = null
}
