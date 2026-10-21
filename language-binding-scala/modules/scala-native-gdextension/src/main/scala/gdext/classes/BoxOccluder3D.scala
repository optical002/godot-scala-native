package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoxOccluder3D`, extends `Occluder3D`. */
abstract class BoxOccluder3D extends Occluder3D {
  override def godotClassName: String = "BoxOccluder3D"

  /** BoxOccluder3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.BoxOccluder3D.mb_set_size == null) gdext.classes.BoxOccluder3D.mb_set_size = MethodBind.get("BoxOccluder3D", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.BoxOccluder3D.mb_set_size, livePtr, size)
  }

  /** BoxOccluder3D.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.BoxOccluder3D.mb_get_size == null) gdext.classes.BoxOccluder3D.mb_get_size = MethodBind.get("BoxOccluder3D", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.BoxOccluder3D.mb_get_size, livePtr)
  }

}

object BoxOccluder3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
