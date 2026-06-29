package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Path3D`, extends `Node3D`. */
abstract class Path3D extends Node3D {
  override def godotClassName: String = "Path3D"

  /** Path3D.set_curve */
  final def setCurve(curve: Curve3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Path3D", "set_curve", 408955118L), hostObject.objectPtr, curve.hostObject)

  /** Path3D.get_curve */
  final def getCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Path3D", "get_curve", 4244715212L), hostObject.objectPtr)

  /** Path3D.set_debug_custom_color */
  final def setDebugCustomColor(debug_custom_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Path3D", "set_debug_custom_color", 2920490490L), hostObject.objectPtr, debug_custom_color)

  /** Path3D.get_debug_custom_color */
  final def getDebugCustomColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Path3D", "get_debug_custom_color", 3444240500L), hostObject.objectPtr)

}
