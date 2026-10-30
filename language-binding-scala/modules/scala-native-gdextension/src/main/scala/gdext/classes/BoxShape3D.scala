package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoxShape3D`, extends `Shape3D`. */
abstract class BoxShape3D extends Shape3D {
  override def godotClassName: String = "BoxShape3D"

  /** BoxShape3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.BoxShape3D.mb_set_size == null) gdext.classes.BoxShape3D.mb_set_size = MethodBind.get("BoxShape3D", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.BoxShape3D.mb_set_size, livePtr, size)
  }

  /** BoxShape3D.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.BoxShape3D.mb_get_size == null) gdext.classes.BoxShape3D.mb_get_size = MethodBind.get("BoxShape3D", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.BoxShape3D.mb_get_size, livePtr)
  }

}

object BoxShape3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
