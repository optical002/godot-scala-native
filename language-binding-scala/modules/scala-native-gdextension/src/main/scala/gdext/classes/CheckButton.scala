package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CheckButton`, extends `Button`. */
abstract class CheckButton extends Button {

}

object CheckButton {
  /** Class metadata for Gd[CheckButton] lifetime management and casting. */
  given GodotClass[CheckButton] with {
    def className = "CheckButton"
    def isRefCounted = false
    def wrap(o: GodotObject): CheckButton = new CheckButton {}.withHost(o.objectPtr)
    def unwrap(t: CheckButton): GodotObject = t.hostObject
  }
}
