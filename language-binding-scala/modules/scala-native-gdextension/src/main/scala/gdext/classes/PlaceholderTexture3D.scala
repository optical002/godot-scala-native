package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PlaceholderTexture3D`, extends `Texture3D`. */
abstract class PlaceholderTexture3D extends Texture3D {
  override def godotClassName: String = "PlaceholderTexture3D"

  /** PlaceholderTexture3D.set_size */
  final def setSize(size: gdext.builtin.Vector3i): Unit = {
    if (gdext.classes.PlaceholderTexture3D.mb_set_size == null) gdext.classes.PlaceholderTexture3D.mb_set_size = MethodBind.get("PlaceholderTexture3D", "set_size", 560364750L)
    Ptrcall.callVoid1(gdext.classes.PlaceholderTexture3D.mb_set_size, livePtr, size)
  }

  /** PlaceholderTexture3D.get_size */
  final def getSize(): gdext.builtin.Vector3i = {
    if (gdext.classes.PlaceholderTexture3D.mb_get_size == null) gdext.classes.PlaceholderTexture3D.mb_get_size = MethodBind.get("PlaceholderTexture3D", "get_size", 2785653706L)
    Ptrcall.call0[gdext.builtin.Vector3i](gdext.classes.PlaceholderTexture3D.mb_get_size, livePtr)
  }

}

object PlaceholderTexture3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
