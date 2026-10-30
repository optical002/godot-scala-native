package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRAnchor3D`, extends `XRNode3D`. */
abstract class XRAnchor3D extends XRNode3D {
  override def godotClassName: String = "XRAnchor3D"

  /** XRAnchor3D.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.XRAnchor3D.mb_get_size == null) gdext.classes.XRAnchor3D.mb_get_size = MethodBind.get("XRAnchor3D", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.XRAnchor3D.mb_get_size, livePtr)
  }

  /** XRAnchor3D.get_plane */
  final def getPlane(): gdext.builtin.Plane = {
    if (gdext.classes.XRAnchor3D.mb_get_plane == null) gdext.classes.XRAnchor3D.mb_get_plane = MethodBind.get("XRAnchor3D", "get_plane", 2753500971L)
    Ptrcall.call0[gdext.builtin.Plane](gdext.classes.XRAnchor3D.mb_get_plane, livePtr)
  }

}

object XRAnchor3D {
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plane: GDExtensionMethodBindPtr = null
}
