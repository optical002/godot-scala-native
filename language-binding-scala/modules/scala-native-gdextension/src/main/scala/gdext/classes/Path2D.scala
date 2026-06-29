package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Path2D`, extends `Node2D`. */
abstract class Path2D extends Node2D {
  override def godotClassName: String = "Path2D"

  /** Path2D.set_curve */
  final def setCurve(curve: Curve2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Path2D", "set_curve", 659985499L), hostObject.objectPtr, curve.hostObject)

  /** Path2D.get_curve */
  final def getCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Path2D", "get_curve", 660369445L), hostObject.objectPtr)

}
