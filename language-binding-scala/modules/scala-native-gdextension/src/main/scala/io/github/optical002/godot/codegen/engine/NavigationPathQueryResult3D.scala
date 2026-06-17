package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationPathQueryResult3D`, extends `RefCounted`. */
abstract class NavigationPathQueryResult3D extends RefCounted {

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

object NavigationPathQueryResult3D {
  /** Class metadata for Gd[NavigationPathQueryResult3D] lifetime management and casting. */
  given GodotClass[NavigationPathQueryResult3D] with {
    def className = "NavigationPathQueryResult3D"
    def isRefCounted = true
    def wrap(o: GodotObject): NavigationPathQueryResult3D = new NavigationPathQueryResult3D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationPathQueryResult3D): GodotObject = t.hostObject
  }
}
