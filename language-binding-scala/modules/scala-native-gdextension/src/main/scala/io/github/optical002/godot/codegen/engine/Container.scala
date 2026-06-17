package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Container`, extends `Control`. */
abstract class Container extends Control {

  /** Container.queue_sort */
  final def queueSort(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Container", "queue_sort", 3218959716L), hostObject.objectPtr)

  /** Container.fit_child_in_rect */
  final def fitChildInRect(child: Control, rect: io.github.optical002.godot.builtin.Rect2): Unit =
    Ptrcall.callVoid2(MethodBind.get("Container", "fit_child_in_rect", 1993438598L), hostObject.objectPtr, child.hostObject, rect)

}

object Container {
  /** Class metadata for Gd[Container] lifetime management and casting. */
  given GodotClass[Container] with {
    def className = "Container"
    def isRefCounted = false
    def wrap(o: GodotObject): Container = new Container {}.withHost(o.objectPtr)
    def unwrap(t: Container): GodotObject = t.hostObject
  }
}
