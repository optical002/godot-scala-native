package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PopupPanel`, extends `Popup`. */
abstract class PopupPanel extends Popup {

}

object PopupPanel {
  /** Class metadata for Gd[PopupPanel] lifetime management and casting. */
  given GodotClass[PopupPanel] with {
    def className = "PopupPanel"
    def isRefCounted = false
    def wrap(o: GodotObject): PopupPanel = new PopupPanel {}.withHost(o.objectPtr)
    def unwrap(t: PopupPanel): GodotObject = t.hostObject
  }
}
