package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationPathQueryResult2D`, extends `RefCounted`. */
abstract class NavigationPathQueryResult2D extends RefCounted {

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

object NavigationPathQueryResult2D {
  /** Class metadata for Gd[NavigationPathQueryResult2D] lifetime management and casting. */
  given GodotClass[NavigationPathQueryResult2D] with {
    def className = "NavigationPathQueryResult2D"
    def isRefCounted = true
    def wrap(o: GodotObject): NavigationPathQueryResult2D = new NavigationPathQueryResult2D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationPathQueryResult2D): GodotObject = t.hostObject
  }
}
