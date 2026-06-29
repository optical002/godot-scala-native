package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationPathQueryResult3D`, extends `RefCounted`. */
abstract class NavigationPathQueryResult3D extends RefCounted {
  override def godotClassName: String = "NavigationPathQueryResult3D"

  /** NavigationPathQueryResult3D.set_path_length */
  final def setPathLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPathQueryResult3D", "set_path_length", 373806689L), hostObject.objectPtr, length)

  /** NavigationPathQueryResult3D.get_path_length */
  final def getPathLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPathQueryResult3D", "get_path_length", 1740695150L), hostObject.objectPtr)

  /** NavigationPathQueryResult3D.reset */
  final def reset(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationPathQueryResult3D", "reset", 3218959716L), hostObject.objectPtr)

}
