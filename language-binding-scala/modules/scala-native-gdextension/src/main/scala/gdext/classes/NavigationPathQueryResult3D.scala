package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationPathQueryResult3D`, extends `RefCounted`. */
abstract class NavigationPathQueryResult3D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryResult3D"

  /** NavigationPathQueryResult3D.set_path_length */
  final def setPathLength(length: Double): Unit = {
    if (gdext.classes.NavigationPathQueryResult3D.mb_set_path_length == null) gdext.classes.NavigationPathQueryResult3D.mb_set_path_length = MethodBind.get("NavigationPathQueryResult3D", "set_path_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryResult3D.mb_set_path_length, livePtr, length)
  }

  /** NavigationPathQueryResult3D.get_path_length */
  final def getPathLength(): Double = {
    if (gdext.classes.NavigationPathQueryResult3D.mb_get_path_length == null) gdext.classes.NavigationPathQueryResult3D.mb_get_path_length = MethodBind.get("NavigationPathQueryResult3D", "get_path_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPathQueryResult3D.mb_get_path_length, livePtr)
  }

  /** NavigationPathQueryResult3D.reset */
  final def reset(): Unit = {
    if (gdext.classes.NavigationPathQueryResult3D.mb_reset == null) gdext.classes.NavigationPathQueryResult3D.mb_reset = MethodBind.get("NavigationPathQueryResult3D", "reset", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationPathQueryResult3D.mb_reset, livePtr)
  }

}

object NavigationPathQueryResult3D {
  private[classes] var mb_set_path_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset: GDExtensionMethodBindPtr = null
}
