package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Popup`, extends `Window`. */
abstract class Popup extends Window {

}

object Popup {
  /** Class metadata for Gd[Popup] lifetime management and casting. */
  given GodotClass[Popup] with {
    def className = "Popup"
    def isRefCounted = false
    def wrap(o: GodotObject): Popup = new Popup {}.withHost(o.objectPtr)
    def unwrap(t: Popup): GodotObject = t.hostObject
  }
}
