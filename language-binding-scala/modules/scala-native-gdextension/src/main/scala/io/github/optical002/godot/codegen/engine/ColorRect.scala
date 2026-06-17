package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ColorRect`, extends `Control`. */
abstract class ColorRect extends Control {

  /** ColorRect.set_color */
  final def setColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorRect", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** ColorRect.get_color */
  final def getColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("ColorRect", "get_color", 3444240500L), hostObject.objectPtr)

}

object ColorRect {
  /** Class metadata for Gd[ColorRect] lifetime management and casting. */
  given GodotClass[ColorRect] with {
    def className = "ColorRect"
    def isRefCounted = false
    def wrap(o: GodotObject): ColorRect = new ColorRect {}.withHost(o.objectPtr)
    def unwrap(t: ColorRect): GodotObject = t.hostObject
  }
}
