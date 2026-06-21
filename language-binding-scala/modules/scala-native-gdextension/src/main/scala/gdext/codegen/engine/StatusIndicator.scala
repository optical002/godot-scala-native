package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `StatusIndicator`, extends `Node`. */
abstract class StatusIndicator extends Node {

  /** StatusIndicator.set_tooltip */
  final def setTooltip(tooltip: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("StatusIndicator", "set_tooltip", 83702148L), hostObject.objectPtr, tooltip)

  /** StatusIndicator.get_tooltip */
  final def getTooltip(): String =
    Ptrcall.call0[String](MethodBind.get("StatusIndicator", "get_tooltip", 201670096L), hostObject.objectPtr)

  /** StatusIndicator.set_icon */
  final def setIcon(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("StatusIndicator", "set_icon", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** StatusIndicator.get_icon */
  final def getIcon(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StatusIndicator", "get_icon", 3635182373L), hostObject.objectPtr)

  /** StatusIndicator.set_visible */
  final def setVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StatusIndicator", "set_visible", 2586408642L), hostObject.objectPtr, visible)

  /** StatusIndicator.is_visible */
  final def isVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("StatusIndicator", "is_visible", 36873697L), hostObject.objectPtr)

  /** StatusIndicator.get_rect */
  final def getRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("StatusIndicator", "get_rect", 1639390495L), hostObject.objectPtr)

}

object StatusIndicator {
  /** Class metadata for Gd[StatusIndicator] lifetime management and casting. */
  given GodotClass[StatusIndicator] with {
    def className = "StatusIndicator"
    def isRefCounted = false
    def wrap(o: GodotObject): StatusIndicator = new StatusIndicator {}.withHost(o.objectPtr)
    def unwrap(t: StatusIndicator): GodotObject = t.hostObject
  }
}
