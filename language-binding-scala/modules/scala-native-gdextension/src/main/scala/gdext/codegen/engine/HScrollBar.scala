package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `HScrollBar`, extends `ScrollBar`. */
abstract class HScrollBar extends ScrollBar {

}

object HScrollBar {
  /** Class metadata for Gd[HScrollBar] lifetime management and casting. */
  given GodotClass[HScrollBar] with {
    def className = "HScrollBar"
    def isRefCounted = false
    def wrap(o: GodotObject): HScrollBar = new HScrollBar {}.withHost(o.objectPtr)
    def unwrap(t: HScrollBar): GodotObject = t.hostObject
  }
}
