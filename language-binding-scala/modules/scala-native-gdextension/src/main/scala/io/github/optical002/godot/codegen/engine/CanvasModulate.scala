package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasModulate`, extends `Node2D`. */
abstract class CanvasModulate extends Node2D {

  /** CanvasModulate.set_color */
  final def setColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasModulate", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** CanvasModulate.get_color */
  final def getColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CanvasModulate", "get_color", 3444240500L), hostObject.objectPtr)

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
