package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ButtonGroup`, extends `Resource`. */
abstract class ButtonGroup extends Resource {

  /** ButtonGroup.get_pressed_button */
  final def getPressedButton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ButtonGroup", "get_pressed_button", 3886434893L), hostObject.objectPtr)

  /** ButtonGroup.set_allow_unpress */
  final def setAllowUnpress(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ButtonGroup", "set_allow_unpress", 2586408642L), hostObject.objectPtr, enabled)

  /** ButtonGroup.is_allow_unpress */
  final def isAllowUnpress(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ButtonGroup", "is_allow_unpress", 2240911060L), hostObject.objectPtr)

}

object ButtonGroup {
  /** Class metadata for Gd[ButtonGroup] lifetime management and casting. */
  given GodotClass[ButtonGroup] with {
    def className = "ButtonGroup"
    def isRefCounted = true
    def wrap(o: GodotObject): ButtonGroup = new ButtonGroup {}.withHost(o.objectPtr)
    def unwrap(t: ButtonGroup): GodotObject = t.hostObject
  }
}
