package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Path2D`, extends `Node2D`. */
abstract class Path2D extends Node2D {

  /** Path2D.set_curve */
  final def setCurve(curve: Curve2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Path2D", "set_curve", 659985499L), hostObject.objectPtr, curve.hostObject)

  /** Path2D.get_curve */
  final def getCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Path2D", "get_curve", 660369445L), hostObject.objectPtr)

}

object Path2D {
  /** Class metadata for Gd[Path2D] lifetime management and casting. */
  given GodotClass[Path2D] with {
    def className = "Path2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Path2D = new Path2D {}.withHost(o.objectPtr)
    def unwrap(t: Path2D): GodotObject = t.hostObject
  }
}
