package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisibleOnScreenNotifier2D`, extends `Node2D`. */
abstract class VisibleOnScreenNotifier2D extends Node2D {

  /** VisibleOnScreenNotifier2D.set_rect */
  final def setRect(rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisibleOnScreenNotifier2D", "set_rect", 2046264180L), hostObject.objectPtr, rect)

  /** VisibleOnScreenNotifier2D.get_rect */
  final def getRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("VisibleOnScreenNotifier2D", "get_rect", 1639390495L), hostObject.objectPtr)

  /** VisibleOnScreenNotifier2D.set_show_rect */
  final def setShowRect(show_rect: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisibleOnScreenNotifier2D", "set_show_rect", 2586408642L), hostObject.objectPtr, show_rect)

  /** VisibleOnScreenNotifier2D.is_showing_rect */
  final def isShowingRect(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisibleOnScreenNotifier2D", "is_showing_rect", 36873697L), hostObject.objectPtr)

  /** VisibleOnScreenNotifier2D.is_on_screen */
  final def isOnScreen(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisibleOnScreenNotifier2D", "is_on_screen", 36873697L), hostObject.objectPtr)

}

object VisibleOnScreenNotifier2D {
  /** Class metadata for Gd[VisibleOnScreenNotifier2D] lifetime management and casting. */
  given GodotClass[VisibleOnScreenNotifier2D] with {
    def className = "VisibleOnScreenNotifier2D"
    def isRefCounted = false
    def wrap(o: GodotObject): VisibleOnScreenNotifier2D = new VisibleOnScreenNotifier2D {}.withHost(o.objectPtr)
    def unwrap(t: VisibleOnScreenNotifier2D): GodotObject = t.hostObject
  }
}
