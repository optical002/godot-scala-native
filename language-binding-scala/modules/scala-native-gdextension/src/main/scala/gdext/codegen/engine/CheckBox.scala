package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CheckBox`, extends `Button`. */
abstract class CheckBox extends Button {

}

object CheckBox {
  /** Class metadata for Gd[CheckBox] lifetime management and casting. */
  given GodotClass[CheckBox] with {
    def className = "CheckBox"
    def isRefCounted = false
    def wrap(o: GodotObject): CheckBox = new CheckBox {}.withHost(o.objectPtr)
    def unwrap(t: CheckBox): GodotObject = t.hostObject
  }
}
