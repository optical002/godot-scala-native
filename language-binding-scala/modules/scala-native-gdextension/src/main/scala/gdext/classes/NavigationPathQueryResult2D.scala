package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationPathQueryResult2D`, extends `RefCounted`. */
abstract class NavigationPathQueryResult2D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryResult2D"

  /** NavigationPathQueryResult2D.set_path_length */
  final def setPathLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryResult2D", "set_path_length", 373806689L), hostObject.objectPtr, length)

  /** NavigationPathQueryResult2D.get_path_length */
  final def getPathLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryResult2D", "get_path_length", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryResult2D.reset */
  final def reset(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationPathQueryResult2D", "reset", 3218959716L), hostObject.objectPtr)

}
