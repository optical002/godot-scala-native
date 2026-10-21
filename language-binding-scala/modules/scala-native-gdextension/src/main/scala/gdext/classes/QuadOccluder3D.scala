package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `QuadOccluder3D`, extends `Occluder3D`. */
abstract class QuadOccluder3D extends Occluder3D {
  override def godotClassName: String = "QuadOccluder3D"

  /** QuadOccluder3D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.QuadOccluder3D.mb_set_size == null) gdext.classes.QuadOccluder3D.mb_set_size = MethodBind.get("QuadOccluder3D", "set_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.QuadOccluder3D.mb_set_size, livePtr, size)
  }

  /** QuadOccluder3D.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.QuadOccluder3D.mb_get_size == null) gdext.classes.QuadOccluder3D.mb_get_size = MethodBind.get("QuadOccluder3D", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.QuadOccluder3D.mb_get_size, livePtr)
  }

}

object QuadOccluder3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
