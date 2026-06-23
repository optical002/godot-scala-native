package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VSplitContainer`, extends `SplitContainer`. */
abstract class VSplitContainer extends SplitContainer {

}

object VSplitContainer {
  /** Class metadata for Gd[VSplitContainer] lifetime management and casting. */
  given GodotClass[VSplitContainer] with {
    def className = "VSplitContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): VSplitContainer = new VSplitContainer {}.withHost(o.objectPtr)
    def unwrap(t: VSplitContainer): GodotObject = t.hostObject
  }
}
