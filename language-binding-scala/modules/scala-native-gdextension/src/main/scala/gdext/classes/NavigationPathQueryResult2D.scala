package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationPathQueryResult2D`, extends `RefCounted`. */
abstract class NavigationPathQueryResult2D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryResult2D"

  /** NavigationPathQueryResult2D.set_path_length */
  final def setPathLength(length: Double): Unit = {
    if (gdext.classes.NavigationPathQueryResult2D.mb_set_path_length == null) gdext.classes.NavigationPathQueryResult2D.mb_set_path_length = MethodBind.get("NavigationPathQueryResult2D", "set_path_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPathQueryResult2D.mb_set_path_length, livePtr, length)
  }

  /** NavigationPathQueryResult2D.get_path_length */
  final def getPathLength(): Double = {
    if (gdext.classes.NavigationPathQueryResult2D.mb_get_path_length == null) gdext.classes.NavigationPathQueryResult2D.mb_get_path_length = MethodBind.get("NavigationPathQueryResult2D", "get_path_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPathQueryResult2D.mb_get_path_length, livePtr)
  }

  /** NavigationPathQueryResult2D.reset */
  final def reset(): Unit = {
    if (gdext.classes.NavigationPathQueryResult2D.mb_reset == null) gdext.classes.NavigationPathQueryResult2D.mb_reset = MethodBind.get("NavigationPathQueryResult2D", "reset", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationPathQueryResult2D.mb_reset, livePtr)
  }

}

object NavigationPathQueryResult2D {
  private[classes] var mb_set_path_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset: GDExtensionMethodBindPtr = null
}
