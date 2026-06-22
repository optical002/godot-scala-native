package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Container`, extends `Control`. */
abstract class Container extends Control {

  /** Container.queue_sort */
  final def queueSort(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Container", "queue_sort", 3218959716L), hostObject.objectPtr)

  /** Container.fit_child_in_rect */
  final def fitChildInRect(child: Control, rect: gdext.builtin.Rect2): Unit =
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
