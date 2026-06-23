package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VScrollBar`, extends `ScrollBar`. */
abstract class VScrollBar extends ScrollBar {

}

object VScrollBar {
  /** Class metadata for Gd[VScrollBar] lifetime management and casting. */
  given GodotClass[VScrollBar] with {
    def className = "VScrollBar"
    def isRefCounted = false
    def wrap(o: GodotObject): VScrollBar = new VScrollBar {}.withHost(o.objectPtr)
    def unwrap(t: VScrollBar): GodotObject = t.hostObject
  }
}
