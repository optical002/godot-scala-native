package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasModulate`, extends `Node2D`. */
abstract class CanvasModulate extends Node2D {

  /** CanvasModulate.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasModulate", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** CanvasModulate.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CanvasModulate", "get_color", 3444240500L), hostObject.objectPtr)

}

object CanvasModulate {
  /** Class metadata for Gd[CanvasModulate] lifetime management and casting. */
  given GodotClass[CanvasModulate] with {
    def className = "CanvasModulate"
    def isRefCounted = false
    def wrap(o: GodotObject): CanvasModulate = new CanvasModulate {}.withHost(o.objectPtr)
    def unwrap(t: CanvasModulate): GodotObject = t.hostObject
  }
}
